package Unidad6_Interfaces;

import java.util.Arrays;

public class Matematicas implements MathArray {
	public int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
		return n*factorial(n-1);
		}
	}
	public int random(int n) {
		return (int)(1+Math.random()*n);
	}
	@Override
	public int min(int[] array) {
		Arrays.sort(array);
		return array[0];
	}
	@Override
	public int max(int[] array) {
		int maximo=array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i]>maximo) {
				maximo=array[i];
			}
		}
		return maximo;
	}
	@Override
	public int sum(int[] array) {
		int suma=0;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];
		}
		return suma;
	}
	
	public static void main(String[] args) {
		Matematicas m=new Matematicas();
	
		int array[]= {4,7,2,6,5,3};
		double array2[]= {4.4,7.7,2.2,6.6,5.5,3.3};
		System.out.println("Factorial: "+m.factorial(3));
		System.out.println("Aleatorio: "+m.random(7));
		System.out.println(Arrays.toString(array));
		System.out.println("Minimo: "+m.min(array));
		System.out.println("Maximo: "+m.max(array));
		System.out.println("Suma: "+m.sum(array));
		
	}
	@Override
	public double min(double[] array) {
		Arrays.sort(array);
		return array[0];
	}
	@Override
	public double max(double[] array) {
		double maximo=array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i]>maximo) {
				maximo=array[i];
			}
		}
		return maximo;
	}
	@Override
	public double sum(double[] array) {
		double suma=0;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];
		}
		return suma;
	}
}
