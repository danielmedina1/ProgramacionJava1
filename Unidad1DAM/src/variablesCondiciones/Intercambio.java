package variablesCondiciones;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int x=0, y=0, aux=0;
	
		System.out.println("Valor de x");
		x=teclado.nextInt();
		System.out.println("Valor de y");
		y=teclado.nextInt();

		aux=x; x=y; y=aux;
		
		System.out.println("Valor de x:"+x);
		System.out.println("Valor de y:"+y);


	}

}
