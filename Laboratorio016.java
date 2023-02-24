package com.senati.torrec502.clase07;

public class LaboratorioC001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String utiles[] = {"pelota","medias","mochila","polo"};
		double precios[] = {35.5,89.60,45.99,25.70};
		String marca[] = {"Umbro","Adidas","Tottus","Topytop"};
		
		System.out.println("Lista de Productos y sus precios");
		
		for (int u = 0; u<utiles.length;u++) {
			System.out.println(utiles[u] + "\t" + precios[u] + "\t" + marca[u]);
		}
	}

}
