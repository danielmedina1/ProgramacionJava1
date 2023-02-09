package Unidad4Actividades;

import java.util.Iterator;
import java.util.Scanner;

public class JuegoBarcis {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String boleto="";
		int p=0, win=0;
		
		boleto=imprimirBoleto(boleto);
			System.out.println(boleto);	
			
			System.out.println("Introduce una posición: ");
			
			for (int i = 0; i < 6; i++) {
				do {
					System.out.println("(Recuerda que debe estar entre el 1 y el 10)");
					p=teclado.nextInt();
				}while(comprobar(p));
				p=p-1;
				if(boleto.substring(p, p+1).equals("B")) {win++; System.out.println("Barco hundido");
				boleto=boleto.substring(0, p)+"A"+boleto.substring(p+1);}
					else {System.out.println("Agua");}
				if(win==4) {i=6; System.out.println("Ganaste");}
				System.out.println(boleto);
			}
			if(win!=4) {System.out.println("Perdiste");}
	}

	private static boolean comprobar(int p) {
		if(p<1 || p>10) {return true;}
		else {return false;}
		
	}

	private static String imprimirBoleto(String boleto) {
		int x=0, ac=0, bc=0;
		String a="A";
		String b="B";
		
		for (int i = 0; i < 10; i++) {
			x=(int)(1+Math.random()*2);
			if(x==1) {boleto=boleto+a.substring(0); ac++;}
			if(x==2) {boleto=boleto+b.substring(0); bc++;}
			if(ac>5) {a="B";}
			if(bc>3) {b="A";}
		}
		return boleto;
	}
}
