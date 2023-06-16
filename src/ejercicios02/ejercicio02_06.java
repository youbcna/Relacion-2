package ejercicios02;

import java.util.Scanner;

public class ejercicio02_06 {

	public static void main(String[] args) {
		/*
		 * Algoritmo   que   pida   los   parámetros   (a,   b   y c de   tipo   double)   de   dos   rectas,   
		 * correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, paralelas  o  secantes.  
		 * En  el  caso  de  que  sean  secantes,  hay  que  indicar  si  son  perpendiculares o no. 
		 * Las dos rectas se definen como A1x+B1y+C1=0 y A2x+B2y+C2=0, o sea que pedimos 6 valores por teclado:
		 * •Dos rectas son secantes si 𝐴1/𝐴2≠𝐵1/𝐵2
		 * •Dos rectas son perpendiculares si son secantes y 𝐴1/𝐵1=−𝐵2/𝐴2
		 * •Dos rectas son paralelas si  𝐴1/𝐴2=𝐵1/𝐵2
		 * •Dos rectas son coincidentes si son paralelas y 𝐴1/𝐴2=𝐵1/𝐵2=𝐶1/𝐶2 
		 */
	
Scanner teclado = new Scanner(System.in);
		
		double numa,numa1;
		double numb,numb1;
		double numc,numc1;
		
		System.out.println("Introduce el parametro A ");
		numa = teclado.nextDouble();
		System.out.println("Introduce el parametro B ");
		numb = teclado.nextDouble();
		System.out.println("Introduce el parametro C ");
		numc = teclado.nextDouble();
		System.out.println("Introduce el parametro A1 ");
		numa1 = teclado.nextDouble();
		System.out.println("Introduce el parametro B1 ");
		numb1 = teclado.nextDouble();
		System.out.println("Introduce el parametro C1 ");
		numc1 = teclado.nextDouble();
		
		System.out.println(numa+"x+"+ numb +"y+"+numc+"=0");
		System.out.println(numa1+"x+"+ numb1 +"y+"+numc1+"=0");
	
		
		
		
		
		System.out.println("Es secante?");
		if ((numa/numa1)!=(numb/numb1)) {
			System.out.println("SI, es secante porque se cumple la condicion");
		} else {
			System.out.println("No");
		}
		System.out.println();
		System.out.println("Son perpendiculares?");
		if (((numa/numa1)!=(numb/numb1))&&((numa/numb)==(-numb1/numa1))) {
			System.out.println("Es perpendicular porque se cumplen las condiciones");
		} else {
			System.out.println("No");
		}
		System.out.println();
		System.out.println("Son Paralelas?");
		if ((numa/numa1)==(numb/numb1)) {
			System.out.println("Es paralela");
		} else { 
			System.out.println("No");
		}
		System.out.println();
		System.out.println("Son coincidentes?");
		if (((numa/numa1)==(numb/numb1))&&((numa/numa1)==(numb/numb1)&&(numb/numb1)==(numc/numc1))) {
			System.out.println("Son coincidentes porque se cumplen las condiciones");
		} else {
			System.out.println("No");
		}
	
	
		teclado.close();
		
	}
	
}
