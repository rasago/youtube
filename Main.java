package com.dam.rafa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int suma = 0;
		int numero;
		
		System.out.println("Introduce hasta que numero de la serie Fibonacci quieres ver: ");
		numero = teclado.nextInt();
		
		System.out.println(a);	
		System.out.println(b);		

		
		if (numero > 0) {
			
			for (int i = 0; i <= numero - 2 ; i++) {
				
				suma = a + b;
				a = b;
				b = suma;

				
				System.out.println(suma);

			}
			
			
		}
		
		
		
		
		
		
	}

}
