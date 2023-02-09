package actividades;

import java.util.Scanner;

public class DesplazarNumero {
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int numero=0, resto=0, cociente=0, cifra=0, resto2=0, cociente2=0, fin=0;
		System.out.print("Dame un número: ");
		numero=teclado.nextInt();
		cociente=numero;
		cociente2=numero;
		while(cociente2>=1) {
			resto2=cociente2%10;
			cociente2=cociente2/10;
			cifra++;
			}
		resto=cociente%10;
		cociente=cociente/10;
		cifra=cifra-1;
		fin=(int) ((resto*Math.pow(10, cifra))+cociente);
		
		
		System.out.println(fin);
		
		
	}
}
