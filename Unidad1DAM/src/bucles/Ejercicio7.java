package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float n=0, media=0, contador=-1, z=0;
		
		while (n>=0) {
			System.out.println("Dame un número");
			n=teclado.nextInt();
			contador++;
			z+=n;
			if (n<0) {z=z-n;}
		}
		
		media=(z/contador);
		System.out.println(z);
		System.out.println(contador);
		if (n<0) {System.out.println("La media es: "+media);}
	}

}
