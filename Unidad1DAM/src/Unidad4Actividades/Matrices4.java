package Unidad4Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices4 {

	
	
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int x, y;
	
	System.out.println("Numero de filas: ");
	x=teclado.nextInt();
	System.out.println("Numero de columnas: ");
	y=teclado.nextInt();
		
	int m[][]=new int[x][y];
	
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[0].length; j++) {
			m[i][j]=(int)(1+Math.random()*25);
			System.out.print(m[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println();
	System.out.println("=");
	
		System.out.println(Arrays.toString(sumaColumnasMatriz(m)));
	
	
	
	

	}

	private static int[] sumaColumnasMatriz(int[][] m) {
		int z=m[0].length;
		int suma[]=new int[z];
		int s=0;
		for (int a = 0; a < suma.length; a++) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
				if(s==j) {suma[s]=suma[s]+m[i][j];}
				}
			
			}
			s++;
		}
		
		
		
		return suma;
	}


}
