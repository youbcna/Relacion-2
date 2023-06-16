package ejercicios02;

import java.util.Scanner;

public class ejercicio02_07 {

	public static void main(String[] args) {
		// Algoritmo que determine si un año dado es bisiesto o no, teniendo en cuenta
		// que son años bisiestos los
		// múltiplos de 4, excepto los que son también múltiplos de 100 pero no lo son
		// de 400.

		Scanner teclado = new Scanner(System.in);

		int año;

		System.out.print("Introduce el año para comprobar si es bisiesto o no: ");
		año = teclado.nextInt();

		if (año % 4!= 0) {
			System.out.println("No es bisiesto");
		} else if ((año%100==0)&&(año%100!=0)) {
			System.out.println("No es bisiesto");
		} else {
			System.out.println("Es bisiesto");
		}
		
		teclado.close();
		
		
		
		
		
		
		
		}
	}


