package actividades;
import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int cont=1, numero, mayor=0, suma=0;
		System.out.println("Introduce 10 numeros: ");
		numero=teclado.nextInt();
		
		do {
			if(numero>mayor && numero>6 && numero%3==0) {mayor=numero;}
			if(numero%3==0 && numero>6) {suma+=numero;}
			cont++;
			numero=teclado.nextInt();
		}while(cont!=10);
	
		System.out.println("El número mayor es: "+mayor);
		System.out.println("La suma de los multiplos de 3 mayores a 6 es: "+suma);
	
	
	
	
	}

}
