package gioco;

import java.util.Scanner;

public class CartaForbiceSasso {
	public static void main(String[] args) {
		String sceltaUmano = chiediUmano();
		String sceltaPC = chiediPC();
		String result = valuta(sceltaUmano,sceltaPC);
		System.out.println("ha vinto: " + result);
		System.out.println("pc: " + sceltaPC);
		System.out.println("umano: " + sceltaUmano);
	}

	public static String valuta(String sceltaUmano, String sceltaPC) {
		String result = null;
		if (sceltaUmano.equalsIgnoreCase(sceltaPC)) {
			result= "pareggio";
		}else {
			if (sceltaUmano.equalsIgnoreCase("forbici")  ) {
				if (sceltaPC.equalsIgnoreCase("carta")) {
				result = "umano";
				}else {result = "Pc";}
				
			} 
			else if (sceltaUmano.equalsIgnoreCase("carta")  ) {
				
				if (sceltaPC.equalsIgnoreCase("sasso")) {
					result = "umano";
				}else {result = "Pc";}
			} 
			if (sceltaUmano.equalsIgnoreCase("sasso") ){
				if(sceltaPC.equalsIgnoreCase("forbici"))
				result = "umano";
				else {result = "Pc";}
			} 

		}
		return result;
	}

	public static String chiediPC() {
		double casuale =Math.random();
		if (casuale<0.33) {
			return "carta";
			
		}else if (casuale<0.66) {
			return "forbici";
		}
		return "sasso";
	}

	private static String chiediUmano() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("quale scelta vuoi fare sasso,carta o forbici");
		
		return scanner.next();
	}

}
