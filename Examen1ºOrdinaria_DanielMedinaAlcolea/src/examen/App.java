package examen;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) throws SQLException {
		String mes = "";
		String codMonitor = "";
		String contraseña = "";
		if (args.length == 3) {
			for (int i = 0; i < args.length; i++) {
				if (args[0].split("=").equals("--codigo")) {
					codMonitor = args[0].split("=")[1];
				}
				if (args[0].split("=").equals("--mes")) {
					mes = args[0].split("=")[1];
				}
				if (args[0].split("=").equals("--pass")) {
					contraseña = args[0].split("=")[1];
				}
			}
			BD miconexion = BD.getInstance();
			miconexion.cargarParametrosConexion();
			ResultSet rset = miconexion.consultaBD("SELECT codigomonitor, clave FROM monitor");
			while (rset.next()) {
				if (rset.getString(1).equals(codMonitor) && rset.getString(2).equals(contraseña)) {
					System.out.println("a");
				} else {
					System.out.println("b");
				}
			}
		} 
		if (args.length == 1){
			if (args[0].split("=").equals("--mes")) {
				mes = args[0].split("=")[1];
			}
		}
	}

}
