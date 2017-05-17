import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.SysexMessage;
import javax.sound.midi.Transmitter;

public class JV1010 {

	private final static JV1010 INSTANCE = new JV1010();
	
	private MidiDevice jv1010OutputDevice;
	private MidiDevice jv1010InputDevice;
	
	private JV1010 () {
        MidiDevice.Info midiInfo[] = MidiSystem.getMidiDeviceInfo();
        
        try {
			jv1010OutputDevice = MidiSystem.getMidiDevice(midiInfo[4]);
			jv1010OutputDevice.open();
			jv1010InputDevice = MidiSystem.getMidiDevice(midiInfo[1]);
			jv1010InputDevice.open();
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
}
