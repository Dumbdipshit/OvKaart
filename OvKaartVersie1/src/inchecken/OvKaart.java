package inchecken;

public class OvKaart {
	
	private String owner = "None";
    private int euro = 0;
    private int cents = 0;
    public boolean checkedIn = false;
    public String cardLocation = "none";
    
	public OvKaart(String owner, int euro, int cents, boolean checkedIn) {
		this.owner = owner;
		this.euro = euro;
		this.cents = cents;
		this.checkedIn = checkedIn;
	}
	
	public void PrintInfo() {
		System.out.println("Owner of the card: " + owner);
		System.out.println("Balance: " + euro + "." + cents);
		System.out.println("Checked in: " + checkedIn);
		System.out.println("Checked in location: " + cardLocation);
	}
	
	public void AddMoney(double money) {
		int currencyEuro = (int) money;
		this.euro = euro + currencyEuro;
		int currencyCents = (int) (money * 100) - (currencyEuro * 100);
		this.cents = cents + currencyCents;
	}
	
	public void RemoveMoney(double money) {
		int currencyEuro = (int) money;
		this.euro = euro - currencyEuro;
		int currencyCents = (int) (money * 100) - (currencyEuro * 100);
		this.cents = cents - currencyCents;
	}
	
	public void CheckingIn(String position, int stepInTarrif) {
		double cardBalance = euro+(cents/100.0);
		if((cardBalance - stepInTarrif) < 0) {
			System.out.println("The Pole gives a error and says that you dont have enough money");
		}else {
			RemoveMoney(Math.round(20.00 * 100.0) / 100.0);
			checkedIn = true;
			cardLocation = position;
		}
	}
}
