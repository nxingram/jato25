package database;

import model.Studente;

public class DBStudenti {

	private Studente[] studenti;

	public DBStudenti() {
		this.studenti = new Studente[30];
		this.fakeDB();
	}
	
	private void fakeDB() {
		this.studenti[0] = new Studente("Alessandro", "Storto");
		this.studenti[1] = new Studente("Andrea", "Spinnato");
		this.studenti[2] = new Studente("Chiara", "Cavagnino");
		this.studenti[3] = new Studente("Chiara", "Favaro");
		this.studenti[4] = new Studente("Clarissa", "Ballocco");
		this.studenti[5] = new Studente("teodora elena", "tomescu");
		this.studenti[6] = new Studente("Fabio Denis", "Davico");
		this.studenti[7] = new Studente("Federica", "Liuzzi");
		this.studenti[8] = new Studente("Federico", "Delpiano");
		this.studenti[9] = new Studente("Flavio", "Locorotondo");
		this.studenti[10] = new Studente("Francesca", "Provero");
		this.studenti[11] = new Studente("Francesca", "Mollica");
		this.studenti[12] = new Studente("Gabriel", "Zirondi Ferreira da Silva");
		this.studenti[13] = new Studente("george", "bejenaru");
		this.studenti[14] = new Studente("Giovenale", "Sergio");
		this.studenti[15] = new Studente("Giulia", "Bosco");
		this.studenti[16] = new Studente("Giuliana Elisa", "Ducano");
		this.studenti[17] = new Studente("Giulio", "Ricci");
		this.studenti[18] = new Studente("Irene", "Tempo");
		this.studenti[19] = new Studente("Kleandro", "Kulli");
		this.studenti[20] = new Studente("Laila", "Zoundi");
		this.studenti[21] = new Studente("Lorenzo", "Baialardo Marchese");
		this.studenti[22] = new Studente("Matteo", "Billia");
		this.studenti[23] = new Studente("Matteo", "Inchingolo");
		this.studenti[24] = new Studente("Paolo", "Cai");
		this.studenti[25] = new Studente("Riccardo", "Placenti");
		this.studenti[26] = new Studente("Sibora", "Beja");
		this.studenti[27] = new Studente("Tommaso", "Amateis");
		this.studenti[28] = new Studente("Vincenzo", "Di Domenico");


	}

	public Studente[] getStudenti() {
		return studenti;
	}
	
	
	
	
	
}
