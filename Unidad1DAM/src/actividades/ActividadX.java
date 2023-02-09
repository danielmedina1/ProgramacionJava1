package actividades;

import java.util.Scanner;

public class ActividadX {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int x, mayor, menor;
		System.out.print("Introduzca un número: ");
		x=teclado.nextInt();
		mayor=x;
		menor=x;
		
		do {
			if(mayor<x && x!=0) {mayor=x;}
			if(menor>x && x!=0) {menor=x;}
			System.out.print("Introduzca un número: ");
			x=teclado.nextInt();
		}while(x!=0);
		
		System.out.println("El número mayor es: "+mayor);
		System.out.println("El número menor es: "+menor);

	
	
	
	
	
	
	}

}
