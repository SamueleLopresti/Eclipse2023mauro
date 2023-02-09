package Test;

import java.util.ArrayList;

import Model.Dipendente;
import Model.Dirigente;
import Model.Fattorino;
import Model.Impiegato;

public class DipendetiTest {

	public static void main(String[] args) {
		
		ArrayList<Dipendente> dipendenti = new ArrayList<>();
		dipendenti.add(new Fattorino("Mario", "Rossi"));
		dipendenti.add(new Impiegato("Giacomo", "Belli"));
		dipendenti.add(new Dirigente("Giulia", "Carmoni"));
		
		for (Dipendente dipendente : dipendenti) {
			System.out.println(dipendente);
			
		}
	

	}

}
