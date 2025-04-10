package inchecken;

public class Main{
	public static void main(String[] args) {
		Location hamburg = new Location();
		CheckPole Hamburg = new CheckPole(false, hamburg, 20, 30.0, 25.0);
		Location england = new Location();
		CheckPole England = new CheckPole(false, england, 20, 20.0, 10.0);
		OvCard OvCard1 = new OvCard("Anonymous", 0, 0, false);
		
		OvCard1.AddMoney(Math.round(200 * 100.0) / 100.0);
		OvCard1.PrintInfo();
		England.UsingCardReader(OvCard1);
		OvCard1.PrintInfo();
	}

}
