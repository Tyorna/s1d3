package giorno3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner caratteri = new Scanner(System.in);
		System.out.println("Separa la tua frase in lettere");
		String parola = caratteri.nextLine();
		dividi(parola);
		caratteri.close();
	}
	
	public static void dividi(String car) {
		int i= 0;
		while (i < car.length()) {
	    System.out.println(car.charAt(i) + ",");
	    i++;
	} 
	}
	
}
	
