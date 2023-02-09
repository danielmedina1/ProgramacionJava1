package variablesCondiciones;

import java.util.Scanner;

public class Extra2 {

	public static void main(String[] args) {
		// Area del cuadrado(lado por lado), del circulo(pi radio cuadrado), triangulo(base por altura entre 2), salir
		Scanner teclado=new Scanner(System.in);
		float lado=0.0f, radio=0.0f, base=0.0f, altura=0.0f, acuadrado=0.0f, acirculo=0.0f, atriangulo=0.0f;
		int opcion=0;
		System.out.println("Programa para el calculo de areas. Seleccione una opción");
		System.out.println("----------------------------------------");
		System.out.println("1-Cuadrdado");
		System.out.println("2-Circulo");
		System.out.println("3-Triangulo");
		System.out.println("4-Salir");
		System.out.println("----------------------------------------");

		opcion=teclado.nextInt();

		switch(opcion) {
		 case 1: System.out.println("Introduzca el lado del cuadrado");
		 lado=teclado.nextFloat(); acuadrado=lado*lado; 
		 System.out.println("El area de ese cuadrdado es "+acuadrado);
		 break;
		 case 2: System.out.println("Introduzca el radio del circulo");
		 radio=teclado.nextFloat(); acirculo=(float) (Math.PI*Math.pow(radio, 2));
		 System.out.println("El area del circulo es "+acirculo);
		 break;
		 case 3:System.out.println("Introduzca la base del triangulo"); base=teclado.nextFloat();
		 System.out.println("Introduzca la altura del triangulo"); altura=teclado.nextFloat();
		 atriangulo=(base*altura)/2; System.out.println("El area del triangulo es "+atriangulo);
		 break;
		 case 4: System.out.println("¡Adios!"); break;
		 default: System.out.println("Selección incorrecta");}}}
