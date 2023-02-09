package test;

public class quadratoasterischi {
	public static void main (String [] args) {

	for(int righe = 1 ;righe <=4;righe++) {
		for(int colonne = 1;colonne <=4 ;colonne++) {
			if (righe ==4 || colonne == 4) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	int [] g = {1,2,3};
	for (int i = 0; i<g.length;i++ ) {
		System.out.print(g[i]+ " ");
	}
	System.out.println();
	int temp ;
	temp = g[2];
	g[2]= g[1];
	g[1]=temp;
	for (int i = 0; i<g.length;i++ ) {
		System.out.print(g[i]+ " ");
	}
	}

}
