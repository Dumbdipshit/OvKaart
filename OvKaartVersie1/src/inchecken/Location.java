package inchecken;

import java.util.ArrayList;

public class Location {
	double costPerDistance = 0.25;
	
	double startingX;
	double startingY;
	
	double endingX;
	double endingY;
	
	public void CheckInLocation(double startingX, double startingY) {
		this.startingX = startingX;
		this.startingY = startingY;
	}
	
	public void CheckOutLocation(double endingX, double endingY, OvCard ovCard) {
		this.endingX = endingX;
		this.endingY = endingY;
		
		CalculateTravelCost(ovCard);
	}
	
	public void CalculateTravelCost(OvCard ovCard) {
		double xyDistance = 0.0;
		double travelCost = 0.00;
		double xDistance = (startingX - endingX);
		if (xDistance < 0) {
			xDistance = (xDistance * -1.0);
		}
		double yDistance = (startingY - endingY);
		if (yDistance < 0) {
			yDistance = (yDistance * -1.0);
		}
		
		yDistance = (Math.pow(yDistance, 2));
		xDistance = (Math.pow(xDistance, 2));
		
		xyDistance = (Math.sqrt((yDistance + xDistance)));
		travelCost = (xyDistance * costPerDistance);
		ovCard.RemoveMoney((Math.round(travelCost * 100.0) / 100.0));
	}
	
		
}