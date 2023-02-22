package com.jluque.semana02;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, exp, digito;
		double binario;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Introduce un numero entero >=0: ");
			numero = sc.nextInt();
		}while(numero<0);
		
		exp = 0;
		binario = 0;
		
		while(numero != 0) {
			digito = numero % 2;
			binario = binario + digito * Math.pow(10, exp);
			exp++;
			numero = numero/2;
		}
		System.out.printf("Binario : %.0f %n", binario);
		System.out.println("\nGracias por su participación");
	}

}
