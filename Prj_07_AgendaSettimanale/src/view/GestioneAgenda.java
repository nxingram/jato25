package view;

import java.util.Scanner;

import controller.AgendaSettimanale;
import model.Giorno;
import model.Impegno;
import model.Settimana;

public class GestioneAgenda {

	public static void main(String[] args) {
		
		Settimana s1 = new Settimana("prima");		
		AgendaSettimanale as = new AgendaSettimanale(s1);

		vistaSettimanale(as);	
		
		addImpegno(as);
		
		
		
				
	}

	private static void addImpegno(AgendaSettimanale as) {
		Scanner  sc  = new Scanner(System.in);
		System.out.println("che giorno? (0 pe lun - 6 per dom");
		int giorno = sc.nextInt();
		sc.nextLine();
		System.out.println("a che ora?");
		int ora = sc.nextInt();
		sc.nextLine();
		System.out.println("quale impegno?");
		String impegno = sc.nextLine();
		
		Giorno giornoImpegno = as.getGiorno(giorno);
		as.getImpegno(giornoImpegno, ora).setImpegno(impegno);
	}

	private static void vistaSettimanale(AgendaSettimanale as) {
		Giorno lun = as.getGiorno(0);
		Giorno mar = as.getGiorno(1);
		Giorno mer = as.getGiorno(2);
		Giorno gio = as.getGiorno(3);
		Giorno ven = as.getGiorno(4);
		Giorno sab = as.getGiorno(5);
		Giorno dom = as.getGiorno(6);
		
		int ore =10;
		
		lun.getImpegni()[4].setImpegno("Esame Java");
		as.getImpegno(lun, 9).setImpegno("HTML");
		
		
		for (int i = 0; i < ore; i++) {
			System.out.print(lun.getImpegni()[i]);
			System.out.print(mar.getImpegni()[i]);
			System.out.print(mer.getImpegni()[i]);
			System.out.print(gio.getImpegni()[i]);
			System.out.print(ven.getImpegni()[i]);
			System.out.print(sab.getImpegni()[i]);
			System.out.print(dom.getImpegni()[i]);
			System.out.println();
		}
	}

}
