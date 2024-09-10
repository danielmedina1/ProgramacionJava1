package examen;

import java.sql.SQLException;

public class Gerente extends Persona implements Impuestos {
	public String telefono;

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Gerente(String dni, String nombre, String apellidos, String direccion, String correo, String telefono) {
		super(dni, nombre, apellidos, direccion, correo);
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Gerente [telefono=" + telefono + "]";
	}

	@Override
	public double IRPF(double sueldo) {
		return sueldo*0.24;
	}
	public void pagoMonitor (Monitor m, String mes, int year) throws SQLException {
		m.clasesMonitor(mes, year);
		m.calculaComplementoClases(mes);
		double paga = Monitor.BASE + m.getExtraClases() + m.getExtraAlumnos();
		paga = paga - IRPF(paga);
		System.out.println("Monitor "+m.getNombre()+" "+m.getApellidos()+" pagado "+paga+" en "+mes);
		BD.getInstance().cargarParametrosConexion();
		BD.getInstance().consultaBD("insert into pagos values ('"+m.getCodigoMonitor()+"', '"+mes+"', "+year+", "+paga+", 'PAGADA')");
		BD.getInstance().cerrarConsulta();
	}
	public static void main(String[] args) throws SQLException {
		Monitor m = new Monitor(null, "Maria", "Perez", null, null, "100", null, null, 0, 0);
		Gerente g = new Gerente(null, null, null, null, null, null);
		g.pagoMonitor(m, "enero", 2023);
	}
	
	
}
