package inchecken;

public class OvKaart {
	
    private int euro = 0;
    private int cents = 0;
    public boolean checkedIn = false;
    public String cardLocation = "none";
    
	public OvKaart(int euro, int cents, boolean checkedIn) {
		this.euro = euro;
		this.cents = cents;
		this.checkedIn = checkedIn;
	}
	
	public void PrintInfo() {
		System.out.println("Balance: " + this.euro + "." + this.cents);
		System.out.println("Checked in: " + this.checkedIn);
		System.out.println("Checked in location: " + this.cardLocation);
	}
	
	public void AddMoney(double money) {
		int currencyEuro = (int) money;
		this.euro = this.euro + currencyEuro;
		int currencyCents = (int) (money * 100) - (currencyEuro * 100);
		this.cents = this.cents + currencyCents;
	}
	
	public void RemoveMoney(double money) {
		int currencyEuro = (int) money;
		this.euro = this.euro - currencyEuro;
		int currencyCents = (int) (money * 100) - (currencyEuro * 100);
		this.cents = this.cents - currencyCents;
	}
	
	public void CheckingIn(String position, int stepInTarrif) {
		double cardBalance = euro+(cents/100.0);
		if(cardBalance - stepInTarrif < 0) {
			System.out.println("The Pole gives a error and says that you dont have enough money");
		}else {
			RemoveMoney(Math.round(20.00 * 100.0) / 100.0);
			this.checkedIn = true;
			this.cardLocation = position;
		}
	}
}
