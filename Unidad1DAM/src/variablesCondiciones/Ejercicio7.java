package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		float n1=0.0f, n2=0.0f;
		System.out.println("Introduce dos números");
		Scanner teclado=new Scanner(System.in);
		n1=teclado.nextFloat();
		n2=teclado.nextFloat();
		if (n1>n2) {System.out.println(n1+" es mayor que "+n2);}
		if (n2>n1) {System.out.println(n2+" es mayor que "+n1);}
		

}}
