package EserciziAllenamento;

import java.util.Scanner;
/*
 Scrivere un programma che simula il gioco dei 3 numeri casuali.

Definire un'unica classe con un metodo main che contiene tutte le istruzioni del programma.

In particolare il programma deve:

generare 3 numeri casuali e salvarli in tre variabili;
creare uno Scanner per l'acquisizione dei valori da tastiera;
Finchè l'utente non indovina i tre numeri:

chiedere tre numeri all'utente;
confrontare il primo numero chiesto con il primo numero generato casualmente; stessa cosa con il secondo ed il terzo;
per ogni numero stampare se l'ha indovinato o meno
 */

public class es01_Gioco3Numeri {
	public static void main (String [] args) {
		Esempoi prova = new Esempoi(100_000);
		prova.tipo1();
		prova.tipo2();

	}
	

}
