package bucles;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int contador=0, numero=0;
		
		
		while(numero>=0) {
			contador++;
			
			System.out.println("Introduce un número");
			numero=teclado.nextInt();
		}
		System.out.println("Has introducido "+contador+" numero/s");
	}

}
