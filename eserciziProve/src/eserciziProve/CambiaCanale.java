package eserciziProve;

import java.util.Scanner;


public  class CambiaCanale extends dati {
	Scanner scanner = new Scanner (System.in);
	 
	


	

	public CambiaCanale(int f, boolean g, int volume, String colore) {
		super(f, g, volume, colore);
	}

	
	public void accendiSpegni () {
		
		String status = scanner.nextLine();
		
		if(status.equalsIgnoreCase("accendi")){
			setG(true) ;
			System.out.println("la televisione si accende");
		}else if (status.equalsIgnoreCase("spegni")) {
			setG(false) ;
			System.exit(0);
		}
	
		
	}
	
	public void cambia () {
		
		if (isG()) {
			setF(scanner.nextInt());
		System.out.println("sei al canale: " + getF());
		}
		else {
			System.out.println("la televisione è spenta");
		}
		
	}
	
	public void audio() {
		String aaa = scanner.next();
		
		
		if(aaa.equalsIgnoreCase("+")){
			/*int up = getVolume();
			up++;
			setVolume(up);*/
			setVolume(getVolume()+1);
			System.out.println("il volume e: " + getVolume());
		}else if (aaa.equalsIgnoreCase("-")) {
			/*int down = getVolume();
			down--;
			setVolume(down);*/
			setVolume(getVolume() - 1);
			System.out.println("il volume e: " + getVolume());
			
		}
		//System.out.println("il volume e: " + getVolume());
		
		
		
	}
	
	

	

	
	
	
}
