package giorno3;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			Scanner annoB = new Scanner(System.in);
			System.out.println("inserisci un anno per scoprire se è bisestile");
			String anno = annoB.nextLine();
		    bisestile(Integer.parseInt(anno));
			
			System.out.println("inserisci una frase e scopri se ha un numero di lettere pari o dispari");
			String frase = annoB.nextLine();
			pariDispari(frase);
			annoB.close();
	}

	public static void bisestile(int anno1) {
		if (anno1 % 100 == 0 && anno1 % 400 == 0) {
			System.out.println( anno1 + " è un anno bisestile");
			System.out.println( "True");
		} else if (anno1 % 4 == 0) {
			System.out.println( anno1 + " è un anno bisestile");
			System.out.println( "True");
		} else {
			System.out.println( anno1 + " non è un anno bisestile");
			System.out.println( "False");
		}
	}
	
	public static void pariDispari(String pari) {
		if (pari.length() % 2 == 0) {
			System.out.println( "True");
		} else {
			System.out.println( "False");
		}
	}
}
