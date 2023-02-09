package PracticaUT6;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicios implements App {

	@Override
	public int[] sumaColumnasMatriz(int[][] m) {
		int array[]=new int [m[0].length];
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				array[i]=array[i]+m[j][i];
			}
		}
		return array;
	}

	@Override
	public int secuenciaMayor(int[] v) {
		int repetido=0, cont=1;
		for (int i = 0; i < v.length; i++) {
			for (int j = i+1; j < v.length; j++) {
				if(v[i]==v[i+1]) {
					cont++;
					i++;
				}
				else {
					if(cont>repetido) {repetido=cont;}
					cont=1;
				}
			}
		}
		return repetido;
	}

	@Override
	public int mediaImparesDesdePrimerPar(int[] v) {
		int mediaI=0, cont=0, totalI=0;
		for (int i = 0; i < v.length; i++) {
			if(v[i]%2==0) {
				for (int j = i; j < v.length; j++) {
					if(v[j]%2!=0) {
						totalI=totalI+v[j];
						cont++;
					}
					
				}
				i=v.length+10;
			}
		}
		mediaI=totalI/cont;
		return mediaI;
	}
	
	
	public static void main(String[] args) {
		int v[]= {1,3,3,3,3,3,3,7,2,2,2,2,3,5,7,11,4,6,10};
		int[][] m =
			{
			    {1, 2, 3,20, 9},
			    {4, 5, 6,10, 8},
			    {94, 25, 67,101, 83},
			    {7, 8, 9,130, 500}
			};
		Ejercicios e=new Ejercicios();
		Ejercicios s=new Ejercicios();
		System.out.println("Media Impares: "+e.mediaImparesDesdePrimerPar(v));
		System.out.println("Secuencia mayor: "+e.secuenciaMayor(v));
		System.out.println("Suma de columnas: "+Arrays.toString(s.sumaColumnasMatriz(m)));
		
	}

}
