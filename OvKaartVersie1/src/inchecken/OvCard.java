package inchecken;

public class OvCard {
	
	private String owner = "None";
    private int euro = 0;
    private int cents = 0;
    public boolean checkedIn = false;
    public String cardCheckInLocation = "none";
    private int rememberTarif;
    
	public OvCard(String owner, int euro, int cents, boolean checkedIn) {
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
		System.out.println("");
	}
	
	public void AddMoney(double money) {
		int currencyEuro = (int) money;
		this.euro = euro + currencyEuro;
		int currencyCents = (int) (money * 100) - (currencyEuro * 100);
		this.cents = cents + currencyCents;
	}
	
	public void RemoveMoney(double money) {
		double calculationBalance  = euro + ((double) cents/100);
		calculationBalance = (calculationBalance - money);
		this.euro = (int) calculationBalance;
		this.cents = ((int)(calculationBalance*100) - (euro*100));
	}
	
	public boolean CheckingIn(int stepInTarrif, String cardPosition) {
		rememberTarif = stepInTarrif;
		boolean enoughMoney = false;
		double cardBalance = euro+(cents/100.0);
		if((cardBalance - stepInTarrif) < 0) {
			enoughMoney = false;
			System.out.println("The Pole gives a error and says that you dont have enough money");
		}else {
			enoughMoney = true;
			RemoveMoney(Math.round(stepInTarrif * 100.0) / 100.0);
			checkedIn = true;
			cardCheckInLocation = cardPosition;
		}
		return enoughMoney;
	}
	
	public void CheckingOut(int hour, double stepInTarrif) {
		if(hour < 6) {
			checkedIn = false;
			cardCheckInLocation = "None";
			AddMoney(rememberTarif);
		}else {
			checkedIn = false;
			cardCheckInLocation = "None";
		}
	}
}
