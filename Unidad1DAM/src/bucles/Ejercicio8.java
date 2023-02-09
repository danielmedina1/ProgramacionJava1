package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		int i=1;
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		while(i<=numero) {
			System.out.println(i+" ");
			i++;
		}

	}

}
