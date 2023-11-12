package bucles;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * PRUEBA 1: -73. 
	 * Resultado esperado = Hay 0 números primos entre 1 y 73. 
	 * Resultado obtenido = Hay 0 números primos entre 1 y 73.
	 * 
	 * PRUEBA 2: 73. 
	 * Resultado esperado = Hay 21 números primos entre 1 y 73.
	 * Resultado obtenido = Hay 21 números primos entre 1 y 73.
	 * 
	 */

	public static void main(String[] args) {
		//Creamos nuestra variable que almacena los números primos.
		int contadorPrimos = 0;
		//Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		//Solicitamos un número al usuario.
		System.out.print("Introduzca un número: ");
		//Leemos el número del teclado.
		int numero = sc.nextInt();
		//Iniciamos un bucle for para buscar números primos.
		for (int i = 2; i <= numero; i++) {
			//Creamos una boleana.
			boolean primo = true;
			//Segundo bucle for.
			for (int j = 2; j < i; j++) {
				//Creamos la condición.
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			//Creamos la condición para el resultado.
			if (primo) {
				contadorPrimos++;
			}
		}
		//Imprimimos el resultado al usuario.
		System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + numero + ".");
		//Cerramos el Scanner.
		sc.close();
	}
}
