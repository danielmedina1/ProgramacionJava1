package Unidad4;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String j1="";
		String j2="";
		int resultado1[]=new int[5];
		int resultado2[]=new int[5];
		
		System.out.println("El nick debe estar contruido de la siguiente manera:");
		System.out.println("J+Tres letras mayusculas+Un número");
		System.out.println();
		do {
			System.out.println("Jugador 1 - Introduce el nick:");
			j1=teclado.next();
		}while(comprobar(j1));
		
		do {
			System.out.println("Jugador 2 - Introduce el nick:");
			j2=teclado.next();
		}while(comprobar(j2));
		
		
		

	}

	private static boolean comprobar(String j) {
		if(j.matches("^[J]+[A-Z]{3}+[1-9]$")) {return false;}
		return true;
	}

}
