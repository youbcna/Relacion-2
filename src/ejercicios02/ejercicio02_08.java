package ejercicios02;

import java.util.Scanner;

public class ejercicio02_08 {

	public static void main(String[] args) {
		
		/* Escribir  un  programa  que  implemente  una  pequeña  calculadora  con  switch-case.  
		El  programa pedirá al usuario los operandos (a y b) y la operación a realizar: suma, resta, multiplicación,   
		división,  raíz cuadrada del primer número y elevar el primer número al segundo.  
		
		En  función  de  la  opción  seleccionada  se  realizará  una  de  las  operaciones  aritméticas. */
		
		
		
		Scanner teclado = new Scanner(System.in);

		double num1;
		double num2;

		System.out.print("Introduce un numero ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce otro numero ");
		num2 = teclado.nextDouble();
	
		
	
	System.out.println("\nPosibles calculos:");

	System.out.println("1. Sumar");
	System.out.println("2. Restar");
	System.out.println("3. Multiplicar");
	System.out.println("4. Dividir");
	System.out.println("5. Raiz cuadrada");
	System.out.println("6. Exponencial del primero al segundo");
	
	
	System.out.println("\nIntroduce que calculo quieres realiar");
	int seleccionado = teclado.nextInt();
	double res=0;
	switch (seleccionado) {
	
	case 1: 
		res= num1+num2;
		break;
	case 2:
		res= num1 - num2;
		break;
	case 3: 
		res= num1*num2;
		break;
	case 4:
		res= num1/num2;
		break;
	case 5: 
		res= Math.sqrt(num1);
		break;
	case 6: 
		res= Math.pow(num2, num1);
		break;
	default: 
		System.out.println("Opcion incorrecta");
		break;
	}
	
	System.out.println("\nEl resultado es: "+ res);

		
		
	teclado.close();
		
		
		
	}

}
