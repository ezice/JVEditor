
public class JV1010TemporaryArea {
	JV1010Performance temporaryPerformance;
	JV1010Patch[] temporaryPatch = new JV1010Patch[16]; // element 9 (patch 10) is not used in this format -- it's a Rhythm patch.
	
	public JV1010Performance getTemporaryPerformance() {
		return temporaryPerformance;
	}
	public void setTemporaryPerformance(JV1010Performance temporaryPerformance) {
		this.temporaryPerformance = temporaryPerformance;
	}
	public JV1010Patch getTemporaryPatch() {
		return temporaryPatch;
	}
	public void setTemporaryPatch(JV1010Patch temporaryPatch) {
		this.temporaryPatch = temporaryPatch;
	}
}
