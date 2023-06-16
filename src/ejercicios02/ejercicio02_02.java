package ejercicios02;

import java.util.Scanner;

public class ejercicio02_02 {

	public static void main(String[] args) {
		// Algoritmo que pida 3 números e indique cual es el menor de los tres.
		
		Scanner teclado= new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Introduce un numero");
		num1 = teclado.nextDouble();
		System.out.println("Introduce otro numero");
		num2 = teclado.nextDouble();
		System.out.println("Introduce otro numero");
		num3 = teclado.nextDouble();
		
		if ((num1==num2) && (num2==num3)) {
			System.out.println("Los numeros son iguales");
			
		} else if ((num1 < num2) && (num1< num3)) {
			System.out.println("El numero menor es: "+ num1);
			
		} else if ((num1 > num2) && (num2 < num3))  {
			System.out.println("El numero menor es: "+ num2);
			
		} else {
			System.out.println("El numero menor es: "+ num3);
		}
		teclado.close();
		
			
			
	}

}
