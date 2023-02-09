package actividades;

import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0, suma=0, i=1, division=0;
		
		System.out.print("Dame un numero: ");
		numero=teclado.nextInt();
		
		do{
			division=numero/i;
			if(numero%i==0 && numero!=division) {suma+=division;}			
			i++;	
		}while(i<=numero);
		
		if(suma==numero) {System.out.println("El número es perfecto");}
		else {System.out.println("El número no es perfecto");}
		
		
		
		
		
		
		
		
		
		

	}

}
