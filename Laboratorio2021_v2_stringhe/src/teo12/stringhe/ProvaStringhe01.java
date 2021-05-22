package teo12.stringhe;

public class ProvaStringhe01 {

	public static void main(String[] args) {
		String s1 = "ciao";
		String s2 = " mondo";
		String s3 = s1 + s2;

		String s4 = "ciao Mondo";

		if (s3.equalsIgnoreCase(s4)) {
			System.out.println("sono uguali");
		} else {
			System.out.println("sono diverse");
			System.out.println(s4);
		}

		String s5 = "prova";
		String s6 = "prova";
		if (s5 == s6) {
			System.out.println("sono uguali");
		}
		
		String s7 = new String("prova") ;
		String s8 = "prova";
		if (s7 == s8) {
			System.out.println("sono uguali");
		}

	}// main

}
