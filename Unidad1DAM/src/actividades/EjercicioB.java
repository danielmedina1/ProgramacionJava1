package actividades;

import java.util.Scanner;

public class EjercicioB {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero, n=0, imp1=0, par1=0;
		
		System.out.print("Introduzca un número: ");
		numero=teclado.nextInt();
		n=numero;
		do {
			if(numero%2!=0) {imp1++;}
			if(numero%2==0 && numero>5) {par1+=numero;}
			System.out.print("Introduzca un número: ");
			numero=teclado.nextInt();
		}while(numero!=0);
	if(n>=2) {System.out.println(imp1);}
	if(n<2) {System.out.println(par1);}
	
	
	
	
	
	
	
	
	}

}
