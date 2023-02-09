package actividades;

import java.util.Scanner;

public class EjercicioEvaluable {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Ejercicio A
		//int numero=0, mayor=0, suma=0;
		
		//for(int i=0; i<10; i++) {
		//	System.out.println("DAME UN NÚMERO: ");
		//	numero=teclado.nextInt();
		//	if(numero%3==0) {suma+=numero;
		//		if(numero>mayor) {mayor=numero;}
			
		//	}
			
			
			
		//}
		//System.out.println("El número mayor es: "+mayor);
		//System.out.println("La suma de los multiplos de 3 mayores a 6 es: "+suma);
	
	//Ejercicio B
		int numero=0, mayor=0, cont=0;
	for(int i=0; i<8; i++) {
		System.out.print("Dame un numero: ");
		numero=teclado.nextInt();
		if(numero%5==0 && numero>10) {cont++;
			if(numero>mayor) {mayor=numero;}
			}
		
	}
	
	System.out.println("Numeros mayores a 10 y multiplos de 5: "+cont);
	System.out.println("El numero mayor es: "+mayor);
	
	
	
	
	}

}
