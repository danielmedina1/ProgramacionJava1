package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Monitor extends Persona {
	public String codigoMonitor;
	public String clave;
	public ArrayList<Clase> listaClases;
	public double extraClases;
	public double extraAlumnos;
	public static final int BASE = 1200;
	
	public String getCodigoMonitor() {
		return codigoMonitor;
	}
	public void setCodigoMonitor(String codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public ArrayList<Clase> getListaClases() {
		return listaClases;
	}
	public void setListaClases(ArrayList<Clase> listaClases) {
		this.listaClases = new ArrayList<Clase>();
	}
	public double getExtraClases() {
		return extraClases;
	}
	public void setExtraClases(double extraClases) {
		this.extraClases = extraClases;
	}
	public double getExtraAlumnos() {
		return extraAlumnos;
	}
	public void setExtraAlumnos(double extraAlumnos) {
		this.extraAlumnos = extraAlumnos;
	}
	public static int getBase() {
		return BASE;
	}
	
	public Monitor(String dni, String nombre, String apellidos, String direccion, String correo, String codigoMonitor,
			String clave, ArrayList<Clase> listaClases, double extraClases, double extraAlumnos) {
		super(dni, nombre, apellidos, direccion, correo);
		this.codigoMonitor = codigoMonitor;
		this.clave = clave;
		this.listaClases = new ArrayList<Clase>();
		this.extraClases = extraClases;
		this.extraAlumnos = extraAlumnos;
	}
	public Monitor(String dni, String nombre, String apellidos, String direccion, String correo) {
		super(dni, nombre, apellidos, direccion, correo);
		this.codigoMonitor = "";
		this.clave = "";
		this.listaClases = new ArrayList<Clase>();
		this.extraClases = 0;
		this.extraAlumnos = 0;
	}
	@Override
	public String toString() {
		return "Monitor [codigoMonitor=" + codigoMonitor + ", clave=" + clave + ", listaClases=" + listaClases
				+ ", extraClases=" + extraClases + ", extraAlumnos=" + extraAlumnos + "]";
	}
	
	public void clasesMonitor (String mes, int year) {
		try {
			Scanner sc = new Scanner(new File("asistencia"+mes+"2023.csv"));
			String linea[];
			String cadena;
			cadena = sc.nextLine();
			while (sc.hasNext()) {
				cadena = sc.nextLine();
				linea = cadena.split(";");
				if (this.codigoMonitor.equals(linea[5])) {
					this.listaClases.add(new Clase(linea[0], linea[1], linea[2], linea[3], linea[4], linea[5], linea[6]));
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void calculaComplementoClases(String mes) {
		mes = this.getListaClases().get(0).getMes();
		String monitor = this.getNombre()+this.getApellidos();
		double numClases = 0;
		double numAlumnos = 0;
		double totalClases = 0;
		double totalAlumnos = 0;
		try {
			PrintWriter pw = new PrintWriter(new File("Complemento"+mes+monitor+".txt"));
			pw.println("*************************************************");
			pw.println("MES: "+mes);
			pw.println("Complementos Nómina: "+monitor);
			pw.println("*************************************************");
			int numDias = 0;
			numDias = Integer.parseInt(this.getListaClases().get(this.getListaClases().size()-1).getDia());
			for (int i = 1; i <= numDias; i++) {
					for (int j = 0; j < this.getListaClases().size(); j++) {
						if (this.getCodigoMonitor().equals(this.getListaClases().get(j).getCodigoMonitor()) && i == Integer.parseInt(this.getListaClases().get(j).getDia())) {
							numClases++;
							numAlumnos = numAlumnos + Double.parseDouble(this.getListaClases().get(j).getNumeroParticipantes());
						}
					}
						pw.println("Dia "+i);
						pw.println("\tNumero de Clases: "+numClases+" a 5€/clase = "+numClases*5+"€");
						pw.println("\tNumero total de Alumnos: "+numAlumnos+" a 0,05€/alumnos = "+numAlumnos*0.05);
						totalClases = totalClases + numClases;
						totalAlumnos = totalAlumnos + numAlumnos;
						numAlumnos = 0;
						numClases = 0;
						
					
			}
			pw.println("*************************************************");
			pw.println("Total por clases: "+totalClases*5+"€");
			pw.println("Total por alumnos: "+totalAlumnos*0.05+"€");
			pw.println("*************************************************");
			this.setExtraAlumnos(totalAlumnos*0.05);
			this.setExtraClases(totalClases*5);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		Monitor m = new Monitor(null, "Maria", "Perez", null, null);
		m.setCodigoMonitor("100");
		m.clasesMonitor("Enero", 2023);
		m.calculaComplementoClases("enero");
		System.out.println(m.getExtraAlumnos());
		System.out.println(m.getExtraClases());
	}
	
	

}
