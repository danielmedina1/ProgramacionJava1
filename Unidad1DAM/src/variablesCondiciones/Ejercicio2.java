package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("Indique el radio del círculo");
		float radio=0.0f, area=0.0f;
		Scanner teclado=new Scanner(System.in);
		radio=teclado.nextFloat();
		area=(float) (Math.PI*Math.pow(radio, 2));
		System.out.println("El area es "+area);

	}

}
