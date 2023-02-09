package bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		
		while(numero>=0) {
		System.out.println("Introduce un número");
			numero=teclado.nextInt();
		if (numero>=0) {System.out.println("El cuadrado de "+numero+" es: "+(Math.pow(numero, 2)));}
		else {System.out.println("Fin");}

	}
}
}
