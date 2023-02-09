package Unidad5;

import java.util.Scanner;

public class CalculadoraRacional {

	public static void main(String[] args) {
		int a1=0, a2=0, b1=0, b2=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Primera fraccion:");
		System.out.print("Numerador: ");
		a1=teclado.nextInt();
		System.out.print("Denominador: ");
		b1=teclado.nextInt();
		System.out.println("Segunda fraccion:");
		System.out.print("Numerador: ");
		a2=teclado.nextInt();
		System.out.print("Denominador: ");
		b2=teclado.nextInt();
		racional r=new racional(a1, b1);
		racional q=new racional(a2, b2);
		System.out.println("---Calculadora---");
		System.out.println("Suma: "+r.suma(q));
		System.out.println("Resta: "+r.resta(q));
		System.out.println("Producto: "+r.producto(q));
		System.out.println("Division: "+r.division(q));
		System.out.println();
	
		

	}

}
