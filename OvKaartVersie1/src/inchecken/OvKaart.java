package inchecken;

public class OvKaart {
	
    private int euro = 0;
    private int cents = 0;
    private boolean checkedIn = false;
    private String cardLocation = "none";
    
	public OvKaart(int euro, int cents, boolean checkedIn) {
		this.euro = euro;
		this.cents = cents;
		this.checkedIn = checkedIn;
	}
	
	public void PrintInfo() {
		System.out.println("Balance: " + this.euro + "." + this.cents);
		System.out.println("Checked in: " + this.checkedIn);
		System.out.println("Current location: " + this.cardLocation);
	}
	
	public void AddMoney(double money) {
		int currencyEuro = (int) money;
		this.euro = this.euro + currencyEuro;
		int currencyCents = (int) (money * 100) - (currencyEuro * 100);
		this.cents = this.cents + currencyCents;
	}
	
	public void CheckIn() {
		System.out.println("Still WIP");
	}
}
