package Unidad4;

import java.util.Arrays;

public class MO_Baraja {

	public static void main(String[] args) {
		int a[]= {6, 5, 3, 1, 8, 7, 2, 4};
		for (int i = 0; i < a.length; i++) {
			int x=0;
			for (int j = a.length-1; 0<j; j--) {
				if(a[j]<a[j-1]){
					x=a[j-1];
					a[j-1]=a[j];
					a[j]=x;
				}
			}
		}
			
		System.out.println(Arrays.toString(a));
	}

}
