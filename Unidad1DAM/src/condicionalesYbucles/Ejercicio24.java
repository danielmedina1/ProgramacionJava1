package condicionalesYbucles;

import java.util.Scanner;

public class Ejercicio24 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dame un número: ");
		int x=0;
		x=teclado.nextInt();
		teclado.close();
		
		for (int f= 1; f<=x; f++) {
			for (int c=1; c<= x; c++)
				System.out.print("* ");
				System.out.println();
		}

		
		
		
	
}
}
