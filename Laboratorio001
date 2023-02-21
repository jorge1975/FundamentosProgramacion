/*
 * PROGRAMA PRESTAMO
*/

// paquete
package com.senati.torrec502.clase02;

// librerias
import java.util.Scanner;

// clase
public class Prestamo {
	
	// funcion principal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// VARIABLES Y CONSTANTES
		final float TASA = 0.35f; 
		float prestamoBanco; 
		float montoInteres = 0;	
		float pagoTotal = 0;
		Scanner valorIngresado = new Scanner(System.in);
		
		// LECTURA O ENTRADA
		System.out.print("Ingrese prestamo: ");
		prestamoBanco = valorIngresado.nextFloat();
		
		// CALCULOS O PROCESOS
		montoInteres = prestamoBanco * TASA;
		pagoTotal = prestamoBanco + montoInteres;
		// SALIDAS O ESCRITURAS
		System.out.printf("El prestamo es: %.2f %n", prestamoBanco);
		System.out.printf("El interes por 1 mes es: %.2f %n", montoInteres);
		System.out.printf("El pago total es : %.2f %n",pagoTotal);		
	}
}
