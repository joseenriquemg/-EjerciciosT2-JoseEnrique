package bucles;

import java.util.Scanner;

public class Ejercicio08 {
	/*
	 * PRUEBA 1: 5, 6, 7, 4, 8, 0 . 
	 * Resultado esperado = Introduce un número: 5
							Introduce un número: 6
							Introduce un número: 7
							Introduce un número: 4
							Número no válido. Debe ser mayor que el último introducido.
							Introduce un número: 8
							Introduce un número: 0
							Resumen:
							Total de números introducidos (excluyendo 0): 5
							Total de números fallados: 1 
	 *
	 * Resultado obtenido = Introduce un número: 5
							Introduce un número: 6
							Introduce un número: 7
							Introduce un número: 4
							Número no válido. Debe ser mayor que el último introducido.
							Introduce un número: 8
							Introduce un número: 0
							Resumen:
							Total de números introducido (excluyendo 0): 5
							Total de números fallados: 1 
	*/

	public static void main(String[] args) {
        //Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		//Creamos nuestras variables necesarias.
        int ultimoNumero = 0;
        int numeroActual;
        int totalNumerosIntroducidos = 0;
        int totalNumerosFallados = 0;
        //Forma de terminar el programa.
        System.out.println("Introduce números. Para finalizar, introduce 0:");
        //Creamos un do while para pedirle un numero al usuario con condiciones.
        do {
            System.out.print("Introduce un número: ");
            numeroActual = sc.nextInt();
            //Creamos la condicion para que sigan siendo validos.
            if (numeroActual != 0) {
                totalNumerosIntroducidos++;
                //Condición para aquellos numeros no validos.
                if (numeroActual <= ultimoNumero) {
                    System.out.println("Número no válido. Debe ser mayor que el último introducido.");
                    totalNumerosFallados++;
                } else {
                    ultimoNumero = numeroActual;
                }
            }
        } while (numeroActual != 0);
        //Imprimimos el resultado al usuario.
        System.out.println("Resumen:");
        System.out.println("Total de números introducidos (excluyendo 0): " + totalNumerosIntroducidos);
        System.out.println("Total de números fallados: " + totalNumerosFallados);
        //Cerramos el Scanner.
        sc.close();


	}

}
