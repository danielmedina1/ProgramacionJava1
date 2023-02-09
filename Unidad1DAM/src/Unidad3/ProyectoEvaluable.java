package Unidad3;

import java.util.Scanner;

public class ProyectoEvaluable {

	private static boolean comprobar(int a, int b) {
		if(a!=b) {
			if(a>=0 && b>=0) {return false;}
			else {return true;}
		}
		else {return true;}
		}
	
	
	private static void menu() {
		System.out.println();
		System.out.println("Elige una opcion: ");
		System.out.println("a.Imprimir numeros perfectos entre a y b");
		System.out.println("b.Imprimir números primos entre a y b");
		System.out.println("c.Imprimir los palindromos pares entre a y b");
		System.out.println("d.Sumar las cifras de a y las de b");
		System.out.println("e.Salir");
		}
	
	
	private static void sumar(int a, int b) {
		int cociente1=0,  resto1=0, suma1=0;
		int cociente2=0, resto2=0, suma2=0;
		cociente1=a;
		do {
			resto1=cociente1%10;
			cociente1=cociente1/10;
			suma1+=resto1;
		}while(cociente1>1);

		cociente2=b;
		do {
			resto2=cociente2%10;
			cociente2=cociente2/10;
			suma2+=resto2;
		}while(cociente2>1);
		System.out.println("La suma de "+a+" es: "+suma1+", la suma de "+b+" es: "+suma2+" y la suma total es: "+(suma1+suma2));
	}


	
	private static void palindromos(int a, int b) {
		int resto=0, cociente=0, c=0, palindromo=0;
		if(a>b) {c=a; a=b; b=c;}
		System.out.println("Los numeros palindromos pares entre "+a+" y "+b+" son: ");
		if(a>b) {c=a; a=b; b=c;}
		
		do {
			cociente=a;
			do {
				resto=cociente%10;
				cociente=cociente/10;
				palindromo=(palindromo*10)+resto;
				
			}while(cociente>=1);
			
			if(a==palindromo && palindromo>10 && palindromo%2==0) {System.out.println(palindromo);}
			a++;
			palindromo=0;
		}while(a<=b);
		
		
		
	}

	
	private static void primos(int a, int b) {
		int i=1, primo=0, cont=0, c=0, d=0;
		if(a>b) {c=a; a=b; b=c;}
		d=a;
		while(a<=b) {
			while(i<=a) {
					if(a%i==0) {cont++;}
					i++;}
			if(cont==2) {primo++;}
			cont=0;
			a++;
			i=1;
		}
		System.out.println("Los numeros primos que hay entre "+d+" y "+b+" es: "+primo);
	}

	
	private static void perfectos(int a, int b) {
		int c=0, i=1, suma=0, d=0;
		if(a>b) {c=a; a=b; b=c;}
		System.out.println("Los números perfectos entre "+a+" y "+b+" son: ");
		do {
			do {
				d=a/i;
				if(a%i==0 && d!=a) {suma=suma+d;}
				i++;	
			}while(i<=a);
			if(a==suma){System.out.println(suma);}		
			i=1;
			a++;
			suma=0;
		}while(a<=b);
	}

	
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);	
	int a=0, b=0;
	String opcion="f";
	do {
		do {
			System.out.println();
			System.out.println("Recuerda que los números deben ser positivos y diferentes");
			System.out.println("Introduce el valor de a: ");
			a=teclado.nextInt();
			System.out.println("Introduce el valor de b: ");
			b=teclado.nextInt();
		}while(comprobar(a,b) && !opcion.equalsIgnoreCase("e"));
		
		menu();
		opcion=teclado.next();
		
		switch (opcion) {
		case "a": 
			perfectos(a,b);break;
		case "b": primos(a,b); break;
		
		case "c": palindromos(a,b); break; 
		
		case "d":  sumar(a,b); break;
		
		case "e": System.out.println("Adios"); break;
		
		default: System.out.println("Opcion invalida, pruebe otra vez"); break;
		}
	}while(!opcion.equalsIgnoreCase("e"));
}
}
