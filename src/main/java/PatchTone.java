
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
		RPD0, RPD1, RPD2, RPD3, RPD4, RPD5, RPD6, RPD7, RPD8, RPD9, RPD10, RPD20, RPD30, RPD40, RPD50, RPD60, RPD70, RPD80, RPD90, RPD100, RPD200, RPD300, RPD400, RPD500, 
		RPD600, RPD700, RPD800, RPD900, RPD1000, RPD1100, RPD1200
	}
	
	public enum KeyFollow {
		PKF_100, PKF_70, PKF_50, PKF_30, PKF_10, PKF0, PKF10, PKF20, PKF30, PKF40, PKF50, PKF70, PKF100, PKF120, PKF150, PKF200
	}
	
	public enum OutputAssign {
		MIX, EFX, DIRECT1, DIRECT2
	}
	
	public enum EnvelopeTime {
		ET_100, ET_70, ET_50, ET_40, ET_30, ET_20, ET_10, ET0, ET10, ET20, ET30, ET40, ET50, ET70, ET100
	}
	
	public enum FilterType {
		OFF, LPF, BPF, HPF, PKG
	}

	public enum Envelope {
		int envelopeDepth, envelopeVelocitySensitivity, envelopeTimeKeyFollow;
		int[] envelopeTime = new int[4];
		int[] envelopeLevel = new int[4];
		int[] lFODepth = new int[2];
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
	KeyFollow pitchKeyFollow;
	Envelope pitchEnvelope;
	FilterType filterType;
	int cutoffFrequency;
	KeyFollow cutoffKeyFollow;
	Envelope filterEnvelope;
	
	
	EnvelopeTime pitchEnvelopeVelocityTime1, pitchEnvelopeVelocityTime4;
	int randomPanDepth, alternatePanDepth, panLFO1Depth, panLFO2Depth;
	OutputAssign outputAssign;
}
