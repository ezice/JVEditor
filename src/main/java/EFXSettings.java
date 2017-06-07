public class EFXSettings {
	public enum EFXOutputAssign {
		MIX, DIRECT1, DIRECT2
	}

	public enum EFXControlSource {
		OFF, SYSCTRL1, SYSCTRL2, MODULATION, BREATH, FOOT, VOLUME, PAN, EXPRESSION, PITCH_BEND, AFTERTOUCH
	}
	
	public enum ChorusOutput {
		MIX, REV, MIX_REV
	}
	
	public enum ReverbType {
		ROOM1, ROOM2, STAGE1, STAGE2, HALL1, HALL2, DELAY, PAN_DLY
	}
	
	public enum ReverbHFDamp {
		D200, D250, D315, D400, D500, D630, D800, D1000, D1250, D1600, D2000, D2500, D3150, D4000, D5000,
		D6300, D8000, BYPASS
	}
	
	int efxType; 
	int[] efxParameters = new int[12];
	EFXOutputAssign efxOutputAssign;
	int efxMixOutSendLevel, efxChorusSendLevel, efxReverbSendLevel;
	EFXControlSource efxControlSource1, efxControlSource2;
	int efxControlDepth1, efxControlDepth2;
	int chorusLevel, chorusRate, chorusDepth, chorusPreDelay, chorusFeedback;
	ChorusOutput chorusOutput;
	ReverbType reverbType;
	int reverbLevel, reverbTime;
	ReverbHFDamp reverbHFDamp;
	int delayFeedback;
}
