package Unidad4;

import java.util.Arrays;

public class MO_Burbuja {

	public static void main(String[] args) {
		int array[]=new int[10];
		int x=0, y=0;		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(1+Math.random()*100);
		}
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j]>array[j+1]) {
					x=array[j];
					y=array[j+1];
					array[j]=y;
					array[j+1]=x;}
			}
			
		}
		System.out.println(Arrays.toString(array));

	}

}
