package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numeroDNI;
		int calculo;
		String letra;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el número de DNI (8 dígitos): ");
		numeroDNI = sc.nextInt();

		calculo = numeroDNI % 23;
		if (numeroDNI >= 10000000 && numeroDNI <= 99999999) {
			letra = switch (calculo) {
			case 0 -> "T";
			case 1 -> "R";
			case 2 -> "W";
			case 3 -> "A";
			case 4 -> "G";
			case 5 -> "M";
			case 6 -> "Y";
			case 7 -> "F";
			case 8 -> "P";
			case 9 -> "D";
			case 10 -> "X";
			case 11 -> "B";
			case 12 -> "N";
			case 13 -> "J";
			case 14 -> "Z";
			case 15 -> "S";
			case 16 -> "Q";
			case 17 -> "V";
			case 18 -> "H";
			case 19 -> "L";
			case 20 -> "C";
			case 21 -> "K";
			case 22 -> "E";
			default -> "Su DNI no es correcto, reviselo porfavor";
			};

			System.out.println("La letra del DNI " + numeroDNI + " es: " + letra);
		} else

		{
			System.out.println("El número de DNI no es válido (debe tener 8 dígitos).");

			sc.close();

		}

	}
}
