package actividades;

import java.util.Scanner;

public class NumeroAfortunado {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int suerte=0, nosuerte=0, numero=0, resto=0, cociente=0;
		System.out.println("Dame un numero: ");
		numero=teclado.nextInt();
		cociente=numero;
		while(cociente>=1) {
			resto=cociente%10;
			cociente=cociente/10;
			if(resto==3 || resto==7 || resto==8 || resto==9) {suerte++;}
			if(resto==0 || resto==1 || resto==2 || resto==4 || resto==6) {nosuerte++;}
			}
		if(suerte>nosuerte) {System.out.println("El número es afortunado");}
		else {System.out.println("El número no es afortunado");}
		
		
		
		
}
}
