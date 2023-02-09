package Unidad3;

import java.util.Scanner;

public class PPT {

	public static void juegaPC(int n) {
		switch(n) {
		case 1: System.out.println("\t Piedra");
				break;
		case 2: 
				System.out.println("\t Papel");
				break;
		case 3: 
				System.out.println("\t Tijera");
				break;}
					
		
		
		
	}
	public static void comprobacion(int x) {
		int n=0;
			
			if(x==2) {
				
				if(n==1)
					System.out.println("Has ganado!:(");
				if(n==3) 
					System.out.println("He ganado! :)");
			}
			
			if(x==3) {
				
				if(n==1)
					System.out.println("He ganado!:(");
				if(n==2) 
					System.out.println("Has ganado! :)");
			}
		
		}
	
	
	public static void ganador(int x) {
		int n=0;
		if(x==n)
			System.out.println("Empate!!!");
		
		else {
		
			if(x==1) {
			
				if(n==2)
					System.out.println("He ganado!");
				if(n==3) 
					System.out.println("Has ganado! :(");
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
			Scanner teclado=new Scanner(System.in);
			int opcion=0;
			int secreto=0;
			do {
				System.out.println("1. Piedra");
				System.out.println("2. Papel");
				System.out.println("3. Tijera");
				System.out.println("4. Salir");
				System.out.println("Elige una opción: ");
				opcion=teclado.nextInt();
				
				secreto=(int)(1+Math.random()*3);
				juegaPC(secreto);
				
				comprobacion(opcion);
				
				ganador(opcion);
				
				
	}while(opcion!=4);	

		}
	
}

	
		
		
		
		
		
		
		
		
		
		
		
		

	