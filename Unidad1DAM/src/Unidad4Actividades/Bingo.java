package Unidad4Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre1="";
		String nombre2="";
		int boleto1[]=new int[5];
		int boleto2[]=new int[5];
		int win1=0, win2=0, win=0;
		
		nombre1=teclado.next();
		nombre2=teclado.next();
		
		getBoleto(boleto1);
		getBoleto(boleto2);
		
		String alias1=getAlias(nombre1);
		String alias2=getAlias(nombre2);
		
		imprimeJugador(nombre1, alias1, boleto1);
		imprimeJugador(nombre2, alias2, boleto2);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		do {
			int numero=(int)(1+Math.random()*20);
			System.out.println("Sale el número: "+numero);
			comprobarBoleto(boleto1, numero, alias1);
			comprobarBoleto(boleto2, numero, alias2);
		
		ganadorBoleto(boleto1, win1);
		ganadorBoleto(boleto1, win2);
		
		if(win1==5) {win=5;}
		if(win2==5) {win=5;}
		
		}while(win!=5);
		
		
		
	}

	private static void ganadorBoleto(int[] boleto, int win) {
		int cont=0;
		for (int i = 0; i < boleto.length; i++) {
			if(boleto[i]==0) {cont++;}
		}
		if (cont==5) {win=5;}
	}

	private static void comprobarBoleto(int[] boleto, int numero, String alias) {
		for(int i=0; i<boleto.length; i++) {
			if(numero==boleto[i]) {
				boleto[i]=0;
				System.out.println("Encontrado el "+numero+" en el boleto de "+alias);
			}
		}
		System.out.println(alias+Arrays.toString(boleto));
		
	}

	private static void imprimeJugador(String nombre, String alias, int[] boleto) {
		System.out.println("El jugador "+nombre+" con alias "+alias+" tiene el boleto: "+Arrays.toString(boleto));
		
	}

	private static String getAlias(String nombre) {
		if(nombre.length()>=3) {return "j"+nombre.substring(0, 3)+(int)(1+Math.random()*100);}
		else {return "j"+nombre+(int)(1+Math.random()*100);}
	}

	private static void getBoleto(int[] boleto) {
		for (int i = 0; i < boleto.length; i++) {
			boleto[i]=(int)(1+Math.random()*20);	
		}
		Arrays.sort(boleto);
	}

}
