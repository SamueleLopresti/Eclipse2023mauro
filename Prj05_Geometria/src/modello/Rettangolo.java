package modello;

public class Rettangolo extends FiguraGeometrica{
	Segmento base,altezza;
	/*double perimetro;
	double superficie;*/
	public Rettangolo(Segmento base, Segmento altezza) {
		super ("Rettangolo");
		this.base = base;
		this.altezza = altezza;
		this.perimetro =calcolaPerimetro();
		this.superficie = calcolaSuperficie();
	}
	public double calcolaSuperficie() {
		 System.out.println("ho usato il calcolo del rettangolo");
		return base.lunghezza * altezza.lunghezza;
	}
	public double calcolaPerimetro () {
		return 2*(base.lunghezza+ altezza.lunghezza);
	}
	/*@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro=" + perimetro + ", superficie="
				+ superficie + "]";
	}*/
	
	
	
	

}
