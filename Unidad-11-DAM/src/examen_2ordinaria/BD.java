package examen_2ordinaria;


import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



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

	public ArrayList<Cliente>cargaClientes() throws SQLException {
		BD miconexion = BD.getInstance();
		try {
			Scanner entrada = new Scanner(new File("configTienda.txt"));
			String linea[];
			String cadena;
			cadena=entrada.nextLine();
			linea = cadena.split(":=");
			this.setCadenaConexion(linea[1]);
			cadena=entrada.nextLine();
			linea = cadena.split(":=");
			this.setUsuario(linea[1]);
			cadena=entrada.nextLine();
			linea = cadena.split(":=");
			this.setPassword(linea[1]);
			ResultSet rset=miconexion.consultaBD("select * from persona");
			while (rset.next()) {
				cargaClientes().add(new Cliente(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5)));
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		BD.getInstance().cerrarConsulta();
		return cargaClientes();
		
	}

}
