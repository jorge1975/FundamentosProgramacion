package com.senati.torrec502.clase07;

import java.util.Scanner;

public class LaboratorioC003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notas[]; // arreglo sin elementos o arreglo vacio
		int c=0, n=0, s=0, notaAlta=0, notaBaja=20;
		float pro;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Ingrese nro de notas: ");
		n = sc.nextInt();
		notas = new int[n]; // redimensionando el arreglo		
		for(c=0;c<n;c++) {
			System.out.printf("Ingrese nota %d: ",c+1);
			notas[c]=sc.nextInt();
			if (notaAlta < notas[c]) {
				notaAlta = notas[c];
			}
			if (notaBaja > notas[c]) {
				notaBaja = notas[c];
			}
			s = s + notas[c];
		}			
		pro = (float)s / n;
		System.out.printf("La nota alta es : %d %n",notaAlta);
		System.out.printf("La nota baja es : %d %n",notaBaja);
		System.out.printf("El promedio es: %.3f",pro);
	}

}
