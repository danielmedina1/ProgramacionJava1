package bucles;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float suma=0.0f, sueldo=0.0f, mayoresmil=0.0f;
		
		do {
			System.out.println("Dame un numero");
			sueldo=teclado.nextFloat();
		}while(suma==0);
	}

}
