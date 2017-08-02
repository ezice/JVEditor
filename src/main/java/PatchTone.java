
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
	
	public enum ControllerDestination {
		OFF, PCH, CUT, RES, LEV, PAN, MIX, CHO, REV, PL1, PL2, FL1, FL2, AL1,
		AL2, pL1, pL2, L1R, L2R
	}
	
	public enum Waveform {
		TRI, SIN, SAW, SQR, TRP, S_H, RND, CHS
	}
	
	public enum FadeMode {
		KEY_ON_IN, KEY_ON_OUT, KEY_OFF_IN, KEY_OFF_OUT
	}
	
	public enum ExternalSync {
		OFF, CLOCK, TAP
	}
	
	public class LFO {
		Waveform waveform;
		boolean keySynch;
		int rate, offset, delayTime;
		FadeMode fadeMode;
		int fadeTime;
		ExternalSync externalSync;
	}
	
	public enum RandomPitchDepth {
		D0, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D20, D30, D40, D50, D60, D70, D80, D90, D100, D200, D300, D400, D500, 
		D600, D700, D800, D900, D1000, D1100, D1200
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
	ControllerDestination[][] controllerDestination = new ControllerDestination[3][4];
	int[][] controllerDepth = new int[3][4];
	LFO[] lfo = new LFO[2];
	int coarseTune, fineTune;
	RandomPitchDepth randomPitchDepth;
}
