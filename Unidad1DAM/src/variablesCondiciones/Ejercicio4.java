package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int n1=0, n2=0;
		System.out.println("Introduzca 2 numeros");
		Scanner teclado=new Scanner(System.in);
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		
		if(n1==n2) {
			System.out.println(n1+" y "+n2+" son iguales");
			}
		else {System.out.println(n1+" y "+n2+" no son iguales");}
	}

}
