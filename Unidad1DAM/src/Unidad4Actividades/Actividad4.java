package Unidad4Actividades;

import java.util.Arrays;

public class Actividad4 {

	public static void main(String[] args) {
		int apuesta[]=new int[5];
		int apuesta2=0, x;

		for (int j = 0; j < apuesta.length; j++) {
			x=(int)(1+Math.random()*54);
			if(comprobar(apuesta, x)) {apuesta[j]=x;}
			else {j--;}		
		}
		apuesta2=(int)(Math.random()*9);
				
		Arrays.sort(apuesta);
		System.out.println("Bloque 1: "+Arrays.toString(apuesta));
		System.out.println("Bloque 2: ["+apuesta2+"]");
		
			}

	private static boolean comprobar(int[] apuesta, int x) {
		
		for (int j = 0; j < apuesta.length; j++) {
			if(apuesta[j]==x) {return false;}
			
		}
		return true;
	}
		
		
	}

		
		


	



	


