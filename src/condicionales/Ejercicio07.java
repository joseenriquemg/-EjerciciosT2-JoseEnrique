package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int horas;
		int minutos; 
		int segundos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las horas:");
		horas = sc.nextInt();
		
		System.out.println("Introduzca los minutos:");
		minutos = sc.nextInt();
		
		System.out.println("Introduzca los segundos:");
		segundos = sc.nextInt();
		

        segundos++;

        segundos = (segundos == 60) ? 0 : segundos;
        minutos = (segundos == 0) ? minutos + 1 : minutos;
        minutos = (minutos == 60) ? 0 : minutos;
        horas = (minutos == 0 && segundos == 0) ? horas + 1 : horas;
        horas = (horas == 24) ? 0 : horas;

        System.out.printf("Después de incrementar un segundo, la nueva hora es: " + horas +" : " + minutos + " : " + segundos);

        sc.close();

}}
