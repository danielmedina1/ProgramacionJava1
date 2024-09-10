package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaOracle {
	public static void main(String[] args) throws SQLException {
		
		//1. Crear el driver
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//2.Crear la conexion a la BD Oracle
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","jardineria","jardineria");
		//3. Crear y ejecutar la consulta
		Statement stmt=conn.createStatement();
		ResultSet rset=stmt.executeQuery("select codigoCliente, nombreCliente from clientes");
		
		//4. 
		while(rset.next()) {
			System.out.println("codigo="+rset.getString(1)+" nombre="+rset.getString(2));
			
		}
		
	}

}
