package WorldeClases;

import java.util.Scanner;

public class WorldeC {
	public static void main(String[] args) {
		String []palabras= {"PLATO","PISAR","PLANO","MAREO","LISTA","LISTO",
				"SUCIO","PERRO","MIXTO","BULTO","CASTO","PRADO","MOSCA","PISTO",
				"TURCO","BRAVO","VISTO","QUESO","GUISO","USADO"};
		
		Scanner teclado=new Scanner(System.in);
		
		int posicion=(int)(Math.random()*20);
		int intentos=6;
		
		Palabra secreta=new Palabra(palabras[posicion]);
		String p="";
		Palabra usuario=new Palabra(p);
		System.out.println(secreta);
		String adivina="";
		
		do {
			do {
				System.out.println("Dame una palabra de 5 letras");
				p=teclado.next();
				usuario.setCadena(p);
			}while(!usuario.correcta());
			secreta.comparar(usuario);
			intentos--;
		}while(intentos>0 && !secreta.equals(secreta));
		
	}

}
