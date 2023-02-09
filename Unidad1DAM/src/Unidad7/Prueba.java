package Unidad7;

import java.util.ArrayList;
import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int a[]= {1,4,6,7,9};
//		System.out.println(Arrays.toString(a));
		//Borrar un elemento del array
//		a[1]=0;
//		System.out.println(Arrays.toString(a));
//		int b[]= {1,6,7,9};
//		System.out.println(Arrays.toString(b));
//		
		//Añadir un elemento a un array
		
		//Recorrer el array
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
		ArrayList <Integer> numeros=new ArrayList<>();
		numeros.add(1);
		numeros.add(4);
		numeros.add(6);
		numeros.add(9);
		System.out.println(numeros);
		numeros.add(3,7);
		System.out.println(numeros);
		numeros.add(0,-3);
		System.out.println(numeros);
		numeros.remove(2);
		System.out.println(numeros);
		for(int i=0; i<numeros.size(); i++) {
			System.out.print(numeros.get(i)+" ");
		}
		System.out.println();
		for (Integer i : numeros) {
			System.out.print(i+" ");
		}
		
		
	}

}
