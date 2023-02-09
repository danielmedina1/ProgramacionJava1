package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Worlde {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String pal[]=new String[20];
		String p="";
		String palabra="";
		int i=0, n=0, z=0, p1=0, p2=0;
		completar(pal);
		//System.out.println(Arrays.toString(pal));
		n=(int)(Math.random()*20);
		//System.out.println(n);
		palabra=pal[n];
		//System.out.println(palabra);
		
		String pal2[]=new String[palabra.length()];
		for (int j = 0; j < pal2.length; j++) {
			z=(int)(Math.random()*2);
			if(p1==3) {z=1;}
			if(p2==2) {z=0;}
			if(z==0) {
				pal2[j]=palabra.substring(j, j+1);
				p1++;
				}
			if(z==1) {
				pal2[j]=" _ ";
				p2++;
				}
			System.out.print(pal2[j]);
		}
		
		System.out.println();
		
		for (int j = 0; j < 6; j++) {
			do {
				System.out.println("Intente adivinar la palabra (letras en mayuscula)");
				p=teclado.next();
			}while(comprobar(p));
			
			for (int j3 = 0; j3 < palabra.length(); j3++) {
				if(palabra.substring(j3, j3+1).equals(p.substring(j3, j3+1))) {pal2[j3]=p.substring(j3, j3+1);}
			}
			for (int j2 = 0; j2 < pal2.length; j2++) {
				System.out.print(pal2[j2]);
			}
			System.out.println();
			if(p.equals(palabra)) {j=10; System.out.println("Felicidades, has ganado");}
			i++;
		}
		if(i==6) {System.out.println("Intentos agotados, has perdido");}
	
			
		}

	private static boolean comprobar(String p) {
		
		return p.matches("^[a-z]{5}$");
	}

	private static void completar(String[] pal) {
		int i=0;
		pal[i]="PLATO";
		i++;
		pal[i]="PISAR";
		i++;
		pal[i]="PLANO";
		i++;
		pal[i]="MAREO";
		i++;
		pal[i]="LISTA";
		i++;
		pal[i]="LISTO";
		i++;
		pal[i]="SUCIO";
		i++;
		pal[i]="PERRO";
		i++;
		pal[i]="MIXTO";
		i++;
		pal[i]="BULTO";
		i++;
		pal[i]="CASTO";
		i++;
		pal[i]="PRADO";
		i++;
		pal[i]="MOSCA";
		i++;
		pal[i]="PISTO";
		i++;
		pal[i]="TURCO";
		i++;
		pal[i]="BRAVO";
		i++;
		pal[i]="VISTO";
		i++;
		pal[i]="QUESO";
		i++;
		pal[i]="GUISO";
		i++;
		pal[i]="USADO";
		i++;
	}

}
