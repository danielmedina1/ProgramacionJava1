package condicionalesYbucles;

import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n=0, x=0, contpar=0, sumimpar=0, z=0;
		
		do {
			System.out.println("Dame un número");
			n=teclado.nextInt();
			x=n;
			do {
			sumimpar=0+n;
			if (n%2==0) {contpar++;}
			System.out.println("Dame un número");
			n=teclado.nextInt();
			}while (n!=2);
		}while(n!=2);

		if(x%2==0) {System.out.println(x);}
		if(x%2!=0) {System.out.println(sumimpar);}
	
	
	
	
	
	}

}
