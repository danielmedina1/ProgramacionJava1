package actividades;

import java.util.Scanner;

public class DAWEjercicios {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0, cont=0;
		float suma=0.0f;
		
		for (int i=0; i<12; i++) {
			System.out.print("Dame un número: ");
			numero=teclado.nextInt();
			if(numero%5==0 && numero>10) {suma+=numero;
			cont++;
			}
		}
			System.out.println("La suma es: "+suma);
			System.out.println("La media es: "+suma/cont);
			
			
		

	}

}
