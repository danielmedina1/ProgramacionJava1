package Unidad4;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		String nombre="Juan";
		
		float notas[]=new float [7];
		float media=0;
		Scanner teclado=new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			notas[i]=(int)(1+Math.random()*10);
		}

		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota "+i+": "+notas[i]);
			
		}
		
		for (int i = 0; i < notas.length; i++) {
			media=media+notas[i];
		}
		System.out.println("La nota media es: "+media/notas.length);
		System.out.println("Dame un número: ");
		int numero=teclado.nextInt();
		//Buscar
		for (int i = 0; i < notas.length; i++) {
			if(numero==notas[i]) {
				System.out.println("Encontrado en: "+i);
			}
			
		}
		//Borrar un elemento e insertar
		//nada
		
		
		
		
		
		

	}

}
