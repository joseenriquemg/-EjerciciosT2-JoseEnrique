package bucles;

import java.util.Scanner;

public class Ejercicio06 {
	/*
	 * PRUEBA 1: 5. 
	 * Resultado esperado =    1 
	 						  2 2 
	 						 3 3 3 
	 						4 4 4 4 
	 					   5 5 5 5 5 . 
	 * Resultado obtenido =    1 
	 						  2 2 
	 						 3 3 3  
	 						4 4 4 4 
	 					   5 5 5 5 5 .
	*/

	public static void main(String[] args) {
		//Creamos un nuevo Scanner.
		Scanner scanner = new Scanner(System.in);
		// Solicitamos al usuario que ingrese un número entre 0 y 20.
		System.out.print("Ingrese un número entero entre 0 y 20: ");
		//Leemos el número del teclado.
		int n = scanner.nextInt();
		// Verificamos que el número esté en el rango correcto.
		if (n < 0 || n > 20) {
			//Imprimimos el resultado en casdo erroneo.
			System.out.println("El número ingresado no está en el rango válido.");
			return;
		}
		//Creamos las operaciones para conseguir el resultado con un bucle for
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				//Mostramos el resultado al usuario.
				System.out.print(i);
			}
			//Dejamos linea en blanco.
			System.out.println();
		}
		//Cerramos el Scanner.
		scanner.close();

	}

}
