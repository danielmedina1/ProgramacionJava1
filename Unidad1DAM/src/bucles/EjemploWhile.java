package bucles;

public class EjemploWhile {

	public static void main(String[] args) {

		System.out.println("0-10");
		int i=0;
		while(i<=10) {
			System.out.println(i+" ");
			i++;
		}
		System.out.println("10-0");
		i=10;
		while(i>=0) {
			System.out.println(i+" ");
			i--;
		}
		while (i>=50) {
			System.out.println(i+" ");
			i=i+2;
		}
	}

}
