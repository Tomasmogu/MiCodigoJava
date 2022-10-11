package com.arrays;
import java.util.Random;



public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][] = new int [5][5];
		Random random = new Random();
		
		for (int i=0; i<matriz.length; i++) {
			for (int e=0; e< matriz.length; e++) {
				matriz [i][e]= random.nextInt(9);
			}
		}
		
		String respuesta= "";
		for (int i=0; i<matriz.length; i++) {
			for (int e=0; e< matriz.length; e++) {
				respuesta= respuesta  + matriz[i][e];
				}
			respuesta= respuesta + "\n";
	}
		System.out.println(respuesta);
	}
	
}
