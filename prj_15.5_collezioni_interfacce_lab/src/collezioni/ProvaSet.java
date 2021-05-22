package collezioni;

import java.util.HashSet; // non si possono ripete i valori
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	/**
	 * introduzione alle ->> interfacce
	 * Set <<- interface
	 */
	public static void main(String[] args) {

		// intefaccia usata come tipo di dato
		Set<String> note = new HashSet<String>();
		note.add("do");
		note.add("re");
		note.add("mi");
		note.add("fa");
		note.add("fa#");
		note.add("fa");

		System.out.println(note.size());
//		note.remove(3);
		
		// ->> NON GESTISCE ORDINAMENTO!!!
		for (String nota : note) {
			System.out.println(nota);
		}		

		System.out.println("--------------");
		
		// ->> Ordine Alfabetico
		// gestisce ordinamento stabilito x il tipo di dato
		Set<String> note3 = new TreeSet<String>();
		note3.add("do");
		note3.add("re");
		note3.add("mi");
		note3.add("fa");
		note3.add("fa#");
		note3.add("fa");
		
		System.out.println(note3.size());
		for (String nota : note3) {
			System.out.println(nota);
		}		
		System.out.println("--------------");

		
		// HashSet ordinata
		Set<String> note2 = new LinkedHashSet<String>();
		note2.add("do");
		note2.add("re");
		note2.add("mi");
		note2.add("fa");
		note2.add("fa#");
		note2.add("fa");

		System.out.println(note2.size());
		
		// ->> NON GESTISCE ORDINAMENTO!!!
		for (String nota : note2) {
			System.out.println(nota);
		}
	}

}
