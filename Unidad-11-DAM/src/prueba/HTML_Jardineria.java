package prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HTML_Jardineria {

	public static void main(String[] args) throws SQLException {
		try {
			//1. Crear el driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//2.Crear la conexion a la BD Oracle
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","jardineria","jardineria");
			//3. Crear y ejecutar la consulta
			Statement stmt=conn.createStatement();
			ResultSet rset=stmt.executeQuery("select codigoCliente, nombreCliente from clientes");
			PrintWriter pw= new PrintWriter(new File("Index.html"));
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head>\r\n"
					+ "    <title>Titulo</title>\r\n"
					+ "</head>");
			pw.println("<body>");
			pw.println("<table border=1>");
			pw.println("<tr>"+"<th>"+"Codigo"+"</th>"+"\n"+"<th>"+"Nombre Cliente"+"</th>"+"</tr>");

			while(rset.next()) {
				pw.println("<tr>"+"<td>"+rset.getString(1)+"</td>"+"\n"+"<td>"+rset.getString(2)+"</td>"+"</tr>");
			}
			pw.println("</table>");
			pw.println("</body>");
			pw.println("</html>");
			
			pw.flush();
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



}
