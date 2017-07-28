
public class PatchTone {
	public enum WaveGroupType {
		INT, PCM, EXP
	}
	
	public enum ToneDelayMode {
		NORMAL, HOLD, PLAYMATE, CLOCK_SYNC, TAP_SYNC, KEY_OFF_N,
		KEY_OFF_D, TEMPO_SYNC
	}
	
	public enum PanControlSwitch {
		OFF, CONTINUOUS, KEY_ON
	}
	
	boolean toneSwitch;
	WaveGroupType waveGroupType;
	int waveGroupId;
	int waveNumber;
	int waveGain;
	boolean fxmSwitch;
	int fxmColor;
	int fxmDepth;
	ToneDelayMode toneDelayMode;
	int toneDelayTime;
	int velocityCrossFade, velocityRangeLower, velocityRangeUpper, keyboardRangeLower, keyboardRangeUpper;
	boolean redamperControlSwitch, volumeControlSwitch, hold1ControlSwitch, PitchBendControlSwitch;
	PanControlSwitch panControlSwitch;
	
}
