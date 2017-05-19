
public class SystemCommon {
	public enum SoundMode {
		PERFORMANCE, PATCH, GM
	}
	
	public enum PerformanceNumber {
		USER01, USER02, USER03, USER04, USER05, USER06, USER07, USER08, USER09, USER10, USER11, USER12, USER13, USER14, USER15, USER16,  
		USER17, USER18, USER19, USER20, USER21, USER22, USER23, USER24, USER25, USER26, USER27, USER28, USER29, USER30, USER31, USER32,  
		CARD01, CARD02, CARD03, CARD04, CARD05, CARD06, CARD07, CARD08, CARD09, CARD10, CARD11, CARD12, CARD13, CARD14, CARD15, CARD16,  
		CARD17, CARD18, CARD19, CARD20, CARD21, CARD22, CARD23, CARD24, CARD25, CARD26, CARD27, CARD28, CARD29, CARD30, CARD31, CARD32,  
		PRA01, PRA02, PRA03, PRA04, PRA05, PRA06, PRA07, PRA08, PRA09, PRA10, PRA11, PRA12, PRA13, PRA14, PRA15, PRA16,  
		PRA17, PRA18, PRA19, PRA20, PRA21, PRA22, PRA23, PRA24, PRA25, PRA26, PRA27, PRA28, PRA29, PRA30, PRA31, PRA32,  
		PRB01, PRB02, PRB03, PRB04, PRB05, PRB06, PRB07, PRB08, PRB09, PRB10, PRB11, PRB12, PRB13, PRB14, PRB15, PRB16,  
		PRB17, PRB18, PRB19, PRB20, PRB21, PRB22, PRB23, PRB24, PRB25, PRB26, PRB27, PRB28, PRB29, PRB30, PRB31, PRB32
	}
	
	public enum PatchGroupType {
		USERPRESET, PCM, EXP
	}
	
	public enum HoldControlSource {
		OFF, HOLD1, SOSTENUTO, HOLD2
	}
	
	public enum VolumeControlSource {
		VOLUME, VOLEXPRESSION
	}
	
	public enum AftertouchSource {
		CHANNEL, POLY, CHANNELPOLY
	}
	
	public enum SystemControlSource {
		CC01, CC02, CC03, CC04, CC05, CC07, CC08, CC09, CC10, CC11, CC12, CC13, CC14, CC15, CC16, CC17, CC18, CC19, CC20, CC21,
		CC22, CC23, CC24, CC25, CC26, CC27, CC28, CC29, CC30, CC31, CC64, CC65, CC66, CC67, CC68, CC69, CC70, CC71, CC72, CC73,
		CC74, CC75, CC76, CC77, CC78, CC79, CC80, CC81, CC82, CC83, CC84, CC85, CC86, CC87, CC88, CC89, CC90, CC91, CC92, CC93,
		CC94, CC95, PITCHBEND, AFTERTOUCH
	}
	
	private SoundMode soundMode;
	private PerformanceNumber performanceNumber;
	private PatchGroupType patchGroupType;
	private int patchGroupId;
	private int patchNumber;
	private int masterTune;
	private boolean scaleTuneSwitch;
	private boolean efxSwitch;
	private boolean chorusSwitch;
	private boolean reverbSwitch;
	private boolean patchRemain;
	private boolean clockSource;
	private HoldControlSource tapControlSource;
	private HoldControlSource holdControlSource;
	private HoldControlSource peakControlSource;
	private VolumeControlSource volumeControlSource;
	private AftertouchSource aftertouchSource;
	private SystemControlSource systemControlSource1, systemControlSource2;
	
}
