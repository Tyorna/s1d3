package giorno3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prova();
	}
	
	public static void dividi(String car) {
		int i= 0;
		if(car.equals(":q")) {
			System.out.println("Hai finito!");
		} else {
		
		while (i < car.length()) {
	    System.out.println(car.charAt(i) + ",");
	    i++;
	} 
		prova();
		}
		
	}
	
	public static void prova() {
		Scanner caratteri = new Scanner(System.in);
		System.out.println("Separa la tua frase in lettere");
		String parola = caratteri.nextLine();
		dividi(parola);
		caratteri.close();
		}
	
}
	
