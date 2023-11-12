package bucles;

import java.util.Scanner;

public class Ejercicio05 {
	/*
	 * PRUEBA 1: 4 y 4. 
	 * Resultado esperado = El mínimo común múltiplo de -4 y -4 es: -4. 
	 * Resultado obtenido = El mínimo común múltiplo de -4 y -4 es: -4.
	 * 
	 * PRUEBA 2: 4 y 4. 
	 * Resultado esperado = El mínimo común múltiplo de 4 y 4 es: 4.
	 * Resultado obtenido = El mínimo común múltiplo de 4 y 4 es: 4.
	 * 
	 */

	public static void main(String[] args) {
		//Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		//Solicitamos el primer número al usuario.
		System.out.print("Ingrese el primer número: ");
		//Leemos el número del teclado.
		int a = sc.nextInt();
		//Solicitamos el segundo número al usuario.
		System.out.print("Ingrese el segundo número: ");
		//Leemos el número del teclado.
		int b = sc.nextInt();
		//Creamos la variable donde vamos a recoger el mcm.
		int maximo = Math.max(a, b);
		// Utilizaremos un bucle for para encontrar el primer múltiplo común.
		for (int i = maximo;; i++) {
			//Creamos la condición para realizar el mcm.
			if (i % a == 0 && i % b == 0) {
				//Imprimimos el resultado al usuario.
				System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + i);
				//Salimos del bucle con un break.
				break;
			}
		}
		//Cerramos el Scanner.
		sc.close();

	

}

}
