package Unidad4;

public class Ejercicio4Libro {

	public static void main(String[] args) {
		int numeros[]=new int[20];
		int cuadrado[]=new int[20];
		int cubos[]=new int[20];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*101);
			cuadrado[i]=(int)(Math.pow(numeros[i], 2));
			cubos[i]=(int)(Math.pow(numeros[i], 3));
			
		}
		System.out.println("Numero: ");
		for (int i = 0; i < cubos.length; i++) {
		System.out.print(numeros[i]+" ");

		}
		System.out.println();
		System.out.println("Cuadrado: ");
		for (int i = 0; i < cubos.length; i++) {

			System.out.print(cuadrado[i]+" ");
		}
		System.out.println();
		System.out.println("Cubo: ");
		for (int i = 0; i < cubos.length; i++) {

			System.out.print(cubos[i]+" ");
		}

	}

}
