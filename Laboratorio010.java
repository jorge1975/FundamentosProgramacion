package com.jluque.semana02;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int serie=0, num1 = 0, num2 = 1, suma = 1;
		Scanner sn = new Scanner(System.in);
		
		serie = sn.nextInt();
		
		System.out.println(num1);
		
		for(int i=1; i<serie; i++) {
			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
		System.out.println("\nGracias por su participación");
	}

}
