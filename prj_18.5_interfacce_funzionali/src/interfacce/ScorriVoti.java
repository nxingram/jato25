package interfacce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class ScorriVoti {

	public static void main(String[] args) {

		int[] voti = {22,24,26,28,30};		
		
//		// procedurale
//		int somma = 0;
//		for (int i = 0; i < voti.length; i++) {
//			somma += voti[i];
//		}		
//		System.out.println(somma);
		
		String[] note = {"uno","due","tre"};
		ArrayList<String> lista = new ArrayList<String>(Arrays.asList(note));
		
		// improved for
		for ( String nota: lista) {
			if(nota.startsWith("s"))
				System.out.println(nota);
		}
		
		// functional interface
		// Predicate - java.util.function
		lista
			.stream()
			.filter(s -> s.length() < 3)
			.filter(s -> s.endsWith("a"))
			.forEach(s -> System.out.println(s));
		
		
	}

}
