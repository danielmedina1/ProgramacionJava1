package gimnasio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class ActividadReservada implements Serializable {
	private String nombreActividad;
	private double hora;
	private String codigoMonitor;
	private int nMax;
	private int numParc;
	//Getters y Setters
	public String getNombreActividad() {
		return nombreActividad;
	}
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public String getCodigo() {
		return codigoMonitor;
	}
	public void setCodigo(String codigo) {
		this.codigoMonitor = codigo;
	}
	public int getNMax() {
		return nMax;
	}
	public void setNMax(int parcMax) {
		this.nMax = parcMax;
	}
	public int getNumParc() {
		return numParc;
	}
	public void setNumParc(int numParc) {
		this.numParc = numParc;
	}
	//Constructor
	public ActividadReservada(String nombreActividad, double hora, String codigoMonitor, int nMax, int numParc) {
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.nMax = nMax;
		this.numParc = this.calculaParticipantes(this.nombreActividad, this.hora);
	}
	public ActividadReservada(String nombreActividad, double hora, int nMax) {
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.nMax = nMax;
	}
	public ActividadReservada(String codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}
	//To String
	@Override
	public String toString() {
		return nombreActividad + " a las "+hora+" tiene "+numParc+" participantes y sobran "+(nMax-numParc)+" puestos"+"\n" ;
	}
	
	//Methods
	private int calculaParticipantes(String codigoMonitor2, double hora2) {
		int cant=0;
		
		File partc=new File("participantes.txt");
		try {
			Scanner partcsc=new Scanner(partc);
			
			while(partcsc.hasNext()) {
				String cadena=partcsc.nextLine();
				String[] tipo=cadena.split("-");	
				if(codigoMonitor2.equals(tipo[1]) && Double.parseDouble(tipo[2])==hora2) {
					cant++;
				}
					
			}
			partcsc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return cant;
	}
	public static void main(String[] args) {
		ActividadReservada c=new ActividadReservada("Zumba", 17.15, "1234", 1234, 3);
		System.out.println(c.getNumParc());
		
	}
	
	
	
	

}
