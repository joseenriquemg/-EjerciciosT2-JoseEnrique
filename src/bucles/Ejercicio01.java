package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int segundos;
		int minutos;
		int horas;
		int aumento;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de horas:");
		horas = sc.nextInt();
		System.out.println("Introduzca el número de minutos:");
		minutos= sc.nextInt();
		System.out.println("Introduzca el número de segundos:");
		segundos = sc.nextInt();
		System.out.println("Indique cuantos segundos desea añadir:");
		aumento = sc.nextInt();
		
		for ( int i = 0; i < aumento; i++)
			segundos++; 
		if ( segundos > 59 ) {
			segundos = segundos - segundos++;
			minutos ++;
		}
		if ( minutos > 59 ) {
			minutos = minutos - minutos++;
			horas ++;
		}
		System.out.println( + horas + " : " + minutos + " : " + segundos);

	}

}
