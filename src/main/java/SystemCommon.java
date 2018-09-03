
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
	
	public enum HoldControlSource {
		OFF, HOLD1, SOSTENUTO, HOLD2
	}
	
	public enum VolumeControlSource {
		VOLUME, VOLEXPRESSION
	}
	
	public enum AftertouchSource {
		CHANNEL, POLY, CHANNELPOLY
	}
	
	public enum ShortControlList {
		CC01, CC02, CC03, CC04, CC05, CC07, CC08, CC09, CC10, CC11, CC12, CC13, CC14, CC15, CC16, CC17, CC18, CC19, CC20, CC21,
		CC22, CC23, CC24, CC25, CC26, CC27, CC28, CC29, CC30, CC31, CC64, CC65, CC66, CC67, CC68, CC69, CC70, CC71, CC72, CC73,
		CC74, CC75, CC76, CC77, CC78, CC79, CC80, CC81, CC82, CC83, CC84, CC85, CC86, CC87, CC88, CC89, CC90, CC91, CC92, CC93,
		CC94, CC95, PITCHBEND, AFTERTOUCH
	}
	
	public enum RhythmEditSource {
		PANEL, PANELMIDI
	}
	
	public enum PreviewSoundMode {
		SINGLE, CHORD, PHRASE
	}
	
	private enum KeyboardSensitivity {
		LIGHT, MEDIUM, HEAVY
	}
	
	public enum PedalAssign {
		CC01, CC02, CC03, CC04, CC05, CC07, CC08, CC09, CC10, CC11, CC12, CC13, CC14, CC15, CC16, CC17, CC18, CC19, CC20, CC21,
		CC22, CC23, CC24, CC25, CC26, CC27, CC28, CC29, CC30, CC31, CC64, CC65, CC66, CC67, CC68, CC69, CC70, CC71, CC72, CC73,
		CC74, CC75, CC76, CC77, CC78, CC79, CC80, CC81, CC82, CC83, CC84, CC85, CC86, CC87, CC88, CC89, CC90, CC91, CC92, CC93,
		CC94, CC95, PITCHBEND, AFTERTOUCH, PROG_UP, PROG_DOWN, START_STOP, PUNCH_IN_OUT, TAP_TEMPO, OCTAVE_UP, OCTAVE_DOWN 
	}
	
	public enum PedalOutputMode {
		OFF, INT, MIDI, INT_MIDI
	}
	
	public enum PedalPolarity {
		STANDARD, REVERSE
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
	private ShortControlList systemControlSource1, systemControlSource2;
	private boolean receiveProgramChange, receiveBankSelect, teceiveControlChange, receiveModulation, receiveVolume, receiveHold1, receivePitchBend, receiveAftertouch;
	private int controlChannel, patchReceiveChannel;
	private RhythmEditSource rhythmEditSource;
	private PreviewSoundMode previewSoundMode;
	private int previewNoteSet1, PreviewVelocitySet1, previewNoteSet2, PreviewVelocitySet2, previewNoteSet3, PreviewVelocitySet3, previewNoteSet4, PreviewVelocitySet4;
	private boolean transmitProgramChange, transmitBankSelect;
	private int patchTransmitChannel;
	private boolean transposeSwitch;
	private int transposeValue, octaveShift, keyboardVelocity;
	private KeyboardSensitivity keyboardSensitivity;
	private int aftertouchSensitivity;
	private PedalAssign pedal1Assign, pedal2Assign, pedal3Assign, pedal4Assign;
	
	public SoundMode getSoundMode() {
		return soundMode;
	}
	public void setSoundMode(SoundMode soundMode) {
		this.soundMode = soundMode;
	}
	public PerformanceNumber getPerformanceNumber() {
		return performanceNumber;
	}
	public void setPerformanceNumber(PerformanceNumber performanceNumber) {
		this.performanceNumber = performanceNumber;
	}
	public PatchGroupType getPatchGroupType() {
		return patchGroupType;
	}
	public void setPatchGroupType(PatchGroupType patchGroupType) {
		this.patchGroupType = patchGroupType;
	}
	public int getPatchGroupId() {
		return patchGroupId;
	}
	public void setPatchGroupId(int patchGroupId) {
		this.patchGroupId = patchGroupId;
	}
	public int getPatchNumber() {
		return patchNumber;
	}
	public void setPatchNumber(int patchNumber) {
		this.patchNumber = patchNumber;
	}
	public int getMasterTune() {
		return masterTune;
	}
	public void setMasterTune(int masterTune) {
		this.masterTune = masterTune;
	}
	public boolean isScaleTuneSwitch() {
		return scaleTuneSwitch;
	}
	public void setScaleTuneSwitch(boolean scaleTuneSwitch) {
		this.scaleTuneSwitch = scaleTuneSwitch;
	}
	public boolean isEfxSwitch() {
		return efxSwitch;
	}
	public void setEfxSwitch(boolean efxSwitch) {
		this.efxSwitch = efxSwitch;
	}
	public boolean isChorusSwitch() {
		return chorusSwitch;
	}
	public void setChorusSwitch(boolean chorusSwitch) {
		this.chorusSwitch = chorusSwitch;
	}
	public boolean isReverbSwitch() {
		return reverbSwitch;
	}
	public void setReverbSwitch(boolean reverbSwitch) {
		this.reverbSwitch = reverbSwitch;
	}
	public boolean isPatchRemain() {
		return patchRemain;
	}
	public void setPatchRemain(boolean patchRemain) {
		this.patchRemain = patchRemain;
	}
	public boolean isClockSource() {
		return clockSource;
	}
	public void setClockSource(boolean clockSource) {
		this.clockSource = clockSource;
	}
	public HoldControlSource getTapControlSource() {
		return tapControlSource;
	}
	public void setTapControlSource(HoldControlSource tapControlSource) {
		this.tapControlSource = tapControlSource;
	}
	public HoldControlSource getHoldControlSource() {
		return holdControlSource;
	}
	public void setHoldControlSource(HoldControlSource holdControlSource) {
		this.holdControlSource = holdControlSource;
	}
	public HoldControlSource getPeakControlSource() {
		return peakControlSource;
	}
	public void setPeakControlSource(HoldControlSource peakControlSource) {
		this.peakControlSource = peakControlSource;
	}
	public VolumeControlSource getVolumeControlSource() {
		return volumeControlSource;
	}
	public void setVolumeControlSource(VolumeControlSource volumeControlSource) {
		this.volumeControlSource = volumeControlSource;
	}
	public AftertouchSource getAftertouchSource() {
		return aftertouchSource;
	}
	public void setAftertouchSource(AftertouchSource aftertouchSource) {
		this.aftertouchSource = aftertouchSource;
	}
	public ShortControlList getSystemControlSource1() {
		return systemControlSource1;
	}
	public void setSystemControlSource1(ShortControlList systemControlSource1) {
		this.systemControlSource1 = systemControlSource1;
	}
	public ShortControlList getSystemControlSource2() {
		return systemControlSource2;
	}
	public void setSystemControlSource2(ShortControlList systemControlSource2) {
		this.systemControlSource2 = systemControlSource2;
	}
	public boolean isReceiveProgramChange() {
		return receiveProgramChange;
	}
	public void setReceiveProgramChange(boolean receiveProgramChange) {
		this.receiveProgramChange = receiveProgramChange;
	}
	public boolean isReceiveBankSelect() {
		return receiveBankSelect;
	}
	public void setReceiveBankSelect(boolean receiveBankSelect) {
		this.receiveBankSelect = receiveBankSelect;
	}
	public boolean isTeceiveControlChange() {
		return teceiveControlChange;
	}
	public void setTeceiveControlChange(boolean teceiveControlChange) {
		this.teceiveControlChange = teceiveControlChange;
	}
	public boolean isReceiveModulation() {
		return receiveModulation;
	}
	public void setReceiveModulation(boolean receiveModulation) {
		this.receiveModulation = receiveModulation;
	}
	public boolean isReceiveVolume() {
		return receiveVolume;
	}
	public void setReceiveVolume(boolean receiveVolume) {
		this.receiveVolume = receiveVolume;
	}
	public boolean isReceiveHold1() {
		return receiveHold1;
	}
	public void setReceiveHold1(boolean receiveHold1) {
		this.receiveHold1 = receiveHold1;
	}
	public boolean isReceivePitchBend() {
		return receivePitchBend;
	}
	public void setReceivePitchBend(boolean receivePitchBend) {
		this.receivePitchBend = receivePitchBend;
	}
	public boolean isReceiveAftertouch() {
		return receiveAftertouch;
	}
	public void setReceiveAftertouch(boolean receiveAftertouch) {
		this.receiveAftertouch = receiveAftertouch;
	}
	public int getControlChannel() {
		return controlChannel;
	}
	public void setControlChannel(int controlChannel) {
		this.controlChannel = controlChannel;
	}
	public int getPatchReceiveChannel() {
		return patchReceiveChannel;
	}
	public void setPatchReceiveChannel(int patchReceiveChannel) {
		this.patchReceiveChannel = patchReceiveChannel;
	}
	public RhythmEditSource getRhythmEditSource() {
		return rhythmEditSource;
	}
	public void setRhythmEditSource(RhythmEditSource rhythmEditSource) {
		this.rhythmEditSource = rhythmEditSource;
	}
	public PreviewSoundMode getPreviewSoundMode() {
		return previewSoundMode;
	}
	public void setPreviewSoundMode(PreviewSoundMode previewSoundMode) {
		this.previewSoundMode = previewSoundMode;
	}
	public int getPreviewNoteSet1() {
		return previewNoteSet1;
	}
	public void setPreviewNoteSet1(int previewNoteSet1) {
		this.previewNoteSet1 = previewNoteSet1;
	}
	public int getPreviewVelocitySet1() {
		return PreviewVelocitySet1;
	}
	public void setPreviewVelocitySet1(int previewVelocitySet1) {
		PreviewVelocitySet1 = previewVelocitySet1;
	}
	public int getPreviewNoteSet2() {
		return previewNoteSet2;
	}
	public void setPreviewNoteSet2(int previewNoteSet2) {
		this.previewNoteSet2 = previewNoteSet2;
	}
	public int getPreviewVelocitySet2() {
		return PreviewVelocitySet2;
	}
	public void setPreviewVelocitySet2(int previewVelocitySet2) {
		PreviewVelocitySet2 = previewVelocitySet2;
	}
	public int getPreviewNoteSet3() {
		return previewNoteSet3;
	}
	public void setPreviewNoteSet3(int previewNoteSet3) {
		this.previewNoteSet3 = previewNoteSet3;
	}
	public int getPreviewVelocitySet3() {
		return PreviewVelocitySet3;
	}
	public void setPreviewVelocitySet3(int previewVelocitySet3) {
		PreviewVelocitySet3 = previewVelocitySet3;
	}
	public int getPreviewNoteSet4() {
		return previewNoteSet4;
	}
	public void setPreviewNoteSet4(int previewNoteSet4) {
		this.previewNoteSet4 = previewNoteSet4;
	}
	public int getPreviewVelocitySet4() {
		return PreviewVelocitySet4;
	}
	public void setPreviewVelocitySet4(int previewVelocitySet4) {
		PreviewVelocitySet4 = previewVelocitySet4;
	}
	public boolean isTransmitProgramChange() {
		return transmitProgramChange;
	}
	public void setTransmitProgramChange(boolean transmitProgramChange) {
		this.transmitProgramChange = transmitProgramChange;
	}
	public boolean isTransmitBankSelect() {
		return transmitBankSelect;
	}
	public void setTransmitBankSelect(boolean transmitBankSelect) {
		this.transmitBankSelect = transmitBankSelect;
	}
	public int getPatchTransmitChannel() {
		return patchTransmitChannel;
	}
	public void setPatchTransmitChannel(int patchTransmitChannel) {
		this.patchTransmitChannel = patchTransmitChannel;
	}
	public boolean isTransposeSwitch() {
		return transposeSwitch;
	}
	public void setTransposeSwitch(boolean transposeSwitch) {
		this.transposeSwitch = transposeSwitch;
	}
	public int getTransposeValue() {
		return transposeValue;
	}
	public void setTransposeValue(int transposeValue) {
		this.transposeValue = transposeValue;
	}
	public int getOctaveShift() {
		return octaveShift;
	}
	public void setOctaveShift(int octaveShift) {
		this.octaveShift = octaveShift;
	}
	public int getKeyboardVelocity() {
		return keyboardVelocity;
	}
	public void setKeyboardVelocity(int keyboardVelocity) {
		this.keyboardVelocity = keyboardVelocity;
	}
	public KeyboardSensitivity getKeyboardSensitivity() {
		return keyboardSensitivity;
	}
	public void setKeyboardSensitivity(KeyboardSensitivity keyboardSensitivity) {
		this.keyboardSensitivity = keyboardSensitivity;
	}
	public int getAftertouchSensitivity() {
		return aftertouchSensitivity;
	}
	public void setAftertouchSensitivity(int aftertouchSensitivity) {
		this.aftertouchSensitivity = aftertouchSensitivity;
	}
	public PedalAssign getPedal1Assign() {
		return pedal1Assign;
	}
	public void setPedal1Assign(PedalAssign pedal1Assign) {
		this.pedal1Assign = pedal1Assign;
	}
	public PedalAssign getPedal2Assign() {
		return pedal2Assign;
	}
	public void setPedal2Assign(PedalAssign pedal2Assign) {
		this.pedal2Assign = pedal2Assign;
	}
	public PedalAssign getPedal3Assign() {
		return pedal3Assign;
	}
	public void setPedal3Assign(PedalAssign pedal3Assign) {
		this.pedal3Assign = pedal3Assign;
	}
	public PedalAssign getPedal4Assign() {
		return pedal4Assign;
	}
	public void setPedal4Assign(PedalAssign pedal4Assign) {
		this.pedal4Assign = pedal4Assign;
	}
	public PedalOutputMode getPedal1OutputMode() {
		return pedal1OutputMode;
	}
	public void setPedal1OutputMode(PedalOutputMode pedal1OutputMode) {
		this.pedal1OutputMode = pedal1OutputMode;
	}
	public PedalOutputMode getPedal2OutputMode() {
		return pedal2OutputMode;
	}
	public void setPedal2OutputMode(PedalOutputMode pedal2OutputMode) {
		this.pedal2OutputMode = pedal2OutputMode;
	}
	public PedalOutputMode getPedal3OutputMode() {
		return pedal3OutputMode;
	}
	public void setPedal3OutputMode(PedalOutputMode pedal3OutputMode) {
		this.pedal3OutputMode = pedal3OutputMode;
	}
	public PedalOutputMode getPedal4OutputMode() {
		return pedal4OutputMode;
	}
	public void setPedal4OutputMode(PedalOutputMode pedal4OutputMode) {
		this.pedal4OutputMode = pedal4OutputMode;
	}
	public PedalOutputMode getC1OutputMode() {
		return c1OutputMode;
	}
	public void setC1OutputMode(PedalOutputMode c1OutputMode) {
		this.c1OutputMode = c1OutputMode;
	}
	public PedalOutputMode getC2OutputMode() {
		return c2OutputMode;
	}
	public void setC2OutputMode(PedalOutputMode c2OutputMode) {
		this.c2OutputMode = c2OutputMode;
	}
	public PedalOutputMode getHoldPedalOutputMode() {
		return holdPedalOutputMode;
	}
	public void setHoldPedalOutputMode(PedalOutputMode holdPedalOutputMode) {
		this.holdPedalOutputMode = holdPedalOutputMode;
	}
	public PedalPolarity getPedal1Polarity() {
		return pedal1Polarity;
	}
	public void setPedal1Polarity(PedalPolarity pedal1Polarity) {
		this.pedal1Polarity = pedal1Polarity;
	}
	public PedalPolarity getPedal2Polarity() {
		return pedal2Polarity;
	}
	public void setPedal2Polarity(PedalPolarity pedal2Polarity) {
		this.pedal2Polarity = pedal2Polarity;
	}
	public PedalPolarity getPedal3Polarity() {
		return pedal3Polarity;
	}
	public void setPedal3Polarity(PedalPolarity pedal3Polarity) {
		this.pedal3Polarity = pedal3Polarity;
	}
	public PedalPolarity getPedal4Polarity() {
		return pedal4Polarity;
	}
	public void setPedal4Polarity(PedalPolarity pedal4Polarity) {
		this.pedal4Polarity = pedal4Polarity;
	}
	public PedalPolarity getHoldPedalPolarity() {
		return holdPedalPolarity;
	}
	public void setHoldPedalPolarity(PedalPolarity holdPedalPolarity) {
		this.holdPedalPolarity = holdPedalPolarity;
	}
	public ShortControlList getC1Assign() {
		return c1Assign;
	}
	public void setC1Assign(ShortControlList c1Assign) {
		this.c1Assign = c1Assign;
	}
	public ShortControlList getC2Assign() {
		return c2Assign;
	}
	public void setC2Assign(ShortControlList c2Assign) {
		this.c2Assign = c2Assign;
	}
	public boolean[] getBankSelectGroupSwitch() {
		return bankSelectGroupSwitch;
	}
	public void setBankSelectGroupSwitch(boolean[] bankSelectGroupSwitch) {
		this.bankSelectGroupSwitch = bankSelectGroupSwitch;
	}
	public int[] getBankSelectGroupMSB() {
		return bankSelectGroupMSB;
	}
	public void setBankSelectGroupMSB(int[] bankSelectGroupMSB) {
		this.bankSelectGroupMSB = bankSelectGroupMSB;
	}
	public int[] getBankSelectGroupLSB() {
		return bankSelectGroupLSB;
	}
	public void setBankSelectGroupLSB(int[] bankSelectGroupLSB) {
		this.bankSelectGroupLSB = bankSelectGroupLSB;
	}
	public int getArpeggioStyle() {
		return arpeggioStyle;
	}
	public void setArpeggioStyle(int arpeggioStyle) {
		this.arpeggioStyle = arpeggioStyle;
	}
	public int getArpeggioMotif() {
		return arpeggioMotif;
	}
	public void setArpeggioMotif(int arpeggioMotif) {
		this.arpeggioMotif = arpeggioMotif;
	}
	public int getArpeggioBeatPattern() {
		return arpeggioBeatPattern;
	}
	public void setArpeggioBeatPattern(int arpeggioBeatPattern) {
		this.arpeggioBeatPattern = arpeggioBeatPattern;
	}
	public int getArpeggioAccentRate() {
		return arpeggioAccentRate;
	}
	public void setArpeggioAccentRate(int arpeggioAccentRate) {
		this.arpeggioAccentRate = arpeggioAccentRate;
	}
	public int getArpeggioShuffleRate() {
		return arpeggioShuffleRate;
	}
	public void setArpeggioShuffleRate(int arpeggioShuffleRate) {
		this.arpeggioShuffleRate = arpeggioShuffleRate;
	}
	public int getArpeggioKeyboardVelocity() {
		return arpeggioKeyboardVelocity;
	}
	public void setArpeggioKeyboardVelocity(int arpeggioKeyboardVelocity) {
		this.arpeggioKeyboardVelocity = arpeggioKeyboardVelocity;
	}
	public int getArpeggioOctaveRange() {
		return arpeggioOctaveRange;
	}
	public void setArpeggioOctaveRange(int arpeggioOctaveRange) {
		this.arpeggioOctaveRange = arpeggioOctaveRange;
	}
	public int getArpeggioPartNumber() {
		return arpeggioPartNumber;
	}
	public void setArpeggioPartNumber(int arpeggioPartNumber) {
		this.arpeggioPartNumber = arpeggioPartNumber;
	}
	public int getSystemTempo() {
		return systemTempo;
	}
	public void setSystemTempo(int systemTempo) {
		this.systemTempo = systemTempo;
	}
	private PedalOutputMode pedal1OutputMode, pedal2OutputMode, pedal3OutputMode, pedal4OutputMode, c1OutputMode, c2OutputMode, holdPedalOutputMode;
	private PedalPolarity pedal1Polarity, pedal2Polarity, pedal3Polarity, pedal4Polarity, holdPedalPolarity;
	private ShortControlList c1Assign, c2Assign;
	private boolean bankSelectGroupSwitch[] = new boolean[8];
	private int bankSelectGroupMSB[] = new int[8], bankSelectGroupLSB[] = new int[8];
	private int arpeggioStyle, arpeggioMotif, arpeggioBeatPattern, arpeggioAccentRate, arpeggioShuffleRate, arpeggioKeyboardVelocity, arpeggioOctaveRange, arpeggioPartNumber;
	private int systemTempo;
}
