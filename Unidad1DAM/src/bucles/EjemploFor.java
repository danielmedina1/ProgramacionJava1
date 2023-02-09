package bucles;

public class EjemploFor {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}

	for(int i=10; i<=20; i=i+2) {
		System.out.println(i);
	}
	for (int i=0; i<=10; i++) {
		System.out.println("Tabla del "+i);
		for(int j=1; j<=10; j++) {
			System.out.println(i+"x"+j+"="+(i*j));
		}
		
	}
	
	
	
	
	
	
	
	}

}
