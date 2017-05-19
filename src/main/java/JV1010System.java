
public class JV1010System {
	private SystemCommon systemCommon;
	private int[][] partScaleTune = new int[16][11];
	private int[] patchScaleTune = new int[11];
	
	public SystemCommon getSystemCommon() {
		return systemCommon;
	}
	public void setSystemCommon(SystemCommon systemCommon) {
		this.systemCommon = systemCommon;
	}
	public int[][] getPartScaleTune() {
		return partScaleTune;
	}
	public void setPartScaleTune(int[][] partScaleTune) {
		this.partScaleTune = partScaleTune;
	}
	public int[] getPatchScaleTune() {
		return patchScaleTune;
	}
	public void setPatchScaleTune(int[] patchScaleTune) {
		this.patchScaleTune = patchScaleTune;
	}
}
