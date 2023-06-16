package ejercicios02;

import java.util.Scanner;

public class ejercicio02_04 {

	public static void main(String[] args) {
		// Algoritmo que pida tres números de tipo entero y compruebe si es posible que exista un triángulo con esas dimensiones.
		
		Scanner teclado = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Introduce un numero");
		num1 = teclado.nextInt();
		System.out.println("Introduce otro numero");
		num2= teclado.nextInt();
		System.out.println("Introduce otro numero");
		num3 = teclado.nextInt();
		
		if (((num1+num2)>num3) && ((num1+num3)>num2) && ((num2+num3)>num1)) {
			System.out.println("Es posible un triángulo con esas dimensiones");
		} else {
			System.out.println("No es posible un triangulo con esas dimensiones");
		}
		
		teclado.close();
		
	}

}
