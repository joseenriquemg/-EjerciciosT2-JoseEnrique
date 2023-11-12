package bucles;

import java.util.Scanner;

public class Ejercicio03 {
	/*
	 * PRUEBA 1: 5. 
	 * Resultado esperado =    * 
	 						  * * 
	 						 * * * 
	 						* * * * 
	 					   * * * * * . 
	 * Resultado obtenido =    * 
	 						  * * 
	 						 * * * 
	 						* * * * 
	 					   * * * * * .
	
	 */

	public static void main(String[] args) {
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		//Pedimos el tamaño del triángulo al usuario.
		System.out.print("Ingrese el número de asteríscos de la base: ");
		//Leemos del teclado.
		int numero = sc.nextInt();
		//Creamos las operaciones para crear el triángulo.
		for (int i = 1; i <= numero; i++) {
			// Creamos el espacio en blanco previo a los asteríscos.
			for (int j = 1; j <= numero - i; j++) {
				//Mostramos al usuario los espacios en blanco.
				System.out.print(" ");
			}
			//Creamos el for para crear los asteríscos.
			for (int k = 1; k <= i; k++) {
				//Ofrecemos al usuario el resultado de los asteríscos.
				System.out.print("* ");
			}
			//Añadimos una nueva fila para cada fila.
			System.out.println();
		}
		//Cerramos el Scanner.
		sc.close();
	}
}
