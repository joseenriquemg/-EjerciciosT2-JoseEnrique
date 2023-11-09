package condicionales;

import java.util.Scanner;

public class Ejercicio02 {
	
	/*
	 * PRUEBA 1: 29627264. 
	 * Resultado esperado = 29627264 K. 
	 * Resultado obtenido = 29627264 K.
	 * 
	 * PRUEBA 2: 29627264K. 
	 * Resultado esperado = Error. 
	 * Resultado obtenido = Error.
	 * 
	 * PRUEBA 3: 1234.
	 * Resultado esperado = El número de DNI no es válido (debe tener 8 dígitos). 
	 * Resultado obtenido = El número de DNI no es válido (debe tener 8 dígitos).
	 * 
	 * PRUEBA 4: 45997553. 
	 * Resultado esperado = 45997553 Z. 
	 * Resultado obtenido = 45997553 Z.
	 * 
	 */
	public static void main(String[] args) {
		//Creamos nuestra variable del DNI del usuario.
		int numeroDNI;
		//Variable para recoger el calculo de la letra
		int calculo;
		//Creamos un Scanner para leer la letra.
		String letra;
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		//Pedimos un numero al usuario.
		System.out.print("Introduce el número de DNI (8 dígitos): ");
		//Leemos el numero del teclado.
		numeroDNI = sc.nextInt();
		//Añadimos las operaciones para el cálculo de la letra del DNI.
		calculo = numeroDNI % 23;
		//Creamos una condición para que se trate de un DNI real.
		if (numeroDNI >= 10000000 && numeroDNI <= 99999999) {
			//Abrimos el switch para otorgar la letra independientemente del resultado de la operación.
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
			//Otorgamos el resultado al usuario.
			System.out.println("La letra del DNI " + numeroDNI + " es: " + letra);
		} else {
			//Imprimimos el mensaje al usuario si no se cumple la condición.
			System.out.println("El número de DNI no es válido (debe tener 8 dígitos).");
		}
		//Cerramos el Scanner.
		sc.close();

		}

	}

