package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int x=0, y=0, z=0, aux=0;
		
		System.out.println("Introduzca 3 números");
		x=teclado.nextInt();
		y=teclado.nextInt();
		z=teclado.nextInt();
		
		if (x<y) {
			aux=x;
			x=y;
			y=aux;
			System.out.println(x+">"+y+">"+z);} 
		if (y<z) {
			aux=y;
			y=z;
			z=aux;
			System.out.println(x+">"+y+">"+z);}
		if (x<y) {
			aux=x;
			x=y;
			y=aux;
			System.out.println(x+">"+y+">"+z);} 
		
		
	}}


