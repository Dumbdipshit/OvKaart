package inchecken;

public class CheckPole {
	private boolean hasDoors = false;
	private boolean doorsOpen = false;
	public String poleLocation = "none";
	public int stepInTarrif = 4;
	int xPosition = 0;
	int yPosition = 0;
	
	public CheckPole(boolean hasDoors, String poleLocation, int stepInTarrif, int x, int y) {
		this.hasDoors = hasDoors;
		this.poleLocation = poleLocation;
		this.stepInTarrif = stepInTarrif;
		this.xPosition = x;
		this.yPosition = y;
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
		boolean enoughMoney = false;
		
		enoughMoney = ovKaart1.CheckingIn(poleLocation, stepInTarrif);
			if(enoughMoney == true) {
				if(hasDoors == true || hasDoors == false) {
					doorsOpen = true;
				}else {
					doorsOpen = false;
				}
			}
			
	}
	
	public void CheckOut(OvKaart ovKaart1) {
		int hoursSinceLastInCheck = 1;
		ovKaart1.CheckingOut(hoursSinceLastInCheck);
	}
	
	
}
