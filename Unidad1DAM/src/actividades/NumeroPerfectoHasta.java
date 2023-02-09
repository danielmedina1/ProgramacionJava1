package actividades;

import java.util.Scanner;

public class NumeroPerfectoHasta {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0, suma=0, i=1, division=0, cant=0, i2=1;
		
		System.out.print("Dame un numero: ");
		numero=teclado.nextInt();
		
		do{
			division=i2/i;
			if(numero%i==0 && numero!=division) 
			{suma+=division; if(suma==i2) {cant++;}
			}			
			
			
			if(i2==i) {i2++;}
			
		}while(i2<=numero);
		
		System.out.println("Entre 0 y "+numero+" hay "+cant+" numero/s perfecto/s");


		
		
		
		

	}

}
