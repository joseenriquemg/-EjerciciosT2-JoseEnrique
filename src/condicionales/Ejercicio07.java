package condicionales;

import java.util.Scanner;

public class Ejercicio07 {
	/*
	 * PRUEBA 1: 01 : 01 : 01. 
	 * Resultado esperado = 01 : 01 : 02. 
	 * Resultado obtenido = 01 : 01 : 02.
	 * 
	 * PRUEBA 2: 01 : 59 : 59.
	 * Resultado esperado = 02 : 00 : 00. 
	 * Resultado obtenido = 02 : 00 : 00.
	 * 
	 * PRUEBA 3: 23 : 59 : 59. 
	 * Resultado esperado = 00 : 00 : 00. 
	 * Resultado obtenido = 00 : 00 : 00.
	 */

	public static void main(String[] args) {
		//Creamos nuestras variales principales.
		int horas;
		int minutos; 
		int segundos;
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		//Introduzca el numero de horas.
		System.out.println("Introduce las horas:");
		//Leemos el numero del teclado.
		horas = sc.nextInt();
		//Introduzca el numero de minutos.
		System.out.println("Introduzca los minutos:");
		//Leemos el numero del teclado.
		minutos = sc.nextInt();
		//Introduzca el numero de segundos.
		System.out.println("Introduzca los segundos:");
		//Leemos el numero del teclado.
		segundos = sc.nextInt();
		//Añadimos un contador de segundos.
        segundos++;
        //Aplicamos las operaciones con una ternaria.
        segundos = (segundos == 60) ? 0 : segundos;
        minutos = (segundos == 0) ? minutos + 1 : minutos;
        minutos = (minutos == 60) ? 0 : minutos;
        horas = (minutos == 0 && segundos == 0) ? horas + 1 : horas;
        horas = (horas == 24) ? 0 : horas;
        //Imprimimos el resultado al usuario.
        System.out.printf("Después de incrementar un segundo, la nueva hora es: " + horas +" : " + minutos + " : " + segundos);
        //Cerramos el Scanner
        sc.close();

}}
