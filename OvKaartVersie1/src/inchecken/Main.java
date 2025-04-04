package inchecken;

public class Main{
	public static void main(String[] args) {
		Location CalculateDistance = new Location();
		CheckPole Hamburg = new CheckPole(false, "Hamburg", 20, 30.0, 25.0);
		CheckPole England = new CheckPole(false, "England", 20, 20.0, 10.0);
		OvCard OvCard1 = new OvCard("Anonymous", 0, 0, false);
		
		OvCard1.AddMoney(Math.round(200 * 100.0) / 100.0);
		OvCard1.PrintInfo();
		OvCard1.UseCardReader(OvCard1, CalculateDistance, England);
		OvCard1.UseCardReader(OvCard1, CalculateDistance, Hamburg);
		OvCard1.PrintInfo();
	}

}
