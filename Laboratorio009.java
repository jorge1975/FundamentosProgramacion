package com.jluque.semana02;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, aux, inverso=0,cifra;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Ingresa un número >= 10: ");
			N = sc.nextInt();
		}while(N<10);
		
		aux = N;
		while(aux!=0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux / 10;
		}
		
		if (N == inverso) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}

		System.out.println("\nGracias por su participación");
	}

}
