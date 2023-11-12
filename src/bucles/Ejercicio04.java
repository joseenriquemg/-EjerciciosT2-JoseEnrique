package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
	/*
	 * PRUEBA 1: 4 y 4. 
	 * Resultado esperado = El máximo común divisor es: 4. 
	 * Resultado obtenido = El máximo común divisor es: 4.
	 * 
	 * PRUEBA 2: -4 y -4. 
	 * Resultado esperado = Escriba un número:
	 * Resultado obtenido = Escriba un número:
	 * 
	 */

	public static void main(String[] args) {
		//Creamos nuestras variables
		int numero1, numero2;
        int mcd;
        //Creamos un nuevo Scanner.
        Scanner sc = new Scanner(System.in);
        //Abrimos un try-catch para capturar los errores.
        try {
        	//Creamos un do while para pedirle al usuario un número con una condición.
            do {
                System.out.println("Escriba un número: ");
                numero1 = sc.nextInt();
            } while (numero1 <= 0);
            //Creamos un do while para pedirle al usuario un número con una condición.
            do {
                System.out.println("Escriba otro número: ");
                numero2 = sc.nextInt();
            } while (numero2 <= 0);
            //Inicimos un bucle for para calcular el MCD.
            for (mcd = numero1 < numero2 ? numero1 : numero2; mcd >= 1; mcd--) {
                //Condición para crear el bucle.
            	if (numero1 % mcd == 0 && numero2 % mcd == 0) {
                    break;
                }

            }
            //Imprimimos el resultado al usuario.
            System.out.println("El máximo común divisor es: " + mcd);
        //Capturamos los errores y indicamos el error al usuario.
        } catch (InputMismatchException e) {
            System.out.println("Valores mal introducidos");
            sc.nextLine();
        }
        //Cerramos el Scanner.
        sc.close();
	}

}
