
public class PatchCommon {
	public enum VoicePriority {
		LAST, LOUDEST
	}

	public enum ClockSource {
		PATCH, SYSTEM
	}

	public enum PatchCategory {
		NO_ASSIGN, AC_PIANO, EL_PIANO, KEYBOARDS, BELL, MALLET, ORGAN, 
		ACCORDION, HARMONICA, AC_GUITAR, EL_GUITAR, DIST_GUITAR, BASS, 
		SYNTH_BASS, STRINGS, ORCHESTRA, HIT_STAB, WIND, FLUTE, AC_BRASS, 
		SYNTH_BRASS, SAX, HARD_LEAD, SOFT_LEAD, TECHNO_SYNTH, 
		PULSATING, SYNTH_FX, OTHER_SYNTH, BRIGHT_PAD, SOFT_PAD, VOX, 
		PLUCKED, ETHNIC, FRETTED, PERCUSSION, SOUND_FX, BEAT_GROOVE, 
		DRUMS, COMBINATION_00, COMBINATION_01, COMBINATION_02, COMBINATION_03,
		COMBINATION_04, COMBINATION_05, COMBINATION_06, COMBINATION_07, COMBINATION_08,
		COMBINATION_09, COMBINATION_10, COMBINATION_11, COMBINATION_12, COMBINATION_13,
		COMBINATION_14, COMBINATION_15, COMBINATION_16, COMBINATION_17, COMBINATION_18,
		COMBINATION_19, COMBINATION_20, COMBINATION_21, COMBINATION_22, COMBINATION_23,
		COMBINATION_24, COMBINATION_25, COMBINATION_26, COMBINATION_27, COMBINATION_28,
		COMBINATION_29, COMBINATION_30, COMBINATION_31, COMBINATION_32, COMBINATION_33,
		COMBINATION_34, COMBINATION_35, COMBINATION_36, COMBINATION_37, COMBINATION_38,
		COMBINATION_39, COMBINATION_40
	}
	
	String patchName;
	EFXSettings efxSettings;
	int patchTempo, patchLevel, patchPan, analogFeel, bendRangeUp, bendRangeDn;
	boolean keyAssignMode, soloLegato, portamentoSwitch, portamentoMode, portamentoType;
	boolean portamentoStart;
	int portamentoTime;
	PatchControlSource patchControlSource2, patchControlSource3;
	ControlHoldPeak efxControlHoldPeak, control1HoldPeak, control2HoldPeak, control3HoldPeak;
	boolean velocityRangeSwitch;
	int octaveShift, stretchTuneDepth;
	VoicePriority voicePriority;
	int structureType1_2, booster1_2, structureType3_4, booster3_4;
	ClockSource clockSource;
	PatchCategory patchCategory;
}
