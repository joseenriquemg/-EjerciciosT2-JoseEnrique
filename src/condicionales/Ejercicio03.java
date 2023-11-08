package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		float kgcomprados;
		int animales;
		float kgconsumidos;
		float racionDiaria; 
		
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introduzca el numero de kilos comprados: ");
		kgcomprados = sc.nextFloat();
		
		System.out.println("Introduzca el numero de animales a alimentar: ");
		animales = sc.nextInt();
		
		System.out.println("Introduzca el numero de kilos consumidos: ");
		kgconsumidos = sc.nextFloat();
		
		racionDiaria = kgcomprados / animales;
		
		kgconsumidos = animales * racionDiaria;
		
		if ( animales != 0 && kgcomprados )

	}

}
