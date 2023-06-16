package ejercicios02;

import java.util.Scanner;

public class Ejercicio02_01 {

	public static void main(String[] args) {
		// Algoritmo  que  pida  dos  enteros  y  que  indique  el  mayor  y  el  menor,  o  si  ambos  son  iguales.
		
		Scanner teclado = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Introduce un numero:");
		num1= teclado.nextDouble();
		System.out.println("Introduce otro numero:");
		num2= teclado.nextDouble();

		if (num1==num2) {
			System.out.println("los dos números son iguales");
		} else if(num1<num2) {
			System.out.println("El menor es "+num1+ " y el mayor es "+num2);
		} else {
			System.out.println("El menor es "+num2+ " y el mayor es "+num1);
			
		teclado.close();
		}
	}
}
