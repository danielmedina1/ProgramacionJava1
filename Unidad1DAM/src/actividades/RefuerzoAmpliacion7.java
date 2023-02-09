package actividades;

import java.util.Scanner;

public class RefuerzoAmpliacion7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0, suma=0, sum=0, sumadig=0;
		System.out.print("Dame un número: ");
		numero=teclado.nextInt();
		if (numero>9 && numero<=99) {
			sum=numero/10;
			suma=numero%10;
			if(sum%2==0) {System.out.println("La decena es par");}
			if(suma%2==0) {System.out.println("La unidad es par");}
			
			System.out.println("La suma de sus digitos es: "+(suma+sum));
			//System.out.println("Sum: "+sum);
			//System.out.println("Suma: "+suma);
			}
		else {System.out.println("El número no tiene 2 cifras");}
		
	
	
	
	
	
	
	
	
	
	}

}
