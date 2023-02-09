package Unidad4;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String cosa="";
		String dominio="";
		System.out.println("Introduce lo que desees comprobar:");
		cosa=teclado.next();
		for (int i = 0; i < cosa.length(); i++) {
			if(cosa.charAt(i)=='@') {dominio=cosa.substring(i+1);}
		}
		System.out.println(dominio);

		if(correo(cosa)) {System.out.println("Es un correo valido");}
		else {System.out.println("No es un correo valido");}
		if(matricula(cosa)) {System.out.println("Es una matricula");}

	}

	private static boolean matricula(String cosa) {
		return cosa.matches("^[A-Z]{4}+[0-9]{3}$");
	}

	private static boolean correo(String cosa) {
		return cosa.matches("^[\\w-]+@riberadeltajo.es$");
	}

}
