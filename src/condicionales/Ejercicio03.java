package condicionales;

import java.util.Scanner;

public class Ejercicio03 {
	/*
	 * PRUEBA 1: 2, 7, 3. 
	 * Resultado esperado = No hay suficiente comida para todos los animales.
							Cada animal debería recibir 0.2857142857142857 kilos de comida diariamente.
	 * Resultado obtenido = No hay suficiente comida para todos los animales.
							Cada animal debería recibir 0.2857142857142857 kilos de comida diariamente.
	 * 
	 * PRUEBA 2: 15, 2, 7. 
	 * Resultado esperado = ¡Hay suficiente comida para todos los animales!.
	 * Resultado obtenido = ¡Hay suficiente comida para todos los animales!.
	 */ 

	public static void main(String[] args) {
		//Creamos nuestras variables.
		double cantidadComida;
		int numeroAnimales; 
		double kilosComidaDiaria;
		//Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
	    //Solicitamos el numero al usuario.
        System.out.println("Ingrese la cantidad total de comida comprada (en kilos): ");
        //Leemos el numero del teclado.
        cantidadComida = sc.nextDouble();
        //Solicitamos el numero al usuario.
        System.out.println("Ingrese el número total de animales: ");
        //Leemos el numero del teclado.
        numeroAnimales = sc.nextInt();
        //Solicitamos el numero al usuario.
        System.out.println("Ingrese la cantidad total de kilos de comida que comen todos los animales diariamente: ");
        //Leemos el numero del teclado.
        kilosComidaDiaria = sc.nextDouble();
        // Verificamos si se dispone de alimento suficiente.
        if (numeroAnimales > 0 && kilosComidaDiaria > 0) {
            double totalNecesarioDiario = numeroAnimales * kilosComidaDiaria;
            //Aplicamos una condición y mostramos el resultado al usuario.
            if (cantidadComida >= totalNecesarioDiario) {
                System.out.println("¡Hay suficiente comida para todos los animales!");
            } else {
                double racionDiaria = cantidadComida / numeroAnimales;
                System.out.println("No hay suficiente comida para todos los animales.");
                System.out.println("Cada animal debería recibir " + racionDiaria + " kilos de comida diariamente.");
            }
        } else {
            System.out.println("Los datos ingresados no son válidos. Asegúrese de ingresar valores mayores a cero.");
        }
        //Cerramos el Scanner.
        sc.close();

	}

}
