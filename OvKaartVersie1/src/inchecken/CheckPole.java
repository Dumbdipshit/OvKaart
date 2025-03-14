package inchecken;

public class CheckPole {
	private boolean hasDoors = false;
	private boolean doorsOpen = false;
	public String poleLocation = "none";
	public int stepInTarrif = 4;
	
	public CheckPole(boolean hasDoors, String poleLocation, int stepInTarrif) {
		this.hasDoors = hasDoors;
		this.poleLocation = poleLocation;
		this.stepInTarrif = stepInTarrif;
		if(hasDoors == false) {
			doorsOpen = true;
		}else {
			doorsOpen = false;
		}
	}
	
	public void CheckPoleInfo(){
		System.out.println("The pole has doors: " + hasDoors);
		System.out.println("The doors are open: " + doorsOpen);
		System.out.println("Current location: " + poleLocation);
		System.out.println("The step in cost: " + stepInTarrif);
	}
	
	public void CheckIn(OvKaart ovKaart1) {
		ovKaart1.CheckingIn(poleLocation, stepInTarrif);
		
		if(hasDoors == true || hasDoors == false) {
			doorsOpen = true;
		}else {
			doorsOpen = false;
		}
	}
}
