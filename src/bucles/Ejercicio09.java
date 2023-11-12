package bucles;

import java.util.Scanner;

public class Ejercicio09 {
	/*
	 * PRUEBA 1: 4. 
	 * Resultado esperado = El número 4 tiene 1 dígitos. 
	 * Resultado obtenido = El número 4 tiene 1 dígitos.
	 * 
	 * PRUEBA 2: 3456. 
	 * Resultado esperado = El número 3456 tiene 4 dígitos.
	 * Resultado obtenido = El número 3456 tiene 4 dígitos.
	 */

	public static void main(String[] args) {
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		// Solicitamos al usuario que ingrese un número mayor que 0.
		System.out.print("Ingrese un número mayor que 0: ");
		//Leemos el número del Scanner.
		int numero = sc.nextInt();
		//Verificamos que el número sea mayor que 0.
		if (numero <= 0) {
			System.out.println("Por favor, ingrese un número mayor que 0.");
			return;
		}
		//Contaremos en esta variable la cantidad de dígitos utilizando un bucle.
		int contadorDigitos = 0;
		int numeroTemp = numero;
		//Creamos un bucle para contar los dígitos.
		for (; numeroTemp != 0; numeroTemp /= 10) {
			contadorDigitos++;
		}
		//Imprimimos el resultado.
		System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");
		//Cerramos el Scanner.
		sc.close();

	}

}
