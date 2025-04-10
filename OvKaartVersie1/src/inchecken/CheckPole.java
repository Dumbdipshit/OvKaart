package inchecken;

public class CheckPole {
	double travelCost = 0.25;
	double travelDistance;
	private boolean hasDoors = false;
	private boolean doorsOpen = false;
	public String poleLocation = "none";
	public int stepInTarrif = 4;
	double xPosition = 0;
	double yPosition = 0;
	Location CalculateDistance;
	
	public CheckPole(boolean hasDoors, Location CalculateDistance, int stepInTarrif, double x, double y) {
		this.hasDoors = hasDoors;
		this.CalculateDistance = CalculateDistance;
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
	
	public void CheckIn(OvCard ovCard) {
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
	
	public void CheckOut(OvCard ovCard) {
		double removeMoney;
		int hoursSinceLastInCheck = 1;
		ovCard.CheckingOut(hoursSinceLastInCheck, stepInTarrif);
		travelDistance = CalculateDistance.CheckOutLocation(xPosition, yPosition);
		removeMoney = CalculateCost(travelDistance);
		ovCard.RemoveMoney((Math.round(removeMoney * 100.0) / 100.0)); 
		
	}
	
	public void UsingCardReader(OvCard ovCard) {
		if (ovCard.checkedIn == false) {
			CheckIn(ovCard);
		}else {
			CheckOut(ovCard);
		}
	}
	
	public double CalculateCost(double distance) {
		double removeMoney;
		
		removeMoney = (distance * travelCost);
		
		return removeMoney;
	}
}
