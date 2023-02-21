package com.senati.semana02;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int HORAS=23;
		final int MINUTOS=59;
		final int SEGUNDOS=59;
		
		int nroHoras, nroMinutos, nroSegundos;
		boolean correcto = false;
		Scanner sc = new Scanner(System.in);
		
		nroHoras = sc.nextInt();
		nroMinutos = sc.nextInt();
		nroSegundos = sc.nextInt();		
		
		if (nroHoras <= HORAS) {
			if (nroMinutos <= MINUTOS) {
				if (nroSegundos <= SEGUNDOS) {
					correcto = true;
				}
			}
		}
		
		if (correcto){
			System.out.printf("%d:%d:%d%n",nroHoras,nroMinutos,nroSegundos);
			System.out.println("Horario correcto");
		}else {
			System.out.println("Horario incorrecto");
		}
		
	}

}
