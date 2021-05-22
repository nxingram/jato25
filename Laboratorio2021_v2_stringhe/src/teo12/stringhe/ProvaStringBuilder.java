package teo12.stringhe;

public class ProvaStringBuilder {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		String[] re = { "romolo", "numa pompilio", "tullo ostilio", "servio tulio", "tarqionio prisco",
				"tarqionio il superbo", };

		for (String string : re) {
			sb.append(string).append(" - ");
		}

//		System.out.println(sb.toString());

		String stringona = sb.toString();
		int lunghezza = stringona.length();
		
		String[] split = stringona.split(" - ");
		System.out.println(split.length);
		System.out.println(split[0]);
		
		
		String modificata = stringona.replace(" - ", " , ");
		System.out.println(modificata);
		
		
		

	}// main
}
