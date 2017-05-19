import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.SysexMessage;
import javax.sound.midi.Transmitter;

/**
 * This class handles all of the communication with the synth.  By handling it in a single place, we prevent memory leaks.
 * @author Rick
 *
 */
public class JV1010 {

	private final static JV1010 INSTANCE = new JV1010();
	
	private MidiDevice jv1010OutputDevice;
	private MidiDevice jv1010InputDevice;
	private Receiver sendingReceiver;
	private Transmitter receivingTransmitter;
	private Receiver receivingReceiver;
	
	// JV1010 State
	private JV1010System system;
	private JV1010TemporaryArea temporaryArea;
	private JV1010UserPresets userPresets;
	
	private JV1010 () {
        MidiDevice.Info midiInfo[] = MidiSystem.getMidiDeviceInfo();
        
        try {
			jv1010OutputDevice = MidiSystem.getMidiDevice(midiInfo[4]);
			jv1010OutputDevice.open();
			jv1010InputDevice = MidiSystem.getMidiDevice(midiInfo[1]);
			jv1010InputDevice.open();
	    	sendingReceiver = jv1010OutputDevice.getReceiver();
	    	receivingTransmitter = jv1010InputDevice.getTransmitter();
	    	receivingReceiver = new DumpReceiver(System.out);
	    	receivingTransmitter.setReceiver(receivingReceiver);	    	
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	public static JV1010 getInstance() {
		return INSTANCE;
	}	

    /**
     * Get back identifying information about our JV-1010.  This method is really being written to test out our communications.
     * @param jv1010OutputDevice
     * @return
     * @throws MidiUnavailableException
     * @throws InvalidMidiDataException
     */
    public String getIdentity() throws MidiUnavailableException, InvalidMidiDataException {
    	
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
    	byte[] identityMessageData = {(byte) 0xF0, 0x7E, 0x10, 0x06, 0x01, (byte) 0xF7};
    	SysexMessage message = new SysexMessage();
    	message.setMessage(identityMessageData, identityMessageData.length);
    	sendingReceiver.send(message, -1);

    	/*
    	 * Get the response
    	 */
    	
    	return identity;
	}
}
