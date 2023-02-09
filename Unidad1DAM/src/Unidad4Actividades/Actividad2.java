package Unidad4Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero, contador=0;
		int numeros[]=new int [20];
		
		System.out.println("Dame el número que deseas buscar: ");
		numero=teclado.nextInt();

		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(1+Math.random()*25);
			
			if(numero==numeros[i]) {
				contador++;
				System.out.println("El número ha aparecido en la posición: "+(i+1));
			}
		}
		System.out.println("El valor ha aparecido "+contador+" veces");
		System.out.print(""+Arrays.toString(numeros));
		
		

	}

}
