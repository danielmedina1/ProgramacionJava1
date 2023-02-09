package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio13 {
		
		public static void main(String[] args) {
			//declaración de variables/objetos
			int n=0;
			Scanner teclado=new Scanner(System.in);
			System.out.println("Dame un dia de la semana en número");
			n=teclado.nextInt();
			
			switch(n) {
			case 1: System.out.println("Lunes"); break;
			case 2: System.out.println("Martes"); break;
			case 3: System.out.println("Miercoles"); break;
			case 4: System.out.println("Jueves"); break;
			case 5: System.out.println("Viernes"); break;
			case 6: System.out.println("Sabado"); break;
			case 7: System.out.println("Domingo"); break;
			default: System.out.println("Debe ser un número del 1 al 7");
			}
			
			
}
}
