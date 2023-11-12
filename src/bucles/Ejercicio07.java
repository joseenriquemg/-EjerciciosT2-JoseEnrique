package bucles;

import java.util.Scanner;

public class Ejercicio07 {
	/*
	 * PRUEBA 1: 5. 
	 * Resultado esperado = 1
							121
							12321
							1234321
							123454321 
	 * Resultado obtenido = 1
							121
							12321
							1234321
							123454321
	*/

	public static void main(String[] args) {
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		// Solicitamos al usuario que ingrese un número.
		System.out.print("Ingrese un número para la altura de la pirámide: ");
		int n = sc.nextInt();

		// Imprimimos la pirámide.
		for (int i = 1; i <= n; i++) {
			// Imprimimimos espacios en blanco para alinear los números.
			for (int j = 1; j <= n - i; j++) {
			}
			// Creamos el bucle for.
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			// Imprimimos el resultado del bucle for.
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}
			// Salto de linea.
			System.out.println();
		}
		//Cerramos el Scanner.
		sc.close();

	}

}
