package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n1=0, i=0;
		int Secreto=(int)(1+Math.random()*20);
			System.out.println("Introduzca un número del 1 al 20");
			
			System.out.println(Secreto);
		while(n1<Secreto || n1>Secreto || i>7) {
			n1=teclado.nextInt();
			i++;
			if (Secreto>n1) {System.out.println("El numero es mayor");}
			if (Secreto<n1) {System.out.println("El numero es menor");}
			System.out.println(i);
			if (i==0) {System.out.println("Te has quedado sin intentos");}
		}
		if (i>7) {System.out.println("Te has quedado sin intentos");}
		if (Secreto==n1) {System.out.println("Has acertado");}
		
	}}