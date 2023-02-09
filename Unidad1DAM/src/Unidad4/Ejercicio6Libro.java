package Unidad4;

import java.util.*;
import java.util.Arrays;

public class Ejercicio6Libro {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numeros[]=new int[15];
		int ultimo=0, j=0, s=1;
		
		System.out.println("Introduzca 15 números: ");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=teclado.nextInt();
			
		}
		
		System.out.println(Arrays.toString(numeros));
		ultimo=numeros[14];
		
		for (int i = 0; i < 14; i++) {
			numeros[s]=numeros[j];
			j++;
			s++;
		}
		numeros[0]=ultimo;
		System.out.println(Arrays.toString(numeros));

	}

}
