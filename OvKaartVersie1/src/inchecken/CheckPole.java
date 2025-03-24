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
		System.out.println("");
	}
	
	public void CheckIn(OvCard ovKaart1,  Location CalculateDistance) {
		boolean enoughMoney = false;
		
		enoughMoney = ovKaart1.CheckingIn(poleLocation, stepInTarrif);
			if(enoughMoney == true) {
				CalculateDistance.CheckInLocation(xPosition, yPosition);
				if(hasDoors == true || hasDoors == false) {
					doorsOpen = true;
				}else {
					doorsOpen = false;
				}
			}
			
	}
	
	public void CheckOut(OvCard ovKaart1, Location CalculateDistance) {
		int hoursSinceLastInCheck = 1;
		CalculateDistance.CheckOutLocation(xPosition, yPosition);
		ovKaart1.CheckingOut(hoursSinceLastInCheck);
	}
	
	public void UsingCardReader(OvCard ovKaart1, Location CalculateDistance, CheckPole Location, boolean checkedIn) {
		if (checkedIn == false) {
			Location.CheckIn(ovKaart1, CalculateDistance);
		}else {
			Location.CheckOut(ovKaart1, CalculateDistance);
		}
	}
}
