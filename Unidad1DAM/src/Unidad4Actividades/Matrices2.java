package Unidad4Actividades;

import java.util.Scanner;

public class Matrices2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int x=0, y=0, suma=0;
		System.out.println("Introduzca el numero de filas y columnas:");
		System.out.println("Minimo 2 y maximo 10");
		
		do{
			System.out.print("Filas, X=");
			x=teclado.nextInt();
			System.out.print("Columnas, Y=");
			y=teclado.nextInt();
		}while(comprobar(x, y));
		
		int m[][]=new int[x][y];
		
		for (int i = 0; i < m.length; i++) {
			suma=0;
			for (int j = 0; j < m[0].length; j++) {
				m[i][j]=(int)(1+Math.random()*50);
				suma=suma+m[i][j];
				System.out.print(m[i][j]+"\t");
			}
			System.out.println("La suma es: "+suma);
			System.out.println();
		}

	}

	private static boolean comprobar(int x, int y) {
		if(x>=2 && x<=10) {
			if(y>=2 && y<=10){
				return false;
			}
		}
		return true;
	}

}
