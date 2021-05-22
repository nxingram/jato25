package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProvaPersoneSortable {

	public static void main(String[] args) {

		Persona p1 = new Persona("paolo", "rossi");
		Persona p2 = new Persona("marco", "bianchi");
		Persona p3 = new Persona("gino", "verdi");
		
		ArrayList<Persona> persone = new ArrayList<Persona>(Arrays.asList(p1,p2,p3));
		
		Collections.sort(persone);
		
		for (Persona persona : persone) {
			System.out.println(persona.getNome() + " " + persona.getCognome());
		}
		
		persone.stream().sorted(Persona::compareTo).collect(Collectors.toList());
	}

}
