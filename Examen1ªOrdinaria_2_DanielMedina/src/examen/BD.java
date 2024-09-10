package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

	public void cargarParametrosConexion() {
		try {
			String conexion = "";
			String driver = "";
			String servidor = "";
			String puerto = "";
			String sid = "";
			String usuario = "";
			String contraseña = "";
			Scanner sc = new Scanner(new File("configGim.xml"));
			String linea[];
			String cadena;
			cadena = sc.nextLine();
			cadena = sc.nextLine();
			cadena = sc.nextLine();
			cadena = sc.nextLine();
			cadena = sc.nextLine();
			while (sc.hasNext()) {
				linea = cadena.split("=")[1].split(">");
				if (linea[0].substring(1, linea[0].length()-1).equals("DRIVER")) {
					driver = linea[1].split("<")[0];
				}
				if (linea[0].substring(1, linea[0].length()-1).equals("SERVIDOR")) {
					servidor = linea[1].split("<")[0];
				}
				if (linea[0].substring(1, linea[0].length()-1).equals("PUERTO")) {
					puerto = linea[1].split("<")[0];
				}
				if (linea[0].substring(1, linea[0].length()-1).equals("SID")) {
					sid = linea[1].split("<")[0];
				}
				if (linea[0].substring(1, linea[0].length()-1).equals("USUARIO")) {
					usuario = linea[1].split("<")[0];
				}
				if (linea[0].substring(1, linea[0].length()-1).equals("CLAVE")) {
					contraseña = linea[1].split("<")[0];
				}
				cadena = sc.nextLine();
			}
			conexion = driver + servidor + ":" + puerto + "/" + sid;
			BD.getInstance().setCadenaConexion(conexion);
			BD.getInstance().setUsuario(usuario);
			BD.getInstance().setPassword(contraseña);
			//System.out.println(conexion + " " + usuario + " " + contraseña);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
		
		
	

}

