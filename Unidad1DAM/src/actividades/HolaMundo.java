package actividades;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre=teclado.next();
		System.out.println("Hola "+nombre);
				
	}
	
}
