package Unidad4;

import java.util.Scanner;

public class ComprobarContraseña {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String cadena="";

		do {
			System.out.println("Introduzca una contraseña: ");
			cadena=teclado.next();			
		}while(!esCorrecta(cadena));
		
		System.out.println("Contraseña adecuada");
	}

	private static boolean esCorrecta(String cadena) {
		boolean hayMayuscula=false, hayNumero=false, hayGuion=false;
		if(cadena.length()>=8) {
			for(int i=0; i<cadena.length(); i++) {
				if(Character.isDigit(cadena.charAt(i))) {
					hayNumero=true;
				}
				if(Character.isUpperCase(cadena.charAt(i))) {
					hayMayuscula=true;
				}
				if(cadena.charAt(i)=='_') {
					hayGuion=true;
				}
				}
		if(hayNumero && hayMayuscula && hayGuion) {return true;}
		else {return false;}
		}
		else {
			return false;
		}
	
	}

}
