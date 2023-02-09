package actividades;

import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int mayor=0, menor, numero=0, resto=0, cociente=0;
		float suma=0, media=0, cifra=0;
		System.out.print("Dame un número: ");
		numero=teclado.nextInt();
		menor=numero;
		cociente=numero;
		while(cociente>=1) {
			resto=cociente%10;
			cociente=cociente/10;
		
			if(resto<menor) {menor=resto;}
			if(resto>mayor) {mayor=resto;}
			if(resto<=9 && resto>=0) {suma+=resto;}
			cifra++;
			
		}
		media=suma/cifra;
		System.out.println("El numero de cifras es: "+cifra);
		System.out.println("La media de sus numeros es: "+media);
		System.out.println("El número mayor es: "+mayor);
		System.out.println("El número menor es: "+menor);
		
		
		
		
		
		
		
		

	}

}
