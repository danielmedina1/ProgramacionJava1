package Unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Repaso2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		int n[]=new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i]=(int)(Math.random()*30);
			
		}
		do {
			System.out.println(Arrays.toString(n));
			System.out.println();
			
			do {			
			menu();
			opcion=teclado.nextInt();
			if(opcion<1 || opcion>4) {System.out.println("Opción incorrecta pruebe otra vez");}
			}while(comprobar(opcion));
			
			switch(opcion) {
				case 1: suma(n); break;
				case 2: mayor(n); break;
				case 3: pares(n); break;
				case 4: System.out.println("Chau"); break;
			}
		}while(opcion!=4);

	}

	private static boolean comprobar(int opcion) {
		if(opcion<1 || opcion>4) {return true;}
		return false;
	}

	private static void pares(int[] n) {
		int par=0;
		for (int i = 0; i < n.length; i++) {
			if(n[i]%2==0) {par=n[i]; System.out.println("Hay un número par en la posición: "+(i+1)+" y ese número es: "+par);}
		}
		
	}

	private static void mayor(int[] n) {
		int mayor;
		mayor=n[0];
		for (int i = 0; i < n.length; i++) {
			if(mayor<n[i]) {mayor=n[i];}
		}
		System.out.println("El mayor número del array es: "+mayor);
		
	}

	private static void suma(int[] n) {
		int suma=0;
		for (int i = 0; i < n.length; i++) {
			suma=n[i]+suma;
		}
		System.out.println("La suma del array es: "+suma);
	}

	private static void menu() {
		System.out.println("Seleccione una opción: ");
		System.out.println("1.Sumar los elementos de una array");
		System.out.println("2.El número mayor");
		System.out.println("3.Números pares de un array");
		System.out.println("4.Salir");
		
	}

}
