package Unidad4Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices5 {


	private static void sumaColumnasMatriz(int[][] m) {
		int z=m[0].length;
		int suma[]=new int[z];
		int s=0;
		for (int a = 0; a < suma.length; a++) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
				if(s==j) {suma[s]=suma[s]+m[i][j];}
				}
			}
			System.out.print(suma[s]+"\t");
			s++;
		}
		//return suma;
	}
	
	private static void sumaFilasMatriz(int[][] m) {
		int z=m[0].length;
		int suma[]=new int[z];
		int s=0;
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < m.length; j++) {
				for (int j2 = 0; j2 < m[0].length; j2++) {
					
					if(s==j) {suma[s]=suma[s]+m[j][j2];}
				}
			}
			System.out.print("|"+suma[s]);
			s++;
		}
		
		//return suma;
	}
	
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int x, y, suma=0;
		
		System.out.println("Numero de filas: ");
		x=teclado.nextInt();
		System.out.println("Numero de columnas: ");
		y=teclado.nextInt();
		System.out.println();
		int m[][]=new int[x][y];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j]=(int)(1+Math.random()*25);
				System.out.print(m[i][j]+"\t");
				suma=suma+m[i][j];
			}
			System.out.println();
		}
		
//		System.out.println();
//		System.out.println("=");
//		
//			System.out.println("Suma de las columnas: "+Arrays.toString(sumaColumnasMatriz(m)));
//			System.out.println("Suma de las filas: "+Arrays.toString(sumaFilasMatriz(m)));
//			System.out.println("Suma total: "+suma);
	}

}
