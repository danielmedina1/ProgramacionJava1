package ejercicio_algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Productos {
	public static void main(String[] args) throws SQLException{
		Scanner tc = new Scanner(System.in);
		int opcion=0;
		
		do {
			menu();
			System.out.print("Seleccione una opcion:");
			opcion=tc.nextInt();
			System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/|");
			switch (opcion) {
			case 1: {
				crearPedidos();
				System.out.println("Documento Creado con Exito");
			} break;
			case 2: {
				crearDetalles();
				System.out.println("Documento Creado con Exito");
			} break;
			case 3: {
				cargarProductos();
				System.out.println("Productos Cargados con Exito");
				
			} break;
			case 4: {
				consultarPedidos();
				
			} break;
			case 5: {
				System.out.println("Saliendo del sistema");
			} break;
				
			}
		}while(opcion!=5);
		
		
		
		
		
		
		
		
	}

	private static void consultarPedidos() throws SQLException{
		
		
		
	}

	private static void cargarProductos() throws SQLException{
			ArrayList<CargaProductos> cp=new ArrayList<>();
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","jardineria","jardineria");
			Statement stmt=conn.createStatement();
			ResultSet rset=stmt.executeQuery("select * from productos");
			while(rset.next()) {
				cp.add(new CargaProductos(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6), rset.getString(7), rset.getString(8), rset.getString(9)));
			}
		
		
		
		
	}

	private static void crearDetalles() throws SQLException{
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","jardineria","jardineria");
			Statement stmt=conn.createStatement();
			ResultSet rset=stmt.executeQuery("select codigopedido, codigoproducto, cantidad, preciounidad, numerolinea from detallepedidos");
			PrintWriter pw=new PrintWriter(new File("detalle.csv"));
			pw.println("Codigo del pedido;"+"Codigo del producto;"+"Cantidad;"+"Precio Unidad;"+"Numero Linea;");
			while(rset.next()) {
				pw.println(rset.getString(1)+";"+rset.getString(2)+";"+rset.getString(3)+";"+rset.getString(4)+";"+rset.getString(5)+";");
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void crearPedidos() throws SQLException{
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","jardineria","jardineria");
			Statement stmt=conn.createStatement();
			ResultSet rset=stmt.executeQuery("select codigopedido, estado, codigocliente from pedidos");
			PrintWriter pw=new PrintWriter(new File("pedidos.csv"));
			pw.println("Codigo del pedido;"+"Estado del pedido;"+"Codigo del cliente;");
			while(rset.next()) {
				pw.println(rset.getString(1)+";"+rset.getString(2)+";"+rset.getString(3)+";");
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static void menu() {
		System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/|");
		System.out.println("Seleccione una opcion:");
		System.out.println("\t1.Crear -pedidos.csv-");
		System.out.println("\t2.Crear -detalles.csv-");
		System.out.println("\t3.Cargar productos");
		System.out.println("\t4.Consultar pedidos");
		System.out.println("\t5.Salir");
		System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/|");

		
	}

}
