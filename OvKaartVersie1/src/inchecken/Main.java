package inchecken;

public class Main{
	public static void main(String[] args) {
		OvKaart ovKaart1 = new OvKaart(0, 0, false);
		
		ovKaart1.AddMoney(20.54);
		ovKaart1.PrintInfo();

	}

}
