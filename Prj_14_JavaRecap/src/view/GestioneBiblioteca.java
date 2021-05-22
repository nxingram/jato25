package view;

import java.util.ArrayList;
import java.util.Arrays;

import controller.ScaffaleCtrl;
import model.Libro;
import model.Scaffale;

public class GestioneBiblioteca {

	public static void main(String[] args) {

		Libro l1 = new Libro("uno", "desc1");
		Libro l2 = new Libro("CABONI CRISTINA", "IL GIARDINO DEI FIORI SEGRETI");
		Libro l3 = new Libro("HARRIS JOANNE", "CHOCOLAT");
		Libro l4 = new Libro("MCGUIRE JAMIE", "UN DISASTRO PERFETTO");
		Libro l5 = new Libro("DALAI LAMA", "RIBELLATEVI!");
		Libro l6 = new Libro("SCERBANENCO GIORGIO", "LA SABBIA NON RICORDA");
		Libro l7 = new Libro("BOSCO FEDERICA", "CI VEDIAMO UN GIORNO DI QUESTI");
		Libro l8 = new Libro("CABONI CRISTINA", "LA RILEGATRICE DI STORIE PERDUTE");
		Libro l9 = new Libro("SANCHEZ CLARA", "LA FORZA IMPREVEDIBILE DELLE PAROLE");
		Libro l10 = new Libro("LUCAS CHARLOTTE", "IL TUO ANNO PERFETTO INIZIA DA QUI");
		Libro l11 = new Libro("MECHELLI ARIANNA", "IL TUO PERICOLOSO SORRISO");

		Libro[] libriArray = {l2, l3, l5, l7, l9};
		ArrayList<Libro> libri = new ArrayList<>(Arrays.asList(libriArray));
		Scaffale scaf1 = new Scaffale("S1");
		Scaffale scaf2 = new Scaffale("S2", libri);

		ScaffaleCtrl ctrl1 = new ScaffaleCtrl(scaf1);
		ScaffaleCtrl ctrl2 = new ScaffaleCtrl(scaf2);

		ctrl1.addLibro(l4);
		ctrl1.addLibro(l6);
		ctrl1.addLibro(l8);
		ctrl1.addLibro(l10);

		System.out.println(ctrl1.getLibro(2));
		System.out.println(ctrl2.getLibro(2));
		System.out.println(scaf1);
		
		System.out.println(ctrl1.findLibro("chocolat"));
		System.out.println(ctrl2.findLibro("chocolat"));
		System.out.println(ctrl1.findLibro("UN DISASTRO PERFETTO"));
		
		System.out.println("--------------------------------------");		
		System.out.println(ctrl1.findLibro(l10));
		
		System.out.println("--------------------------------------");

		if(ctrl1.removeLibro(l4)) {
			System.out.println("libro non trovato");
		}else {
			System.out.println("libro trovato e rimosso");			
		}
		System.out.println(ctrl1.findLibro(l4));
	}

}
