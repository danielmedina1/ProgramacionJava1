package bucles;

import java.util.Scanner;

public class Ejercicio19x2 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		    int numPrimos, contador, divisor, num;
		    boolean esPrimo;
				
		      System.out.print("Introduce un número");
		      numPrimos = scanner.nextInt();
		 
		    System.out.println("2");
		    contador = 1;
		    num = 3;
		    while (contador == numPrimos){
		      esPrimo = true;
		      divisor=3;
		      while ((divisor<=Math.sqrt((num))) && esPrimo) {
		        if (num%divisor==0) {
		          esPrimo = false;
		        }
		        divisor +=2;
		      }
		      if (esPrimo){
		        contador +=1;
		        System.out.println(num+" es primo.");
		      }
		      num +=2;
		    }
		  }
		
	
	}

