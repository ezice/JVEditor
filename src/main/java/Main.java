/**
 * Main driver class to test concepts. 
 */

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.Info;
import javax.sound.midi.MidiSystem;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import org.apache.log4j.Logger;

/**
 * @author Rick Huff
 *
 */
public class Main {

	private final static Logger LOG = Logger.getLogger(Main.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MidiDevice.Info midiInfo[] = MidiSystem.getMidiDeviceInfo();
		JFrame frame = new JFrame("JVEditor");
		/*
		 * Create an Edit/Preferences menu where a user can select the desired MIDI device.
		 */
		JTextArea textArea = new JTextArea(getMidiDevices(midiInfo));
		frame.add(textArea);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		frame.setVisible(true);
	}
	
	private static String getMidiDevices(Info[] midiInfo) {
		StringBuilder midiDevices = new StringBuilder();
		
		for(MidiDevice.Info info : midiInfo) {
			midiDevices.append(info.getName() + ":" + info.getDescription() + "\n");
			LOG.debug(info);		
		}
		
		return midiDevices.toString();
	}
}
