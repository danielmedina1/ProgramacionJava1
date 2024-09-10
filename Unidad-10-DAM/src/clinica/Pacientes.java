package clinica;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Pacientes extends Persona {
	private float peso;
	private int edad;
	private String cita;
	private String historia;
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCita() {
		return cita;
	}
	public void setCita(String cita) {
		this.cita = cita;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public Pacientes(String dni, String nombre, String apellidos, String telefono, float peso, int edad, String cita,
			String historia) {
		super(dni, nombre, apellidos, telefono);
		this.peso = peso;
		this.edad = edad;
		this.cita = cita;
		this.historia = historia;
	}
	@Override
	public String toString() {
		return "Pacientes [peso=" + peso + ", edad=" + edad + ", cita=" + cita + ", historia=" + historia + "]";
	} 
	
	public void guardarHistoria() {
		FileWriter file;
		PrintWriter salida;
		String nombreFichero="Historia"+this.getDni()+".txt";
		try {
			file=new FileWriter(nombreFichero, true);
			salida= new PrintWriter(nombreFichero);
			salida.println(this.getHistoria());
			salida.flush();
			salida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
