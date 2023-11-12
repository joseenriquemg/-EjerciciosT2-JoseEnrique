package bucles;

import java.util.Scanner;

public class Ejercicio01 {
	/*
	 * PRUEBA 1: 01 : 01 : 01 + 1. 
	 * Resultado esperado = 01 : 01 : 02. 
	 * Resultado obtenido = 01 : 01 : 02.
	 * 
	 * PRUEBA 2: 01 : 01 : 01 + 72. 
	 * Resultado esperado = 01 : 02 : 13. 
	 * Resultado obtenido = 01 : 02 : 13.
	 * 
	 * PRUEBA 3: 01 : 59 : 59 + 2 .
	 * Resultado esperado = 02 : 00 : 01. 
	 * Resultado obtenido = 02 : 00 : 01.
	 * 
	 * PRUEBA 4: 23 : 59 : 59 + 2. 
	 * Resultado esperado = 00 : 00 : 01. 
	 * Resultado obtenido = 00 : 00 : 01.
	 * 
	 */

	public static void main(String[] args) {
		//Creamos las variables para recoger las horas, los minutos, los segundos y el tiempo a añadir.
		int segundos;
		int minutos;
		int horas;
		int aumento;
		//Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		//Creamos un do while para pedirle al usuario las horas con una condición.
		do {
			System.out.println("Introduzca el número de horas:");
			horas = sc.nextInt();
		} while (horas < 0 || horas > 23);
		//Creamos un do while para pedirle al usuario los minutos con una condición.
		do {
			System.out.println("Introduzca el número de minutos:");
			minutos = sc.nextInt();
		} while (minutos < 0 || minutos > 59);
		//Creamos un do while para pedirle al usuario los segundos con una condición.
		do {
			System.out.println("Introduzca el número de segundos:");
			segundos = sc.nextInt();
		} while (segundos < 0 || segundos > 59);
		//Creamos un do while para pedirle al usuario los segundos que desea añadir con una condición.
		do {
			System.out.println("Indique cuantos segundos desea añadir:");
			aumento = sc.nextInt();
		} while (segundos < 0);
		//Creamos un bucle for para poder calcular el tiempo.
		for (int i = 0; i < aumento; i++) {
			segundos++;
			//Creamos una condición para los segundos.
			if (segundos == 60) {
				segundos = 0;
				minutos++;
				//Creamos una condición para los minutos.
				if (minutos == 60) {
					minutos = 0;
					horas++;
					//Creamos una condición para las horas.
					if (horas == 24) {
						horas = 0;
					}
				}
			}
		}
		//Imprimos el resultado al usuario.
		System.out.println(+horas + " : " + minutos + " : " + segundos);
		// Cerramos el Scanner.
		sc.close();
	}
}
