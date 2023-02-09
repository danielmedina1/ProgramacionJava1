package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n1=0, n2=0;
			System.out.println("Introduzca 2 números");
			n1=teclado.nextInt();
			n2=teclado.nextInt();
		
		if (n1%n2==0) {System.out.println("Son multiplos");}
			else {
				if(n2%n1==0) {System.out.println("Son multiplos");}
					else {System.out.println("No son multiplos");}}}}
