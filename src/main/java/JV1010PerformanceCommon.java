
public class JV1010PerformanceCommon {
	public enum KeyboardRangeSwitch {
		OFF, ON
	}
	
	public enum KeyboardMode {
		LAYER, SINGLE
	}
	
	public enum ClockSource {
		PERFORMANCE, SYSTEM
	}
	
	String performanceName;
	int efxSource;
	EFXSettings efxSettings;
	int performanceTempo;
	KeyboardRangeSwitch keyboardRangeSwitch;
	int[] voiceReserve = new int[16];
	KeyboardMode keyboardMode;
	ClockSource clockSource;
}
