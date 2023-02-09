package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float a=0.0f, b=0.0f, c=0.0f, sisol=0.0f, sol1=0.0f, sol2=0.0f, sol0=0.0f;
		System.out.println("Este programa resuelve ecuaciones de segundo grado. Introduce los valores de los coeficientes: ");
		System.out.println("a= ");
		a=teclado.nextFloat();
		System.out.println("b= ");
		b=teclado.nextFloat();
		System.out.println("c= ");
		c=teclado.nextFloat();
		sisol=(float) (Math.pow(b, 2)-4*a*c);
		if (sisol>0) {System.out.println("La ecuación tiene dos soluciones que son: ");
		sol1=(float) (((-b)+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a));
		sol2=(float) (((-b)-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a));
		System.out.println(sol1);
		System.out.println(sol2);}
		if (sisol==0) {
			sol0=(float) (-b/2*a);
			System.out.println("La ecuación tiene una solución que es: "+sol0);}
		if (sisol<0) {System.out.println("La ecuación no tiene solución");
		}}}
