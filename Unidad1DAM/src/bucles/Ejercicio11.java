package bucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		int producto=1, i=1, contador=0;
		while(contador<10) {
			producto=producto*i;
			i=i+2;
			contador++;
	
		}
		System.out.println("El producto es: "+producto);
	}


}
