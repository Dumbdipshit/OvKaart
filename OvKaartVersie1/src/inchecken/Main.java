package inchecken;

public class Main{
	public static void main(String[] args) {
		CheckPole Hamburg = new CheckPole("No doors", "Hamburg", 20);
		OvKaart ovKaart1 = new OvKaart(0, 0, false);
		
		ovKaart1.AddMoney(Math.round(100.559 * 100.0) / 100.0);
		Hamburg.CheckIn(ovKaart1);
		ovKaart1.PrintInfo();

	}

}
