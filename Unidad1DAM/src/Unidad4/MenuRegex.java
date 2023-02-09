package Unidad4;

import java.util.Scanner;

public class MenuRegex {

	private static void menu() {
		System.out.println("Elige una opción: ");
		System.out.println("1.Validar un número entero");
		System.out.println("2.Validar un número entero positivo");
		System.out.println("3.Validad DNI");
		System.out.println("4.Validar un número binario");
		System.out.println("5.Validar un número octal");
		System.out.println("6.Validar un email");
		System.out.println("7.Validar ISBN");
		System.out.println("8.Validar usuario de twitter");
		System.out.println("9.Salir");
		}
	private static boolean entero(String numero) {
		return numero.matches("^-?[0-9]+$");
	}
	private static boolean enteroP(String numero) {
		return numero.matches("^?[0-9]+$");
	}
	private static boolean DNI(String numero) {
		return numero.matches("^");
	}
	private static boolean binario(String numero) {
		return numero.matches("^[0-11]+$");
	}
	private static boolean octal(String numero) {
		return numero.matches("^[0-7]+$");
	}
	private static boolean email(String numero) {
		return numero.matches("^[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$");
	}
	private static boolean ISBN(String numero) {
		return numero.matches("^(978|979)[0-9]{10}$");
	}
	private static boolean usuario(String numero) {
		return numero.matches("^@[\\w-.]{14}$");
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String opcion, numero;
		do {
			menu();
			opcion=teclado.next();
			System.out.println("Introduzca lo que desee validar: ");
			numero=teclado.next();
			switch (opcion) {
			case "1":
				if(entero(numero)) {System.out.println("Es entero");}
				else {System.out.println("No es entero");}break;
			case "2":	
				if(enteroP(numero)) {System.out.println("Es entero positivo");}
				else {System.out.println("No es entero positivo");}break;
			case "3":
				if(DNI(numero)) {System.out.println("Es un DNI");}
				else {System.out.println("No es un DNI");}break;
			case "4":
				if(binario(numero)) {System.out.println("Es binario");}
				else {System.out.println("No es binario");}break;
			case "5":
				if(octal(numero)) {System.out.println("Es octal");}
				else {System.out.println("No es octal");}break;
			case "6":
				if(email(numero)) {System.out.println("Es un email");}
				else {System.out.println("No es un email");}break;
			case "7":
				if(ISBN(numero)) {System.out.println("Es un ISBN");}
				else {System.out.println("No es un ISBN");}break;
			case "8":
				if(usuario(numero)) {System.out.println("Es un email");}
				else {System.out.println("No es un email");} break;
			default: System.out.println("Ponga una opción valida");	
			}
		
		
		
		
		}while(!opcion.equalsIgnoreCase("9"));

		
		
		
		
		
		
		
		

	}

}
