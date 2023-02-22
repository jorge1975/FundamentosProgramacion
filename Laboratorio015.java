package com.jluque.semana03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int notas[];
		int c;
		int n;
		int s=0;
		float pro;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		notas = new int[n];
		
		for(c=0;c<n;c++) {
			notas[c]=sc.nextInt();
		}
		
		for(c=0;c<n;c++) {
			System.out.println(notas[c]);
			s = s + notas[c];
		}
		
		pro = s / n;
		System.out.println(pro);
	}

}
