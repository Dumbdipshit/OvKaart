package inchecken;

public class CheckPole {
	private String checkPoleType = "no doors";
	public String poleLocation = "none";
	public int stepInTarrif = 4;
	
	public CheckPole(String checkPoleType, String poleLocation, int stepInTarrif) {
		this.checkPoleType = checkPoleType;
		this.poleLocation = poleLocation;
		this.stepInTarrif = stepInTarrif;
	}
	
	public void CheckIn(OvKaart ovKaart1) {
		ovKaart1.CheckingIn(poleLocation, stepInTarrif);
	}
}
