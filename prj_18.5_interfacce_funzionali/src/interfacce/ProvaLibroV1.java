package interfacce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProvaLibroV1 {

	public static void main(String[] args) {
		List<Libro> libreria = new ArrayList<Libro>();
		libreria.add(new Libro(100, "Io robot"));
		libreria.add(new Libro(1500, "Guerra e pace"));
		libreria.add(new Libro(50, "Malavoglia"));


		//		for (int i = 0; i < libreria.size(); i++) {
		//			System.out.println(libreria.get(i));
		//		}
		//		
		//		for (Libro libro : libreria) {
		//			System.out.println(libro);
		//		}
		//		

		//		libreria.forEach(l -> {
		//			System.out.println(l.getTitolo().toUpperCase());
		//		});


		libreria
		.stream()
		.filter(l -> l.getTitolo().contains("r"))
		.forEach(l -> System.out.println(l.getTitolo().toUpperCase()));

		// interfacce java: Comparable
		Collections.sort(libreria);
		libreria.forEach(l->System.out.println(l));

		// interfacce java: Comparator
		 Collections.sort(libreria, new ComparaPerTitolo());
		
		// Classe Anonima
		Collections.sort(libreria, new Comparator<Libro>() {
			@Override
			public int compare(Libro l1, Libro l2) {
				return l1.getTitolo().compareTo(l2.getTitolo());
			}
		});
		
		// Lambda expression -> Funzione Anonima
		// Asc
		Collections.sort(libreria, 
				(libro1, libro2) -> libro1.getTitolo().compareTo(libro2.getTitolo()));
		libreria.forEach(l -> System.out.println(l.getTitolo()));
		
		// Desc
		Collections.sort(libreria, 
				(libro1, libro2) -> libro2.getTitolo().compareTo(libro1.getTitolo()));
		
		
		libreria.forEach(l -> System.out.println(l.getTitolo()));
		System.out.println("Libri ordinati per titolo");

		// prezzo
		Collections.sort(libreria, 
					(libro1, libro2) -> new Integer(libro2.getPagine()).compareTo(libro1.getPagine()));
		
		
		libreria.stream()
			.filter(l->l.getPagine()>50)
			.filter(l->l.getPagine()<120)
//			.forEach(l->System.out.println(l));
			.forEach(System.out::println); // stessa cosa		

	}
}


/**
 * Inner class (classe innestata) </br>
 * Comparator - java.util
 * @author Home
 */
class ComparaPerTitolo implements Comparator<Libro>{

	public ComparaPerTitolo() {
		System.out.println("New Instance ComparaPerTitolo");
	}

	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getTitolo().compareTo(l2.getTitolo());
	}

}