package bucles;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n, i=10, contador=0;
		boolean encontrado=false;
		while(i>0 ) {System.out.println("Dame un numero");
		n=teclado.nextInt();
		if(n<0) { encontrado=true;}
		contador++;
		i--;
			}
		if(encontrado) {
		System.out.println("Se ha introducido un número negativo");}
		else {
			System.out.println("No se ha introducido un número negativo");}


	}

}
