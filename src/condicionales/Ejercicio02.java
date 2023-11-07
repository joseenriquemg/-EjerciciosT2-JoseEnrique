package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
	int numeroDNI;
		 	int calculo;
		 	String letraDNI;
		 
		 	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Introduce el número de DNI (8 dígitos): ");
		        numeroDNI = scanner.nextInt();
		       
		      
		        calculo = numeroDNI % 23;
		        if (numeroDNI >= 10000000 && numeroDNI <= 99999999) {
		        	  numeroLetra = switch (calculo) {
		        	  case 0 -> "T"
		        	    case 1 -> "R";
		        		case 2 -> "W";
		        		case 3 -> "A";
		        		case 4 -> "G";
		        		case 5 -> "G";
		        		case 6 -> "M";
		        		case 7 -> "Y";
		        		case 8 -> "F";
		        		case 9 -> "P";
		        		case 10 -> "";
		        		case 11 -> "T";
		        		case 12 -> "T";
		        		case 13 -> "T";
		        		case 14 -> "T";
		        		case 15 -> "T";
		        		case 16 -> "T";
		        		case 17 -> "T";
		        		case 18 -> "T";
		        		case 19 -> "T";
		        		case 20 -> "T";
		        		case 21 -> "T";
		        		case 22 -> "T";
		        		default -> ""
		        		
		            System.out.println("La letra del DNI " + numeroDNI + " es: " + letraDNI);
		        } else {
		            System.out.println("El número de DNI no es válido (debe tener 8 dígitos).");
		        }
		       
		        
		        scanner.close();
		    

		     
		       
		        
		    }
		
	}
