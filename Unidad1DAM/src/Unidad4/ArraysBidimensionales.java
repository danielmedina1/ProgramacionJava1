package Unidad4;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		//Matrices, en el int final primero van las filas y despues las columnas
		int m[][]=new int[3][4];
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[0].length; j++) {
				m[i][j]=(int)(Math.random()*10);
				System.out.print(m[i][j]+"\t");
				
			}
			System.out.println();
		}

	}

}
