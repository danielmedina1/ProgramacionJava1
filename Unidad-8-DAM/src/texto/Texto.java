package texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {
		File f = new File ("numeros.txt");
		Scanner teclado=new Scanner(System.in);
		try {
			PrintWriter salida=new PrintWriter(f);
			int numero;
			do {
				System.out.println("Dame un numero: ");
				numero=teclado.nextInt();
				salida.println(numero);
			}while(numero!=0);
			salida.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Scanner entrada=new Scanner(new File("numeros.txt"));
			int num=0;
			while(entrada.hasNext()) {
				num=entrada.nextInt();
				System.out.println(num);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
