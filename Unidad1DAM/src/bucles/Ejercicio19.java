package bucles;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		int numero=0, i=1, contador=0, n=0, j=2, contadorPrimos=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número");
		n = teclado.nextInt();
		while(j<=n) {i=1;
			while (i <= j) {
				if (j % i == 0) {contador++;}
				i++;} 
			if (contador == 2) {contadorPrimos++;} 
			contador=0;
			j++;}
		System.out.println("Existen "+contadorPrimos+" números primos entre 1 y "+n);}}