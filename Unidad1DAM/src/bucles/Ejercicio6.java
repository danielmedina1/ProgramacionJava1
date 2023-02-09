package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int número=1, suma=0;
		
		while(número !=0) {
		System.out.println("Dame un número");
		número=teclado.nextInt();		
		suma+=número;}
		System.out.println("La suma es "+suma);
		
	}

}
