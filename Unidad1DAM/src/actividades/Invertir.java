package actividades;

import java.util.Scanner;

public class Invertir {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0, cociente=0, resto=0, nuevo=0;
		
		System.out.print("Dame un numero: ");
		numero=teclado.nextInt();
		cociente=numero;
		while(cociente>=1) {
			resto=cociente%10;
			cociente=cociente/10;
				if(resto<=9 && resto>=0) {nuevo=nuevo*10+resto;}
				
						}
		System.out.println(nuevo);
		if(nuevo==numero) {System.out.println("El numero es capicua");}
		else {System.out.println("El numero no es capicua");}
	
	
	
	
	
	}

}
