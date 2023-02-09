package Unidad5;

import java.util.Scanner;

public class AppPassw {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame una cadena");
		String palabra=teclado.next();
		Password p=new Password();
		p.generarPassword(palabra);
		System.out.println(p);
		System.out.println("Otra contraseña");
		palabra=teclado.next();
		Password q=new Password();
		q.generarPassword(palabra);
		System.out.println(q);
		
		if(p.getContraseña().equals(q.getContraseña())) {
			System.out.println("Tienen la misma longitud");
		}
		else {System.out.println("No tienen la misma longitud");}
	}

}
