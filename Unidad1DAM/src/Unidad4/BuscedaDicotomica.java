package Unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class BuscedaDicotomica {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int s[]= {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int elemento=23;
//		for (int i = 0; i < s.length; i++) {
//			s[i]=(int)(1+Math.random()*100);
//		}
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		int posicion=busquedaBinaria(s, elemento);
		System.out.println(posicion);
		
		

	}

	private static int busquedaBinaria(int[] s, int elemento) {
		int l=0, h=s.length-1, m=((h+l)/2);
		while(l<h) {
			m=((h+l)/2);
			if(s[m]==elemento) {return m;}
			else {
				if(s[m]<elemento){
					l=m+1;
				}
				else {l=m-1;}
			}
		}
		
		return 0;
	}

	


}
