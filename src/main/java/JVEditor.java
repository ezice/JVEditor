/**
 * Main driver class to test concepts. 
 */

import java.awt.GraphicsConfiguration;
import java.util.MissingResourceException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.Info;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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

        /*
		 * Create an Edit/Preferences menu where a user can select the desired MIDI device.
		 */
//		JTextArea textArea = new JTextArea(getMidiDevices(midiInfo));
//		frame.add(textArea);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		frame.setVisible(true);
		
		JV1010 jv1010 = JV1010.getInstance();
		
		try {
			jv1010.getIdentity();
		} catch (MidiUnavailableException | InvalidMidiDataException e) {
			e.printStackTrace();
		}
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

        // ***** create File menu
        JMenu fileMenu = (JMenu) menuBar.add(new JMenu("File"));
        fileMenu.addSeparator();

        fileMenu.add("Open");
        fileMenu.add("Save");
        fileMenu.add("Save As");
        return menuBar;
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
