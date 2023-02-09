package bucles;

import java.util.Scanner;

public class Ejercicio6x2 {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int numero=1, suma=0;
	
		do{
			System.out.println("Dame un número");
			numero=teclado.nextInt();		
			suma+=numero;
		}
	while(numero !=0);
	
	System.out.println("La suma es "+suma);
}
}

