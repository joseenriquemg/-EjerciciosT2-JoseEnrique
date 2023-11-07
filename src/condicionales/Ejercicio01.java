package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable que recoge el numero del usuario.
		int numero;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario comprendidio entre 0 y 9999.
		System.out.println("Introduzca un numero entre 0 y 9999: ");
		// Leemos el numero del teclado.
		numero = sc.nextInt();

		// Creamos la condicion para nuestra variable numero.
		if (numero >= 0 && numero <= 9999) {
				// Primero ponemos los números de una cifra porque siempre es capicúo.
				if (numero >= 0 && numero <= 9) {
					// Ofrecemos el resultado de la condicion anterior al usuario.
					System.out.println("Su numero es capicúa.");}
		
				// Creamos otra condición para los de dos cifras.
				if (numero >= 10 && numero <= 99) {
					if (numero % 11 == 0) {
						// Ofrecemos el resultado de la condicion anterior al usuario.
						System.out.println("Su numero es capicúa.");
					} else {
						System.out.println("Su numero no es capicúa.");}
				}
				// Creamos otra condición para los de tres cifras.
				if (numero >= 100 && numero <= 999) {
					// Creamos las operaciones para los números de tres dígitos.
					if (numero / 100 == numero % 10) {
						// Ofrecemos el resultado de la condicion anterior al usuario.
						System.out.println("Su numero es capicúa.");
					} else {
						System.out.println("Su numero no es capicúa.");}
				}
				if (numero >= 1000 && numero <= 9999) { 
					int unidad = numero % 10;
					int decena = (numero / 10) % 10;
					int centena = (numero / 100) % 10;
					int millar = numero / 1000;	
					
					if (millar == unidad && decena == centena) 
						System.out.println("Su numero es capicua.");
					else {
						System.out.println("Su numero no es capicua.");
					}
				}
		}else {
			System.out.println("Su valor no se encuentra entre los números solicitados.");
		}
	}

}
