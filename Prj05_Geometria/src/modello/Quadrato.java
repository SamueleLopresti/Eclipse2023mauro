package modello;

public class Quadrato extends Rettangolo {
	
	Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.nome = "quadrato";
		this.lato = lato;
		
	}
	

	@Override
	public double calcolaSuperficie() {
		// TODO Auto-generated method stub
		System.out.println("Ho usato il calcolo del quadrato");
		return Math.pow(this.base.lunghezza, 2);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	

}
