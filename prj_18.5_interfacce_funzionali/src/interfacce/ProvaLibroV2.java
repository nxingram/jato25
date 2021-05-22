package interfacce;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProvaLibroV2 {

	public static void main(String[] args) {

		// V1
//		Libro[] libriArray = 
//			{
//					new Libro(20, "Marcovaldo"),
//					new Libro(10, "Albachiara"),
//					new Libro(90, "Zanna Bianca"),
//					new Libro(70, "Barbablù"),
//					new Libro(50, "Serenella")
//			};

//		List<Libro> libriList = Arrays.asList(libriArray);
		
		// V2
		List<Libro> libriList = Arrays.asList(
				new Libro[] {
						new Libro(20, "Marcovaldo"),
						new Libro(10, "Albachiara"),
						new Libro(90, "Zanna Bianca"),
						new Libro(70, "Barbablù"),
						new Libro(50, "Serenella")
				});

		// V1
		// Comparator class
//		Comparator<Libro> c = new Prova();
//		Collections.sort(libriList, c);

		// V2
		// Interfaccia con 1 solo metodo ->> lambda function
//		Comparator<Libro> c = new Comparator<Libro>() {
//			@Override
//			public int compare(Libro o1, Libro o2) {
//				return o1.getTitolo().compareTo(o2.getTitolo());
//			}
//		};
//		Collections.sort(libriList, c);

		
		// V3
		// funzione lambda
		// o1 e o2 sono di tipo libro xè è un comparator di tipo libro, si può omettere
//		Comparator<Libro> c = (o1, o2) -> o1.getTitolo().compareTo(o2.getTitolo());
//		Collections.sort(libriList, c);		
		
		// V4
		// oneline
		Collections.sort(libriList, (o1, o2) -> o1.getTitolo().compareTo(o2.getTitolo()));		
		
		// V1
//		for (Libro libro : libriList) {
//			System.out.println(libro);
//		}
		
		// V2
		// libro.toString()
//		libriList.forEach(System.out::println);
		
		// V3
		libriList.forEach(l -> System.out.println(l.getTitolo()));

	}	

}


class Prova implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getTitolo().compareTo(o2.getTitolo());
	}
	
}