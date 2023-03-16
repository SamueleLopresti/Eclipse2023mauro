package model;

import java.util.ArrayList;

public class Ordinazione {
	private String nomeCliente;
	private ArrayList<Portata> ordinate;
	
	
	public Ordinazione(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.ordinate = new ArrayList<>();
	}
	
	public void aggiungiPortata (Portata p,int q) {
		for (int i = 0; i < q; i++) {
			ordinate.add(p);
		}
	}
	
	public double conto() {
		double CostoTotale = 0;
		for (Portata portata : ordinate) {
			CostoTotale += portata.getPrezzo();
		}
		return CostoTotale;
	}
	
	public double contoBevande() {
		double CostoTotaleBevande = 0;
		for (Portata portata : ordinate) {
			if (portata.isBevanda()) {
				CostoTotaleBevande += portata.getPrezzo();
			}
		}
		return CostoTotaleBevande;
		
	}
	
	
	public int numeroTotalePortate() {
		return ordinate.size();
	}
	public String  portateOrdinate() {
		int totaleBevande = 0;
		int totaleNonBevande = 0;
		
		for (Portata portata : ordinate) {
			if (portata.isBevanda()) {
				totaleBevande++;
			}else {
				totaleNonBevande++;
			}
		}
		return "bevande: " +totaleBevande+ " cibo: " +totaleNonBevande;
	}
	
	

}
