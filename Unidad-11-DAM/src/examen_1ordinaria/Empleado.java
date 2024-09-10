package examen_1ordinaria;

import java.util.ArrayList;

public class Empleado extends Persona {
	public int turno;
	public ArrayList<Pedido> pedidosAsignados;
	
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public ArrayList<Pedido> getPedidosAsignados() {
		return pedidosAsignados;
	}
	public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
		this.pedidosAsignados = pedidosAsignados;
	}
	
	public Empleado(String dni, String nombre, String apellidos, String direccion, int turno,
			ArrayList<Pedido> pedidosAsignados) {
		super(dni, nombre, apellidos, direccion);
		this.turno = turno;
		this.pedidosAsignados = pedidosAsignados;
	}
	@Override
	public String toString() {
		return "Empleado [turno=" + turno + ", pedidosAsignados=" + pedidosAsignados + "]";
	}
	
	

}
