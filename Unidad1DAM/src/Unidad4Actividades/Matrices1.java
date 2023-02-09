package Unidad4Actividades;

public class Matrices1 {

	public static void main(String[] args) {
		
		int m[][]=new int[3][4];
		int a=0;
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[0].length; j++) {
				a++;
				m[i][j]=a;
				System.out.print(m[i][j]+"\t");
				
			}
			System.out.println();
		}

	}

}
