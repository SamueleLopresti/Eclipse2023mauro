package Model;

import java.time.LocalDate;

public abstract class Dipendente {
	static int contatore = 1;
	int nMat;
	String nome;
	String cognome;
	LocalDate dataAssunzione;
	double pagaBase;
	
	
	
	public Dipendente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataAssunzione = LocalDate.now();
		this.nMat = contatore++;
		this.pagaBase= 5;
	}
	
	public abstract double getStipendio();

	@Override
	public String toString() {
		return "Dipendente [nMat=" + nMat + ", nome=" + nome + ", cognome=" + cognome + ", dataAssunzione="
				+ dataAssunzione + "]";
	}
	
   
}
