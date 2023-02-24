package com.senati.torrec502.clase07;

public class LaboratorioC002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombres[] = {"Huaman","Quincho","Neyra","Quispe","Lopez","Luque"};
		int promedios[] = {14,15,6,19,10,12};
		int i=0,tap=0,tde=0;
		String observacion;		
		System.out.println("Lista de Alumnos");		
		System.out.println("NOMBRES\tPROMEDIOS\tOBSERVACION");
		for (i = 0; i<nombres.length;i++) {
			if (promedios[i]>=10.5) {
				observacion = "Aprobado";
			}else {
				observacion = "Desaprobado";
			}
			System.out.println(nombres[i] + "\t" + promedios[i] + "\t\t" + observacion);
		}
		System.out.printf("Total de alumnos : %d %n",i);		
		System.out.println("\n");
		for(i = 0; i<nombres.length;i++) { 		// Lista de aprobados
			if (promedios[i]>=10.5) {
				System.out.println(nombres[i] + "\t" + promedios[i] + "\t\t" + "Aprobado");
				// Contabilizar
				tap++;
			}
		}
		System.out.printf("Total de alumnos aprobados : %d %n",tap);
		System.out.println("\n");
		for(i = 0; i<nombres.length;i++) { 		// Lista de desaprobados
			if (promedios[i]<10.5) {
				System.out.println(nombres[i] + "\t" + promedios[i] + "\t\t" + "Desaprobado");
				tde++;
			}
		}
		System.out.printf("Total de alumnos desaprobados : %d %n",tde);
		System.out.println("\n");
	}

}
