package Unidad3;

import java.util.Scanner;

public class Actividad3 {

	public static void menu() {
		System.out.println("Elige una opción: ");
		System.out.println("A.Suma");
		System.out.println("B.Resta");
		System.out.println("C.Multiplicacion");
		System.out.println("D.Division");
		System.out.println("E.Salir");
	}
	private static float suma(float x, float y) {
		return x+y;
	}
	private static float resta(float x, float y) {
		return x-y;
	}
	private static float mul(float x, float y) {
		return x*y;
	}
	private static float div(float x, float y) {
		return x/y;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n1=0, n2=0;
		String opcion;
		System.out.println("Dame el primer número: ");
		n1=teclado.nextInt();
		System.out.println("Dame el segundo número número: ");
		n2=teclado.nextInt();
		
		menu();
		opcion=teclado.next();
		
		switch(opcion){
		case "A": System.out.println(suma(n1,n2)); 
			break;
		case "B": System.out.println(resta(n1,n2)); 
			break;
		case "C": System.out.println(mul(n1,n2)); 
			break;
		case "D": System.out.println(div(n1,n2)); 
			break;
		case "E":
			System.out.println("Chau");
			break;
		default: System.out.println("Opcion Incorrecta");
		
		
		}
	
	
	
	
	
	}

}
