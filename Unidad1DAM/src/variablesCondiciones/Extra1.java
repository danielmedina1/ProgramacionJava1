package variablesCondiciones;

import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		
		//Pedir numero, comprobar si esta entre el 1 y 10 (si no esta pedir otro), 
		//comprobar si es el numero secreto.
		
		Scanner teclado=new Scanner(System.in);
		int n1=0;
		int Secreto=(int)(1+Math.random()*10);
		
		System.out.println("Introduzca 1 número que esté entre el 1 y el 10, pruebe otra vez");
		n1=teclado.nextInt();
		if (n1<1 || n1>10) {System.out.println("El número debe estar entre el 1 y el 10");}
		else {
		if (n1==Secreto) {System.out.println("¡Has ganado, felicidades!");}
		else {System.out.println("¡Has perdido, [:(] !");}
		
		
	}
	}

}
