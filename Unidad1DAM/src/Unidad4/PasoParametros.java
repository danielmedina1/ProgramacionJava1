package Unidad4;

public class PasoParametros {

	public static void main(String[] args) {
		int a=3, b=6;
		
		System.out.println("a="+a+" y b="+b);
		
		intercambia(a, b);

			int n[]= {1,4,3,6,7};
			//System.out.println(Arrays.toString(n));
			//Ultimo valor --- primero
			intercambia(n);
	}

	private static void intercambia(int[] n) {
		int aux=n[0];
		n[0]=n[n.length-1];
		n[n.length-1]=aux;
		
	}

	private static void intercambia(int a, int b) {
		int aux=a;
		a=b; 
		b=aux;
		System.out.println("a="+a+" y b="+b);
	}

}
