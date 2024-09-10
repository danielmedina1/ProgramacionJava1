package sungleton;

import java.sql.ResultSet;
import java.sql.SQLException;

import examen_2ordinaria.Cliente;

public class Principal {
	public static void main(String[] args) throws Exception {
		BD miconexion = BD.getInstance();
		
//		miconexion.setUsuario("jardineria");
//		miconexion.setPassword("jardineria");
//		miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521/XE");
		miconexion.setUsuario("tiendaFruta");
		miconexion.setPassword("tiendaFruta");
		miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521/XE");
		
		try {
			ResultSet rset=miconexion.consultaBD("select count(*) from persona");
			while(rset.next()) {
				System.out.println("Son: "+rset.getString(1));
			}
			BD.getInstance().cerrarConsulta();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
