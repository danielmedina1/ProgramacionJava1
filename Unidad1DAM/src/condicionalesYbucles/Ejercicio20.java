package condicionalesYbucles;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int edad=0, edadm=0, mas175=0;
		float altura=0.0f, sumedad=0.0f, sumaltura=0.0f;
		
		for(float i=0; i<5; i++) {
		System.out.print("Dame la altura: ");
		altura=teclado.nextFloat();
		System.out.print("Dame la edad: ");
		edad=teclado.nextInt();
		if(edad>=18) {
			edadm++;}
			sumedad+=edad;
			sumaltura+=altura;
			
			if (altura>=1.75) {
				mas175++;
			}
		
		}

	
	
	
	
	
	}

}
