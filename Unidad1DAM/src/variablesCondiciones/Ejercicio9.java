package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int x=0, y=0;
		
		System.out.println("Introduzca 2 números");
		x=teclado.nextInt();
		y=teclado.nextInt();
		if (x>y) {System.out.println(y+">"+x);}
		else{ if (y<x) {System.out.println(x+"<"+y);}
		else{if (x==y) {System.out.println(x+"="+y);}

	}}}}
