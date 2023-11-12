package bucles;

import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * PRUEBA 1: 121. 
	 * Resultado esperado = Es capicúa. 
	 * Resultado obtenido = Es capicúa.
	 * 
	 * PRUEBA 2: 234. 
	 * Resultado esperado = No es capicúa.
	 * Resultado obtenido = No es capicúa.
	 * 
	 */


	public static void main(String[] args) {
		// Variable donde se almacenará el número
        int numero;
        // Variables donde se almacenarán los números invertidos.
        int inverso=0;
        int cifra1=0;
        int cifra2=0;
        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);
        // Le pedimos el número y lo almacenamos
        System.out.println("Introduzca un número:");
        //Leemos el numero del Scanner.
        numero = sc.nextInt();
        //Creamos un bucle para calcular el número invertido
        for(int i=numero; i!=0; i/=10) {
            //Multiplicamos x 10 las veces necesarias.
            cifra1 = inverso*10;
            //Obtenemos el resto de i/10 
            cifra2 = i%10;
        //Operación para la variable final.
        inverso = cifra1 + cifra2;
        }
        //Comprobamos si el número es igual al inverso e imprimimos el resultado al usuario.
        if (numero==inverso) {
            System.out.println("Es capicua.");
        } else {
            System.out.println("No es capicua.");
        }
        // Cerramos el Scanner
        sc.close();

	}

}
