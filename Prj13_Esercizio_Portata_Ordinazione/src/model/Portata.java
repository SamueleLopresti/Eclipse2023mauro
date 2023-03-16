package model;

public class Portata {
	private String descrizione;
	private double prezzo;
	private boolean tipo;
	
	
	public Portata(String descrizione, double prezzo, boolean tipo) {
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.tipo = tipo;
	}
	
	
	
	public double getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}



	public boolean isBevanda() {
		if (tipo == true) {
			return true;
		}else {
			return false;
		}
	}



	@Override
	public String toString() {
		return "Portata [descrizione=" + descrizione + ", prezzo=" + prezzo + ", tipo=" + tipo + "]";
	}
	
	
	
	

}
