/**
 * Main driver class to test concepts. 
 */

import java.awt.GraphicsConfiguration;
import java.util.MissingResourceException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.Info;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.SysexMessage;
import javax.sound.midi.Transmitter;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import org.apache.log4j.Logger;

/**
 * @author Rick Huff
 *
 */
public class JVEditor {

	private final static Logger LOG = Logger.getLogger(JVEditor.class);

	// Menus
    private JMenuBar menuBar = null;

    // About Box
    private JDialog aboutBox = null;

    private JFrame frame = null;

    JVEditor() {
		JFrame frame = new JFrame("JVEditor");
        menuBar = createMenus();
        frame.setJMenuBar(menuBar);

        MidiDevice.Info midiInfo[] = MidiSystem.getMidiDeviceInfo();

        /*
		 * Create an Edit/Preferences menu where a user can select the desired MIDI device.
		 */
		JTextArea textArea = new JTextArea(getMidiDevices(midiInfo));
		frame.add(textArea);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		frame.setVisible(true);
		
		MidiDevice jv1010OutputDevice;
		MidiDevice jv1010InputDevice;
		String identity = "";
		
		try {
			jv1010OutputDevice = MidiSystem.getMidiDevice(midiInfo[4]);
			jv1010OutputDevice.open();
			jv1010InputDevice = MidiSystem.getMidiDevice(midiInfo[1]);
			jv1010InputDevice.open();
			identity = getIdentity(jv1010OutputDevice, jv1010InputDevice);
		} catch (MidiUnavailableException | InvalidMidiDataException e) {
			e.printStackTrace();
		}
		
		LOG.info(identity);
    }
    
    /**
     * Get back identifying information about our JV-1010.  This method is really being written to test out our communications.
     * @param jv1010OutputDevice
     * @return
     * @throws MidiUnavailableException
     * @throws InvalidMidiDataException
     */
    private String getIdentity(MidiDevice jv1010OutputDevice, MidiDevice jv1010InputDevice) throws MidiUnavailableException, InvalidMidiDataException {
    	
    	String identity = "";
    	
    	/*
    	 * The receiver/transmitter structure is a little confusing to me.  We have two receivers and one transmitter:
    	 * 1. rec (jv1010Device.getReceiver() is the stream connected to the MIDI in port on the jv1010.
    	 * 2. trans (jv1010Device.getTransmitter() is the stream connected to the MIDI out port on the jv1010.
    	 * 3. identityReceiver (new DumpReceiver()) is the confusing one.  It's there to interpret anything returned from
    	 * the trans stream -- turns out the only way to get data out of a device is to bind a receiver to it.
    	 */
    	/*
    	 * Send the query
    	 */
    	Receiver rec = jv1010OutputDevice.getReceiver();
    	byte[] identityMessageData = {(byte) 0xF0, 0x7E, 0x10, 0x06, 0x01, (byte) 0xF7};
    	SysexMessage message = new SysexMessage();
    	message.setMessage(identityMessageData, identityMessageData.length);
    	rec.send(message, -1);

    	/*
    	 * Get the response
    	 */
    	
    	Transmitter trans = jv1010InputDevice.getTransmitter();
    	Receiver identityReceiver = new DumpReceiver(System.out);
    	trans.setReceiver(identityReceiver);
    	
    	return identity;
	}

	/**
     * Create a frame for JVEDItor to reside in.
     */
    public static JFrame createFrame(GraphicsConfiguration gc) {
        JFrame frame = new JFrame(gc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    private JMenuBar createMenus() {
        JMenuItem mi;
        // ***** create the menubar ****
        JMenuBar menuBar = new JMenuBar();
        menuBar.getAccessibleContext().setAccessibleName(
            getString("MenuBar.accessible_description"));

        // ***** create File menu
        JMenu fileMenu = (JMenu) menuBar.add(new JMenu(getString("FileMenu.file_label")));
        fileMenu.setMnemonic(getMnemonic("FileMenu.file_mnemonic"));
        fileMenu.getAccessibleContext().setAccessibleDescription(getString("FileMenu.accessible_description"));

        fileMenu.addSeparator();

        createMenuItem(fileMenu, "FileMenu.open_label", "FileMenu.open_mnemonic",
                       "FileMenu.open_accessible_description", null);

        createMenuItem(fileMenu, "FileMenu.save_label", "FileMenu.save_mnemonic",
                       "FileMenu.save_accessible_description", null);

        createMenuItem(fileMenu, "FileMenu.save_as_label", "FileMenu.save_as_mnemonic",
                       "FileMenu.save_as_accessible_description", null);
        return menuBar;
	}

    /**
     * Creates a generic menu item
     */
    public JMenuItem createMenuItem(JMenu menu, String label, String mnemonic,
                               String accessibleDescription, Action action) {
        JMenuItem mi = (JMenuItem) menu.add(new JMenuItem(getString(label)));
        mi.setMnemonic(getMnemonic(mnemonic));
        mi.getAccessibleContext().setAccessibleDescription(getString(accessibleDescription));
        mi.addActionListener(action);
        if(action == null) {
            mi.setEnabled(false);
        }
        return mi;
    }

    /**
     * Returns a mnemonic from the resource bundle. Typically used as
     * keyboard shortcuts in menu items.
     */
    public char getMnemonic(String key) {
        return (getString(key)).charAt(0);
    }

    /**
     * This method returns a string from the demo's resource bundle.
     */
    public String getString(String key) {
        String value = null;
        try {
            value = TextAndMnemonicUtils.getTextAndMnemonicString(key);
        } catch (MissingResourceException e) {
            System.out.println("java.util.MissingResourceException: Couldn't find value for: " + key);
        }
        
        if(value == null) {
            value = "Could not find resource: " + key + "  ";
        }
        
        return value;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new JVEditor();
	}
	
	private static String getMidiDevices(Info[] midiInfo) {
		StringBuilder midiDevices = new StringBuilder();
		
		for(MidiDevice.Info info : midiInfo) {
			midiDevices.append(info.getName() + ":" + info.getVendor() + ":" + info.getDescription() + "\n");
			LOG.debug(info.getName() + ":" + info.getVendor() + ":" + info.getDescription());		
		}
		
		return midiDevices.toString();
	}
	
    /**
     * Returns the frame instance
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Creates an icon from an image contained in the "images" directory.
     */
    public ImageIcon createImageIcon(String filename, String description) {
        String path = "/images/" + filename;
        return new ImageIcon(getClass().getResource(path));
    }
}
