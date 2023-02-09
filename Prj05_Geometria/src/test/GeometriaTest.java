package test;

import javax.xml.parsers.FactoryConfigurationError;

import modello.FiguraGeometrica;
import modello.Punto;
import modello.Quadrato;
import modello.Rettangolo;
import modello.Segmento;
import modello.Triangolo;

public class GeometriaTest {
	public static void main(String[] args) {
		Punto a = new Punto (3,2);
		Punto b = new Punto (7,2);
		Punto c = new Punto (3,5);
		
		Segmento ab = new Segmento(a, b);
		Segmento ac = new Segmento(a, c);
		Segmento bc = new Segmento(b, c);
		
		Triangolo t = new Triangolo (a,b,c);
		Rettangolo r = new Rettangolo (ab,ac);
		Quadrato q = new Quadrato (ab);
		
		FiguraGeometrica[] forme = {t,r,q};
		
		for (FiguraGeometrica forma : forme) {
			System.out.println(forma.toString());
			
		}
	}

}
