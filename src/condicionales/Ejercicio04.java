package condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		int num;
		String letras = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entre 1 y 99: ");
		num = sc.nextInt();
		
		
		letras = switch (num) {
		case 1 -> "uno";
		case 2 -> "dos";
		case 3 -> "tres";
		case 4 -> "cuatro";
		case 5 -> "cinco";
		case 6 -> "seis";
		case 7 -> "siete";
		case 8 -> "ocho";
		case 9 -> "nueve";
		case 10 -> "diez";
		case 11 -> "onces";
		case 12 -> "doce";
		case 13 -> "trece";
		case 14 -> "catorce";
		case 15 -> "quince";
		case 16 -> "dieceseis";
		case 17 -> "dicesiete";
		case 18 -> "dieciocho";
		case 19 -> "diecinueve";
		default -> "";
		};
		System.out.println("Su numero escrito es: " + letras);
		
		
		

	}

}
