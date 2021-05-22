package enumerazioni;

public class NegozioProva {

	public static void main(String[] args) {

		TShirt t1 = new TShirt(Colore.BLU, Taglia.L);
		TShirt t2 = new TShirt(Colore.RED, Taglia.M);
		
		System.out.println(t1 + " : " + t1.taglia.getTaglia());
		System.out.println(t2);
	}

}
