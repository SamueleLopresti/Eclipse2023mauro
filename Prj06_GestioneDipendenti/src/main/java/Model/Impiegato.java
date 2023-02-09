package Model;

public class Impiegato extends Dipendente {
	int oreLavorate;

	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
		this.pagaBase = 6;
	}

	@Override
	public double getStipendio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
