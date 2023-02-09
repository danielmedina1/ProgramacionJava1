package Unidad4;

import java.util.Scanner;

public class ActividadString {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String cadena=teclado.next();
		System.out.println(cadena);
		System.out.println("Cadena al revés: "+alReves(cadena));

		if(esPalindromo(cadena)) {System.out.println("Es palindromo");}
		else {System.out.println("No es palindromo");}
		
		if(esDNI(cadena)) {System.out.println("Es un DNI");}
		else {System.out.println("No es un DNI");}
	}

	private static String alReves(String cadena) {
		String nuevo="";
		for(int i=cadena.length()-1; i>=0; i--) {	
		nuevo=nuevo+cadena.charAt(i);

		
		}
		
		return nuevo;
	}
	
	private static boolean esPalindromo(String cadena) {
		return cadena.equalsIgnoreCase(alReves(cadena));
	}
	private static boolean esDNI (String cadena) {
		String numero="";
		if(cadena.length()==9) {
			numero=cadena.substring(0, 8);
			for(int i=0; i<numero.length(); i++) {
				if(Character.isDigit(numero.charAt(i))) {
					return false;
				}
				return true;
			}
		}
		else {return false;}
		return false;
	}





}
