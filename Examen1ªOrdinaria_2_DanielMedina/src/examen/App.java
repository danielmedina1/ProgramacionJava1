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
			BD.getInstance().cargarParametrosConexion();
			ResultSet rset = BD.getInstance().consultaBD("SELECT codigomonitor, clave, nombre, apellidos FROM monitor");
			while (rset.next()) {
				if (rset.getString(1).equals(codMonitor) && rset.getString(2).equals(contraseña)) {
					Monitor m = new Monitor(null, rset.getString(3), rset.getString(4), null, null);
					m.setCodigoMonitor(codMonitor);
					m.clasesMonitor(mes, 2023);
					m.calculaComplementoClases(mes);
					System.out.println("*************************************************************");
					System.out.println("MES: "+mes);
					System.out.println("MONITOR: "+rset.getString(3)+" "+rset.getString(4));
					System.out.println("Complemento por clases: "+m.getExtraClases()+"€");
					System.out.println("Complemento por alumnos: "+m.getExtraAlumnos()+"€");
					System.out.println("Informacion detallada en Complemento"+mes+rset.getString(3)+rset.getString(4)+".txt");
					System.out.println("*************************************************************");
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
