package modello;

public class Segmento {
	Punto a,b;
	double lunghezza;
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
		this.lunghezza = this.calcolaLunghezza();
	}
	
	public double calcolaLunghezza () {
		return Math.sqrt(
				
				Math.pow(b.x-a.x, 2)+ 
				Math.pow(b.y-a.y, 2)   
	
				);
	}

	@Override
	public String toString() {
		return "segmento [a=" + a + ", b=" + b + "]";
	}
	
	

}
