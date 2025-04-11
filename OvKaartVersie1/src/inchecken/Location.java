package inchecken;

import java.util.ArrayList;

public class Location {
	double travelDistance;
	double startingX;
	double startingY;
	
	double endingX;
	double endingY;
	
	String stationLocation;
	
	public Location(String location) {
		this.stationLocation = location;
	}
	
	public void CheckInLocation(double startingX, double startingY) {
		this.startingX = startingX;
		this.startingY = startingY;
	}
	
	public double CheckOutLocation(double endingX, double endingY) {
		this.endingX = endingX;
		this.endingY = endingY;
		
		travelDistance = CalculateTravelDistance();
		return travelDistance;
	}
	
	public double CalculateTravelDistance() {
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
		return xyDistance;
	}
}