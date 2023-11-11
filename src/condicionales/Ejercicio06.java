package condicionales;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio06 {
	/*
	 * PRUEBA 1: 15 + 22 = 37. 
	 * Resultado esperado = El resultado es correcto. 
	 * Resultado obtenido = El resultado es correcto.
	 * 
	 * PRUEBA 2: 29 + 62 = 23. 
	 * Resultado esperado = El resultado es erróneo. 
	 * Resultado obtenido = El resultado es erróneo.
	 */
	public static void main(String[] args) {
		//Creamos las variables para los números aleatorios que nos da la maquina.
		int num1;
		int num2;
		//Tambien la variable de la suma.
		int resultado;
		//Creamos un generador de numeros random.
		Random random = new Random();
		//Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
        // Generar un primer número aleatorio entre 1 y 99
        num1 = random.nextInt(99) + 1;
        // Generar un segundo número aleatorio entre 1 y 99
        num2 = random.nextInt(99) + 1;
        //Le preguntamos al usuario que nos indique el resultado de la suma.
        System.out.println("Exprese el resultado de la suma ede los siguientes números: " + num1 + " + " +num2);
        //Lo leemos del teclado
        resultado = sc.nextInt();
        //Creamos una condición para cuando el resultado es correcto.
        if (num1 + num2 == resultado) {
        	System.out.println("El resultado es correcto.");
        } else {
        	//Si es erróneo imprimiremos este otro mensaje.
        	System.out.println("El resultado es erróneo.");
        }
        //Cerramos el Scanner.
        sc.close();
	
	}

}
