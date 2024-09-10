package sungleton;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BD {

	private static BD miInstancia=null;
	private static boolean permitirInstancianueva;
	private String cadenaConexion;
	private String usuario;
	private String password;
	private Connection conn;
	private Statement stmt;


	BD() throws Exception{
		if(!permitirInstancianueva) {
			throw new Exception("No se puede crear otro objeto de la clase. Usa getI...");
		}
	}

	public static BD getInstance() {
		if(miInstancia==null) {
			permitirInstancianueva=true;
			try {
				miInstancia=new BD();
			} catch (Exception e) {
				e.printStackTrace();
			}
			permitirInstancianueva=false;
		}
		return miInstancia;
	
		
		
	}



	 public  ResultSet consultaBD(String consulta) throws SQLException {
		 DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		 conn = DriverManager.getConnection(cadenaConexion, usuario, password);
		  stmt = conn.createStatement();
		  ResultSet rset =stmt.executeQuery(consulta);
			return rset;

	 }



	 public void cerrarConsulta() throws SQLException {
		stmt.close();
	 }

	

	public String getCadenaConexion() {
		return cadenaConexion;
	}

	public void setCadenaConexion(String cadenaConexion) {
		this.cadenaConexion = cadenaConexion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}



}
