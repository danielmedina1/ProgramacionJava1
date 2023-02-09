package edd;

public class Proceso {
	private String nombre;
	private int pid;
	private String nomSesion;
	private int numSesion;
	private double memoria;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getNomSesion() {
		return nomSesion;
	}
	public void setNomSesion(String nomSesion) {
		this.nomSesion = nomSesion;
	}
	public int getNumSesion() {
		return numSesion;
	}
	public void setNumSesion(int numSesion) {
		this.numSesion = numSesion;
	}
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	public Proceso() {
		this.nombre = "";
		this.pid = 0;
		this.nomSesion = "";
		this.numSesion = 0;
		this.memoria = 0;
	}
	public Proceso(String nombre, int pid, String nomSesion, int numSesion, double memoria) {
		this.nombre = nombre;
		this.pid = pid;
		this.nomSesion = nomSesion;
		this.numSesion = numSesion;
		this.memoria = memoria;
	}
	@Override
	public String toString() {
		return "Proceso [nombre=" + nombre + ", pid=" + pid + ", nomSesion=" + nomSesion + ", numSesion=" + numSesion
				+ ", memoria=" + memoria + "]";
	}

}
