package examen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) throws SQLException {
		String mes = "";
		String codMonitor = "";
		String contraseña = "";
		if (args.length == 3) {
			for (int i = 0; i < args.length; i++) {
				String cadena[] = args[i].split("=");
				if (cadena[0].equals("--codigo")) {
					codMonitor = args[i].split("=")[1];
				}
				if (cadena[0].equals("--mes")) {
					mes = args[i].split("=")[1];
				}
				if (cadena[0].equals("--pass")) {
					contraseña = args[i].split("=")[1];
				}
			}
			Monitor m = new Monitor(null, "Maria", "Perez", null, null);
			m.setCodigoMonitor(codMonitor);
			m.clasesMonitor(mes, 2023);
			m.calculaComplementoClases(mes);
			System.out.println("*************************************************************");
			System.out.println("MES: "+mes);
			System.out.println("MONITOR: "+m.getNombre()+" "+m.getApellidos());
			System.out.println("Complemento por clases: "+m.getExtraClases()+"€");
			System.out.println("Complemento por alumnos: "+m.getExtraAlumnos()+"€");
			System.out.println("Informacion detallada en Complemento"+mes+m.getNombre()+m.getApellidos()+".txt");
			System.out.println("*************************************************************");
//	Lo de la Base de Datos
//			BD.getInstance().cargarParametrosConexion();
//			ResultSet rset = BD.getInstance().consultaBD("SELECT codigomonitor, clave, nombre, apellidos FROM monitor");
//			while (rset.next()) {
//				if (rset.getString(1).equals(codMonitor) && rset.getString(2).equals(contraseña)) {
//					Monitor m = new Monitor(null, rset.getString(3), rset.getString(4), null, null);
//					m.setCodigoMonitor(codMonitor);
//					m.clasesMonitor(mes, 2023);
//					m.calculaComplementoClases(mes);
//					System.out.println("*************************************************************");
//					System.out.println("MES: "+mes);
//					System.out.println("MONITOR: "+rset.getString(3)+" "+rset.getString(4));
//					System.out.println("Complemento por clases: "+m.getExtraClases()+"€");
//					System.out.println("Complemento por alumnos: "+m.getExtraAlumnos()+"€");
//					System.out.println("Informacion detallada en Complemento"+mes+rset.getString(3)+rset.getString(4)+".txt");
//					System.out.println("*************************************************************");
//				}
//			}
//			BD.getInstance().cerrarConsulta();
		} 
		if (args.length == 1){
			String cadena[] = args[0].split("=");
			if (cadena[0].equals("--mes")) {
				mes = args[0].split("=")[1];
			}
			ArrayList<Monitor> m2 = new ArrayList<Monitor>(); 
			Monitor m = new Monitor(null, "Maria", "Perez", null, null);
			m.setCodigoMonitor(codMonitor);
			Gerente g = new Gerente("", "Daniel", "Medina Alcolea", "", "", "");
			g.pagoMonitor(m, mes, 2023);
//			SQL
//			BD.getInstance().cargarParametrosConexion();
//			ResultSet rset = BD.getInstance().consultaBD("SELECT * FROM monitor");
//			while (rset.next()) {
//				m2.add(new Monitor(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6), rset.getString(7), null, null, null));
//			}
//			for (int i = 0; i < m2.size(); i++) {
//				g.pagoMonitor(m2.get(i), mes, 2023);
//			}
//			BD.getInstance().cerrarConsulta();
			
		}
	}

}
