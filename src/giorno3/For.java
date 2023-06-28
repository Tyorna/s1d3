package giorno3;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner contoR = new Scanner(System.in);
		System.out.println("inserisci un numero per far partire il conto alla rovescia");
		int inizio = contoR.nextInt();
		rovescia(inizio);
		contoR.close();
	}

	public static void rovescia(int n1) {
		for (int i = n1; i <= n1; i--) {
		System.out.println("Meno " + i);
		if ( i == 0) {
			break;
		}
	}
	}
}
