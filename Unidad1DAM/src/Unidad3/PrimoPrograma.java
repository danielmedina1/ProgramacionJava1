package Unidad3;

import java.util.Scanner;

public class PrimoPrograma {

	private static boolean esPrimo(int numero) {
		for(int i=2; i<=numero/2; i++) {
			if(numero%i==0) {return false;}
			
		}

		return true;
	}
	
	public static void main(String[] args) {
		int numero=0, i=1, contador=0;
		Scanner teclado=new Scanner(System.in);
				
		System.out.println("Dame un número: ");
		numero=teclado.nextInt();

		if(esPrimo(numero)) {System.out.println("El número: "+numero+" es primo");}
		else {System.out.println("El número: "+numero+" es compuesto");}
		while(i<=numero) {
			if(numero%i==0) {contador++;}
					i++;
		}


	}

}
