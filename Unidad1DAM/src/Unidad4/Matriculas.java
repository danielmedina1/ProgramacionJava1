package Unidad4;

import java.util.Scanner;

public class Matriculas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String matricula="";
		
		
		System.out.println("Introduce la matricula que deseas comprobar: ");
		matricula=teclado.next();
		
		if(comprobar(matricula)){System.out.println("Es una matricula");}
		else {System.out.println("No es una matricula");}
	
	}

	private static boolean comprobar(String matricula) {
//		String numero="";
//		if(matricula.length()==7) {
//			numero=matricula.substring(0, 4);
//			for(int i=0; i<numero.length(); i++) {
//				if(!Character.isDigit(numero.charAt(i))) {
//					return false;
//				}
//			}
//		return true;
//		}else
//		return false;
	return matricula.matches("^[0-9]{4}[A-Z]{3}$");
	}

}
