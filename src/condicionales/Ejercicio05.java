package condicionales;

import java.util.Scanner;

public class Ejercicio05 {
	/*
	 * PRUEBA 1: -1. 
	 * Resultado esperado = 1. 
	 * Resultado obtenido = 1.
	 * 
	 * PRUEBA 2: 1. 
	 * Resultado esperado = 1. 
	 * Resultado obtenido = 1.
	 * 
	 * PRUEBA 3: 0. 
	 * Resultado esperado = 0. 
	 * Resultado obtenido = 0.
	 */
	public static void main(String[] args) {
		//Variable que recoge el numero del usuario.
		int num;
		//Abrimos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		//Pedimos un número al usuario para hacerle el valor absoluto.
		System.out.println("Introduzca el número del que deseas saber su valor absoluto:");
		//Leemos el número del teclado.
		num = sc.nextInt();
		//Añadimos las operaciones necesarias.
		num = num < 0  ? num * -1 : num;
		//Imprimimos el resultado al usuario.
		System.out.println("El valor absoluto es: " + num + ".");
		//Cerramos el Scanner.
		sc.close();

	}

}
