package Unidad3;

import java.util.Scanner;

public class Ejemplo {

		public static void main(String[] args) {
			float radio=0;
			Scanner teclado=new Scanner(System.in);
			
			System.out.println("Radio: ");
			radio=teclado.nextFloat();
			float a=area(radio);
			System.out.println("El área del círculo es: "+a);
			
			
			
			
			
		}

		private static float area(float r) {
			
			return (float)(Math.PI*Math.pow(r, 2));
		}
}
