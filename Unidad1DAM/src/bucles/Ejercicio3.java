package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		
		do {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if(numero!=0) {
				if(numero%2==0) {System.out.println("El numero es par");}
				else {System.out.println("El numero es impar");}
			}
		}while(numero!=0);

	}

}
