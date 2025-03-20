package inchecken;

public class OvKaart {
	
	private String owner = "None";
    private int euro = 0;
    private int cents = 0;
    public boolean checkedIn = false;
    public String cardCheckInLocation = "none";
    public double tarif = 0.0;
    
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
		System.out.println("Checked in location: " + cardCheckInLocation);
	}
	
	public void AddMoney(double money) {
		int currencyEuro = (int) money;
		this.euro = euro + currencyEuro;
		int currencyCents = (int) (money * 100) - (currencyEuro * 100);
		this.cents = cents + currencyCents;
	}
	
	public void RemoveMoney(double money) {
		tarif = money;
		int currencyEuro = (int) money;
		this.euro = euro - currencyEuro;
		int currencyCents = (int) (money * 100) - (currencyEuro * 100);
		this.cents = cents - currencyCents;
	}
	
	public boolean CheckingIn(String position, int stepInTarrif) {
		boolean enoughMoney = false;
		double cardBalance = euro+(cents/100.0);
		if((cardBalance - stepInTarrif) < 0) {
			enoughMoney = false;
			System.out.println("The Pole gives a error and says that you dont have enough money");
		}else {
			enoughMoney = true;
			RemoveMoney(Math.round(stepInTarrif * 100.0) / 100.0);
			checkedIn = true;
			cardCheckInLocation = position;
		}
		return enoughMoney;
	}
	
	public void CheckingOut(int hour) {
		if(hour < 6) {
			checkedIn = false;
			cardCheckInLocation = "None";
			AddMoney(tarif);
		}else {
			checkedIn = false;
			cardCheckInLocation = "None";
		}
	}
}
