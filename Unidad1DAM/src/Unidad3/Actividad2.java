package Unidad3;

import java.util.Scanner;

public class Actividad2 {

	public static void menu() {
		System.out.println("Elige una opción: ");
		System.out.println("1.Area del cuadrado");
		System.out.println("2.Area del circulo");
		System.out.println("3.Area del rectangulo");
		System.out.println("4.Salir");
	}

	
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0, opcion=0;
		float acirculo=0, radio=0, lado=0, acuadrado=0, base=0, altura=0, arectangulo=0;
		menu();
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
		 case 3:System.out.println("Introduzca la base: ");
		 base=teclado.nextFloat();
		 System.out.println("Introduzca la altura: ");
		 altura=teclado.nextFloat();
		 arectangulo=base*altura;
		 System.out.println("El area del rectangulo es: "+arectangulo); break;
		 case 4: System.out.println("¡Adios!"); break;
		 default: System.out.println("Selección incorrecta");}
		
	
	
	
	
	}


	}


