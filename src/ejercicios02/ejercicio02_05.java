package ejercicios02;

import java.util.Scanner;

public class ejercicio02_05 {

	public static void main(String[] args) {
		// Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar si están en la misma fila, 
		// columna, o en la misma diagonal

		Scanner teclado = new Scanner(System.in);
		
		int fila1;
		int columna1;
		int fila2;
		int columna2;
		
		System.out.println("Introduce un numero de fila1");
		fila1 = teclado.nextInt();
		System.out.println("Introduce un numero de columna1");
		columna1 = teclado.nextInt();
		System.out.println("Introduce un numero de fila2");
		fila2 = teclado.nextInt();
		System.out.println("Introduce un numero de columna2");
		columna2 = teclado.nextInt();
		
		if (fila1<1 || fila1> 8 || columna1<1 || columna1>8 ||
			fila2<1 || fila2> 8 || columna2<1 || columna2>8) {
			System.out.println("fuera de rango");
			System.exit(0);
		}


		if (fila1 == fila2) {
			System.out.println("coinciden en la fila");
		} else if (columna1==columna2) {
			System.out.println("coinciden en la columna");
		} else if ((fila1-fila2)==(columna1-columna2)) {
			System.out.println("diagonal secunaria");
		} else if ((fila1-fila2)== -(columna1-columna2)) {
			System.out.println("diagonal principal");
		} else if ((fila1-fila2)!=(columna1-columna2)) {
			System.out.println("No está en diagonal");
		}

			
		
		teclado.close();
		
	}

}
