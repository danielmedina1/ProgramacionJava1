package ejercicio_clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		String matricula = teclado.next();
		insertarMultasMatricula(matricula);
	}

	private static void insertarMultasMatricula(String matricula) throws SQLException {
		BD.getInstance().setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
		BD.getInstance().setUsuario("PreExamen");
		BD.getInstance().setPassword("preexamen");
		
		try {
			int total = 0;
			Scanner sc = new Scanner(new File("Multas.csv"));
			String cadena = sc.nextLine();
			String linea[];
			while (sc.hasNext()) {
				cadena = sc.nextLine();
				linea = cadena.split(";");
				if(linea[0].equals(matricula)) {
					total = total + Integer.parseInt(linea[6]);
				}
			}
			BD.getInstance().consultaBD("INSERT INTO multas VALUES ('"+matricula+"',"+total+" )");

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
