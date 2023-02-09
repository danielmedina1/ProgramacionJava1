package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int nota;
		System.out.println("Introduce tu nota (entre 0 y 10)");
		nota=teclado.nextInt();
		switch(nota) {
		case 0: System.out.println("Has suspendido"); break;
		case 1: System.out.println("Has suspendido"); break;
		case 2: System.out.println("Has suspendido"); break;
		case 3: System.out.println("Has suspendido"); break;
		case 4: System.out.println("Has suspendido"); break;
		case 5: System.out.println("Suficiente"); break;
		case 6: System.out.println("Bien"); break;
		case 7: System.out.println("Notable"); break;
		case 8: System.out.println("Notable"); break;
		case 9: System.out.println("Sobresaliente"); break;
		case 10: System.out.println("Sobresaliente"); break;
		default: System.out.println("Número invalido, pruebe otra vez");
		}

	}

}
