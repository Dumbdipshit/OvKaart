package inchecken;

public class CheckPole {
	private boolean hasDoors = false;
	private boolean doorsOpen = false;
	public String poleLocation = "none";
	public int stepInTarrif = 4;
	double xPosition = 0;
	double yPosition = 0;
	
	public CheckPole(boolean hasDoors, String poleLocation, int stepInTarrif, double x, double y) {
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
	
	public void CheckIn(OvCard ovCard,  Location CalculateDistance) {
		boolean enoughMoney = false;
		
		enoughMoney = ovCard.CheckingIn(poleLocation, stepInTarrif);
			if(enoughMoney == true) {
				CalculateDistance.CheckInLocation(xPosition, yPosition);
				if(hasDoors == true || hasDoors == false) {
					doorsOpen = true;
				}else {
					doorsOpen = false;
				}
			}
			
	}
	
	public void CheckOut(OvCard ovCard, Location CalculateDistance) {
		int hoursSinceLastInCheck = 1;
		CalculateDistance.CheckOutLocation(xPosition, yPosition, ovCard);
		ovCard.CheckingOut(hoursSinceLastInCheck, stepInTarrif);
	}
	
	public void UsingCardReader(OvCard ovCard, Location CalculateDistance, CheckPole Location, boolean checkedIn) {
		if (checkedIn == false) {
			Location.CheckIn(ovCard, CalculateDistance);
		}else {
			Location.CheckOut(ovCard, CalculateDistance);
		}
	}
}
