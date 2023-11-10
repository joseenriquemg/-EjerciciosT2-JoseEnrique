package condicionales;

import java.util.Scanner;

public class Ejercicio08 {
	/*
	 * PRUEBA 1: dias = 8 y distancia 900. 
	 * Resultado esperado = Su precio con el descuento aplicado es de 1575.0 €. 
	 * Resultado obtenido = Su precio con el descuento aplicado es de 1575.0 €.
	 * 
	 * PRUEBA 2: dias = 3 y distancia 900. 
	 * Resultado esperado = Su precio final es de 2250.0 €.
	 * Resultado obtenido = Su precio final es de 2250.0 €.
	 * 
	 * PRUEBA 3: dias = 3 y distancia 300.
	 * Resultado esperado = Su precio final es de 750.0 €. 
	 * Resultado obtenido = Su precio final es de 750.0 €.
	 * 
	 * PRUEBA 4: dias = 8 y distancia 300.
	 * Resultado esperado = Su precio final es de 750.0 €. 
	 * Resultado obtenido = Su precio final es de 750.0 €. 
	 */

	public static void main(String[] args) {
		//Creamos las variables que le vamos a solicitar al usuario. 
		int dias;
		double distancia;
		//Creamos la variable para el precio sin el descuento.
		double precio;
		//Creamos la variable para el precio con el descuento.
		double oferta;
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario el numero de dias de estancia.
		System.out.println("Introduzca el número de dias de su estancia:");
		//Leemos el número del teclado.
		dias = sc.nextInt();
		//Pedimos al usuario la distancia a realizar.
		System.out.println("Introduzca el número de Kilómetros que tiene que realizar:");
		//Leemos el número del teclado.
		distancia = sc.nextDouble();
		//Operaciones para calcular el precio sin descuento.
		precio = distancia * 2.5;
		//Creamos las condición para aplicar el descuento.
		if (dias > 7 && distancia > 800) {
			//Operación para crear el descuento.
			oferta = precio * 0.7;
			//Ofrecemos el resultado al usuario si se ha aplicado el descuento.
			System.out.println("Su precio con el descuento aplicado es de " + oferta + " €.");
		}else {
			//Ofrecemos el resultado para aquellos usuarios a los que no se le aplica el descuento.
			System.out.println("Su precio final es de " + precio + " €.");
		}
		//Cerramos el Scanner.
		sc.close();

	}

}
