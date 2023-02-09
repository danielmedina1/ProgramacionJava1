package Unidad4Actividades;

public class Matrices3 {

	public static void main(String[] args) {
		int m[][]=new int[3][4];
		int m1[][]=new int[3][4];
		int r[][]=new int[3][4];
		
		
		for (int  i= 0;  i< m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j]=(int)(1+Math.random()*30);
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("+");
		for (int  i= 0;  i< m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {;
				m1[i][j]=(int)(1+Math.random()*30);
				System.out.print(m1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				r[i][j]=m[i][j]+m1[i][j];
				System.out.print(r[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
