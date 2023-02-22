package com.jluque.semana03;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombres[] = {"Carlos","Alicia","Micaela","Patricio"};
		int edad[] = {35,45,25,30};
		boolean sexo[] = {true,false,false,true};
		String msj;
		
		System.out.println("Lista de Personas");
		
		for (int u = 0; u<nombres.length;u++) {
			msj = sexo[u] ? "Masculino" : "Femenino";
			System.out.println(nombres[u] + " " + edad[u]+ " " + msj);
		}
	}

}
