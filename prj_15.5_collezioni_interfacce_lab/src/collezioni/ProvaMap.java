package collezioni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProvaMap {

	public static void main(String[] args) {

		// la chiave funziona come un set, valore come una list
		Map<String, String> capoluoghi = new HashMap<String, String>();
		
		capoluoghi.put("Piemonte", "Torino");
		capoluoghi.put("Lazio", "Roma");
		capoluoghi.put("Lombardia", "Milano");
		capoluoghi.put("Piemonte", "Cuneo");
		
		System.out.println(capoluoghi.get("Piemonte"));
		System.out.println(capoluoghi.size());
		
		Set<String> keySet = capoluoghi.keySet(); //unsorted
		
		System.out.println("----");
		for (String regione : keySet) {
			System.out.println(capoluoghi.get(regione));
		}
		System.out.println("----");
		
		
		Collection<String> values = capoluoghi.values();
//		Collections.sort((List<String>) values); //->> errore
		ArrayList<String> arrayList = new ArrayList<String>(values);
		Collections.sort(arrayList); // sorted
		
		for (String value : arrayList) {
			System.out.println(value);
		}
	}

}
