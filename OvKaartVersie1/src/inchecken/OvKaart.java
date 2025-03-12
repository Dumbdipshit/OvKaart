package inchecken;

public class OvKaart {
	
    private int euro = 0;
    private int cents = 0;
    private boolean checkedIn = false;
    private String location = "none";
    
	public OvKaart(int euro, int cents, boolean checkedIn, String location) {
		this.euro = euro;
		this.cents = cents;
		this.checkedIn = checkedIn;
		this.location = location;
	}
	
	public void PrintInfo() {
		System.out.println("Balance: " + this.euro + "." + this.cents);
		System.out.println("Checked in: " + this.checkedIn);
		System.out.println("Current location: " + this.location);
	}
}
