package inchecken;

import java.util.ArrayList;

public class Location {
	int startingX;
	int startingY;
	
	int endingX;
	int endingY;
	
	public void CheckInLocation(int startingX, int startingY) {
		this.startingX = startingX;
		this.startingY = startingY;
	}
	
	public void CheckOutLocation(int endingX, int endingY) {
		this.endingX = endingX;
		this.endingY = endingY;
	}
	
		
}