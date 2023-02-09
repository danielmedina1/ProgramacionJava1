package Unidad4Actividades;

import java.util.Arrays;

public class Actividad1 {
	
	public static void main(String[] args) {
		int numeros[]=new int [20];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(1+Math.random()*50);
			System.out.print(numeros[i]+" ");
		}
		System.out.print("\nArray al revés: ");
		
		for(int i=numeros.length-1; i>=0; i--) {
			System.out.print(numeros[i]+" ");
			
		}
		
		System.out.println("\n"+Arrays.toString(numeros));
		
		//Ordenar Arrays
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		//Ejercicio 2
		
		
		
		
	}
}
