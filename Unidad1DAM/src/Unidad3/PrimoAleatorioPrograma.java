package Unidad3;

import java.util.Scanner;

public class PrimoAleatorioPrograma {

	private static boolean esPrimo(int numero) {
		for(int i=2; i<=numero/2; i++) {
			if(numero%i==0) {return false;}
			
		}

		return true;
	}
	
	
	private static int aleatorio (int numero) {
		
		return (int)(1+Math.random()*numero);
	}
	
	
	public static void main(String[] args) {
		int numero=0, i=1, contador=0, ale=0, primo=0;
		Scanner teclado=new Scanner(System.in);
				
		System.out.println("Dame un número: ");
		numero=teclado.nextInt();
		for(int e=0; e<10; e++) {
		System.out.println("Número aleatorio entre 1 y "+numero);
		ale=aleatorio(numero);
		if(esPrimo(numero)) {System.out.println("El número: "+ale+" es primo");}
		else {System.out.println("El número: "+ale+" es compuesto");}
		
		while(i<=numero) {
			if(numero%i==0) {contador++;}
					i++;
		}
		}

	
	
	
	}

}
