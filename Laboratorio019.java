package com.senati.torrec502.clase07;

import java.util.Scanner;

public class LaboratorioCursos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		int id[];
		String curso[];
		int horas[];
		String obligatorio[];
		
		id = new int[100];
		curso = new String[100];
		horas = new int[100];
		obligatorio = new String[100];
		int c = -1;
		
		Scanner sc = new Scanner(System.in);
		while(opcion != 5) {

			// Procedimiento
			menuPrincipal();
			System.out.print("Ingrese su opción [1 al 5]: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 1:
					c++;
					System.out.println("Selecciono Agregar");
					id[c] = c;
					System.out.print("Curso (De Carrera): ");
					curso[c]=sc.next();
					System.out.print("Horas (solo enteros): ");
					horas[c]=sc.nextInt();
					System.out.print("Obligatorio (SI,NO): ");
					obligatorio[c]=sc.next();	
					
				break;
				case 2:
					System.out.println("Selecciono Listar");
					System.out.println("Id \t Nombre \t Horas \t Obligatorio");
					for(int i=0;i<=c;i++) {
						System.out.printf("%d \t %s  \t %d  \t %s %n", id[i],curso[i],horas[i],obligatorio[i]);
					}
				break;
				case 3:
					System.out.println("Selecciono Modificar");
				break;
				case 4:
					System.out.println("Selecciono Eliminar");
				break;			
			}					
		}
		System.out.println("Selecciono salir, hasta pronto");

	}
	
	public static void menuPrincipal() {
		System.out.println("Menu Principal");
		System.out.println("[1]: Agregar");
		System.out.println("[2]: Listar");
		System.out.println("[3]: Modificar");
		System.out.println("[4]: Eliminar");
		System.out.println("[5]: Salir");
	}

}
