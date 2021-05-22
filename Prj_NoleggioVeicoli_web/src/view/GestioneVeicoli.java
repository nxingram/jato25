package view;

import java.util.ArrayList;

import controller.Flotta;
import controller.NoleggioController;
import model.Noleggio;
import model.Veicolo;

public class GestioneVeicoli {

	public static void main(String[] args) {
		Flotta f = new Flotta();
		ArrayList<Veicolo> veicoli = f.getVeicoli();

//		for (Veicolo veicolo : veicoli) {
//			System.out.println(veicolo.getNome());
//		}

		// Noleggio n1 = new Noleggio(veicoli.get(0), 2, "batman");
		// Noleggio n2 = new Noleggio(veicoli.get(1), 3, "robin"); 
		// System.out.println(n2);

		NoleggioController nc = new NoleggioController();
		nc.addNoleggio(veicoli.get(0), 2, "batman");
		nc.addNoleggio(veicoli.get(1), 3, "robin");
		
		ArrayList<Noleggio> noleggi = nc.getNoleggi();

		for (Noleggio noleggio : noleggi) {
			System.out.println(noleggio);
		}
	}
}
