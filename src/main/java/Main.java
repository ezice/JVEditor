/**
 * Main driver class to test concepts. 
 */

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;

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
		
		for(MidiDevice.Info info : midiInfo) {
			LOG.debug(info);		
		}
	}

}
