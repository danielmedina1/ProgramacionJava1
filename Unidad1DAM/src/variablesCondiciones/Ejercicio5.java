package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		float n1=0.0f;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un número");
		n1=teclado.nextFloat();
		if(n1==0) {System.out.println("El número es 0");}
		else {if(n1>0) {System.out.println("El número es positivo");}
		else {System.out.println("El número es negativo");}}
	}

}
