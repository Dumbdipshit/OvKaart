package inchecken;

public class Main{
	public static void main(String[] args) {
		CheckPole Hamburg = new CheckPole(false, "Hamburg", 20, 10, 15);
		CheckPole England = new CheckPole(false, "England", 20, 20, 25);
		OvKaart ovKaart1 = new OvKaart("Anonymous", 0, 0, false);
		
		ovKaart1.AddMoney(Math.round(25.199 * 100.0) / 100.0);
		Hamburg.CheckIn(ovKaart1);
		ovKaart1.PrintInfo();
		System.out.println("");
		Hamburg.CheckPoleInfo();

	}

}
