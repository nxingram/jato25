package giochi;

import java.util.Scanner;

public class CartaForbiciSasso {

	private static int vittorieUtente = 0;
	static int vittoriePC = 0;
	static int pareggi = 0;
	static Scanner input = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		char utente;
		char pc;	
		String msg;		
		
		
		for (int i = 0;     i < 5;             i++) {	
			
			// 1 chiedere all'utente p,f,c
			utente = sceltaUtente();			

			// 2 far scegliere un casuale tra pfc alla macchina
			pc = sceltaPC();	
			

			// 3 valutare se sono uguali: messaggio = "pareggio"
			if (utente == pc) {
				
				msg = "pareggio";
				pareggi++;
				
			} else {
				// 4 altrimenti valutare chi ha vinto:

				msg = valutaGioco(utente, pc);

				// 4a u == p -> se pc == f -> messaggio = pc perde altrimenti vince
				// 4b u == c -> se pc == p -> messaggio = pc perde altrimenti vince
				// 4c u == f -> se pc == c -> messaggio = pc perde altrimenti vince
			}

			// 5 stampa messaggio
			System.out.println(msg);
			
			
		} // chiudo ciclo
		
		
		System.out.println("Pareggi " + pareggi);
		System.out.println("Vittorie utente " + vittorieUtente);
		System.out.println("Vittorie PC " + vittoriePC);
		
		//6 saluta ed esce, oppure rigioca se in un loop
		System.out.println("Grazie per aver giocato!");
		
		
		
		input.close();
	}

	
	
	private static String valutaGioco(char utente, char pc) {
		String messaggio = null;
		
		if (utente == 'p') {
			if(pc == 'f') {
				messaggio = "Vince utente";
				vittorieUtente++;
				
			} else {
				messaggio = "Vince PC";
				vittoriePC++;
				
			}
		} else if  (utente == 'f') {
			if(pc == 'c') {
				messaggio = "Vince utente";
				vittorieUtente++;
			} else {
				messaggio = "Vince PC";
				vittoriePC++;
			}			
		} else {
			if(pc == 'p') {
				messaggio = "Vince utente";
				vittorieUtente++;
			} else {
				messaggio = "Vince PC";
				vittoriePC++;
			}				
		}
		
		return messaggio;
	}

	
	
	private static char sceltaPC() {
		
		char c = 0;		
//		Math math = new Math();
		double d = Math.random();
//		 double pi =  Math.PI;
		
		
		if (d < 0.33) {
			c = 'p';
			
		} else if ( d < 0.66) {
			c = 'f';	
			
		} else {
			c = 'c';	
			
		}		
		
		return c;
	}

	//metodo ausiliario per chiedere la scelta all'utente
	

	private static char sceltaUtente() {
		
		System.out.println("Scegli tra pietra, forbici, carta");
		System.out.println("p: pietra");
		System.out.println("f: forbici");
		System.out.println("c: carta");
		
		String s = input.nextLine();
		
		char c = s.charAt(0);
		
		
		
		//input.close();
		return c;
	}
	

}


