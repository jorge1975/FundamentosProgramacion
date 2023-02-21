package com.senati.semana02;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nro,centenas,decenas,unidades;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número de 3 cifras : ");
		nro = sc.nextInt();
		
		while (nro >=100 && nro <=999) {
			centenas = nro / 100;
			decenas = (nro - (centenas * 100))/10;
			unidades = nro - ((centenas * 100) + (decenas * 10));
			System.out.println("Centenas : " + centenas);
			System.out.println("Decenas : " + decenas);
			System.out.println("Unidades : " + unidades);
			
			System.out.print("Ingrese un número de 3 cifras : ");
			nro = sc.nextInt();
		}
		
		System.out.print("Gracias");
		
	}

}
