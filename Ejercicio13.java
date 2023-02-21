package com.senati.semana02;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float INCREMENTO1 = 0.15f;
		final float INCREMENTO2 = 0.10f;
		final int MONTOESPECIAL = 160;
		final short TOPEHIJOS = 2;
		int salarioActual, categoria, nroHijos;
		float montoParcial1, montoParcial2, sueldoNeto;
		Scanner sc = new Scanner(System.in);
		System.out.print("Salario : ");
		salarioActual = sc.nextInt();
		System.out.print("Categoria : ");
		categoria = sc.nextInt();
		System.out.print("Hijos : ");
		nroHijos = sc.nextInt();		
		if (categoria == 1) {
			montoParcial1 = salarioActual * INCREMENTO1;
		}else {
			montoParcial1 = salarioActual * INCREMENTO2;
		}		
		if (nroHijos > TOPEHIJOS) {
			montoParcial2 = MONTOESPECIAL;
		}else {
			montoParcial2 = 0;	
		}
		sueldoNeto = salarioActual + montoParcial1 + montoParcial2;
		System.out.printf("Sueldo total : %.3f",sueldoNeto);
	}

}
