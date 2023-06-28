package giorno3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci un numero da 0 a 3");
		int number = input.nextInt();
		input.close();
		
			switch (number) {
			case 0: {
				System.out.println("Hai inserito: Zero");
				break;
		}
			case 1: {
				System.out.println("Hai inserito: Uno");
					break;
			}
				case 2: {
				System.out.println("Hai inserito: Due");
					break;
			}
			case 3: {
				System.out.println(" Hai inserito: Tre");
				break;
		}
				default:
				System.out.println("Errore, numero non riconosciuto");
				}
	}

}
