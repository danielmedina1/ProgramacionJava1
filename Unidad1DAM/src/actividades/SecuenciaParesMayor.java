package actividades;

import java.util.Scanner;

public class SecuenciaParesMayor {

		public static void main(String[] args) {
	
			Scanner teclado=new Scanner(System.in);
			int numero=0, cons=0, cons2=0;

			do {
				System.out.println("Introduzca un número: ");
				numero = teclado.nextInt();
				if (numero % 2 == 0) {cons++; if (cons > cons2) {cons2 = cons;}}
				if (numero%2!=0) {cons=0;}
			}while (numero != -1);
			System.out.print("El mayor número de pares consecutivos es: " + cons2);
		
		
		
		
		
		
		
		
		
		}
}
