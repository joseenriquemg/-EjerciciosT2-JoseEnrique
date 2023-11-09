package condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	/*
	 * PRUEBA 1: Numero 1. 
	 * Resultado esperado = uno. 
	 * Resultado obtenido = uno.
	 * 
	 * PRUEBA 2: Numero 15. 
	 * Resultado esperado = quince. 
	 * Resultado obtenido = quince.
	 * 
	 * PRUEBA 3: Numero 21.
	 * Resultado esperado = veintiuno. 
	 * Resultado obtenido = veintiuno.
	 * 
	 * PRUEBA 4: Numero 45. 
	 * Resultado esperado = cuarenta y cinco. 
	 * Resultado obtenido = cuarenta y cinco.
	 * 
	 * PRUEBA 5: Numero -1. 
	 * Resultado esperado = El valor introducido es erróneo.
	 * Resultado obtenido = El valor introducido es erróneo.
	 * 
	 * PRUEBA 6: Numero 101. 
	 * Resultado esperado = El valor introducido es erróneo.
	 * Resultado obtenido = El valor introducido es erróneo.
	 */
	public static void main(String[] args) {
		// Creamos la variable en la que el usuario pondra su numero.
		int num;
		//Creamos una variable String para almacenar la cadena de texto.
		String ultimaCifra = "";
		//Creamos un Scanner para leer el numero del usuario.
		Scanner sc = new Scanner(System.in);
		//Solicitamos el numero con el que vamos a trabajar al usuario.
		System.out.println("Introduzca un número entre 1 y 99: ");
		//Leemos el numero del teclado.
		num = sc.nextInt();
		//Añadimos una condición paera solo trabajar con los numeros dentro del rango.
		if (num > 0 && num < 100) {
			//Primera condición para números entre 10 y 20.
			if (num >= 10 && num <= 20) {
				//Abrimos la cadena:
				ultimaCifra = switch (num) {
				case 10 -> "diez";
				case 11 -> "once";
				case 12 -> "doce";
				case 13 -> "trece";
				case 14 -> "catorce";
				case 15 -> "quince";
				case 16 -> "dieceseis";
				case 17 -> "diecesiete";
				case 18 -> "dieciocho";
				case 19 -> "diecinueve";
				case 20 -> "veinte";
				default -> "";
				};
			}
			//Segunda condición para números entre 21 y 99.
			if (num >= 21 && num <= 99) {
				//Abrimos la cadena:
				ultimaCifra = switch (num / 10) {
				case 2 -> "veinti";
				case 3 -> "treinta y ";
				case 4 -> "cuarenta y ";
				case 5 -> "cincuenta y ";
				case 6 -> "sesenta y ";
				case 7 -> "setenta y ";
				case 8 -> "ochenta y ";
				case 9 -> "noventa y ";
				default -> "";
				};
			}
			//Tercera condición para la úlñtima cifra entre los números menos que 10 y mayores que 20.
			if (num < 10 || num > 20) {
				//Abrimos la cadena:
				ultimaCifra = ultimaCifra + switch (num % 10) {
				case 1 -> "uno";
				case 2 -> "dos";
				case 3 -> "tres";
				case 4 -> "cuatro";
				case 5 -> "cinco";
				case 6 -> "seis";
				case 7 -> "siete";
				case 8 -> "ocho";
				case 9 -> "nueve";
				default -> "";
				};
			}
			//Imprimimos la solucion al usuario.
			System.out.println("Su numero escrito es: " + ultimaCifra + ".");
		//Cerramos la condición pricipal para delimitar con que números no trabajaremos.
		} else {
			//Imprimimos el mensaje al usuario si no se cumple la condición.
			System.out.println("El valor introducido es erróneo.");
		}
		//Cerramos el Scanner.
		sc.close();

	}
}
