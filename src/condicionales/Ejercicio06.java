package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int resultado;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
        // Generar un número aleatorio entre 1 y 99
        num1 = random.nextInt(99) + 1;
     

        // Generar un número aleatorio entre 1 y 99
        num2 = random.nextInt(99) + 1;
        
        System.out.println("Exprese el resultado de la suma ede los siguientes números: " + num1 + " + " +num2);
        resultado = sc.nextInt();
        if (num1 + num2 == resultado) {
        	System.out.println("El resultado es correcto.");
        } else {
        	System.out.println("El resultado es erróneo.");
        }
	
	}

}
