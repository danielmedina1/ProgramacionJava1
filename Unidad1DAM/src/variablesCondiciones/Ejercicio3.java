package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float radio=0.0f, longitud=0.0f;
		
		System.out.println("Introduzca el radio de la circunferencia");
		radio=teclado.nextFloat();
		longitud=(float) (2*Math.PI*radio);
		
		System.out.println("La longitud de la circunferencia es "+longitud);
	}

}
