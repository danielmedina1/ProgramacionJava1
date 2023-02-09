package Unidad4;

import java.util.Arrays;

public class MO_Seleccion {

	public static void main(String[] args) {
		int menor, z=0, x=0;
		int array[]=new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(1+Math.random()*100);
		}
		System.out.println("Normal: "+Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			menor=100;
			for (int j = i; j < array.length; j++) {
				if(menor>array[j]) {menor=array[j]; z=j;}
			}
				x=array[i];
				array[i]=menor;
				array[z]=x;
		}
		
		System.out.println("Ordenado: "+Arrays.toString(array));

	}

}
