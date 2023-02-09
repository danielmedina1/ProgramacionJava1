package actividades;

import java.util.Scanner;

public class AcrividadUT2 {

	public static void main(String[] args) {
		//Pide nombre edad peso y muestre Hola nombre-string tienes edad-int y pesas peso-float Kg
		String nombre="";
		int edad=0;
		float peso=0.0f;
		System.out.println("Introduce tu nombre");
		Scanner teclado=new Scanner(System.in);
		nombre=teclado.next();
		System.out.println("Introduce tu edad");
		edad=teclado.nextInt();
		System.out.println("Introduce tu peso");
		peso=teclado.nextFloat();
		if(edad>=18) {
			System.out.println("Hola "+nombre+" eres mayor de edad y pesas "+peso+" Kg.");
			}
		else { 
		System.out.println("Hola "+nombre+" tienes "+edad+" años y pesas "+peso+" Kg.");
		      }
	}
}

