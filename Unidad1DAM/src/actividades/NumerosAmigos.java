package actividades;

import java.util.Scanner;

public class NumerosAmigos {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero1=0, suma1=0, cociente1=0, cont1=2, g1=0, comp1=0, numero2=0;
		
		System.out.println("Dame un numero: ");
		numero1=teclado.nextInt();
		cociente1=numero1;
		System.out.println("Dame otro numero: ");
		numero2=teclado.nextInt();
		
		do {
			g1=cociente1/cont1;
			if(cociente1%cont1==0) {suma1=suma1+g1;}
			cont1++;
		}while(cont1!=cociente1);
		
		suma1=suma1+1;
		
		if(suma1==numero2) {System.out.println("Los numeros son amigos");}
		else {System.out.println("Los numeros no son amigos");}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
