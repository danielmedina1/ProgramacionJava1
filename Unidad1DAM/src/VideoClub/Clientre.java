package VideoClub;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Clientre {
	private ArrayList <Alquiler> Alquileres;
	private String Nombre;
	
	//Getters y Setters Inicio
	public ArrayList<Alquiler> getAlquileres() {
		return Alquileres;
	}
	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		Alquileres = alquileres;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	//Getters y Setters Final
	//Constructores Inicio
	public Clientre(String nombre) {
		Alquileres = new ArrayList<>();
		Nombre = nombre;
	}
	public Clientre(ArrayList<Alquiler> alquileres, String nombre) {
		Alquileres = alquileres;
		Nombre = nombre;
	}
	//Constructores Final
	//To String Inicio
	@Override
	public String toString() {
		return "Clientre [Alquileres=" + Alquileres + ", Nombre=" + Nombre + "]";
	}
	//To String Final
	//nuevoAlquiler Inicio
	public void nuevoAlquiler(Alquiler a) {
		this.Alquileres.add(a);
	}
	//nuevoAlquiler Final
	//Informe Inicio
	public double Informe() throws FileNotFoundException {
		PrintWriter salida=new PrintWriter("Ticket"+this.getNombre()+".txt");
		double precio=0;
		double total=0;
		int puntos=0;
		System.out.println("Informe de "+this.getNombre());
		for (Alquiler i:this.getAlquileres()) {
			puntos++;
			switch(i.getDVD().getTipo()) {
			case DVD.NORMAL:
				precio=2*i.getTiempo(); break;
			case DVD.INFANTIL:
				precio=1.5*i.getTiempo(); break;
			case DVD.NOVEDAD:
				precio=3*i.getTiempo();
				if(i.getTiempo()>1) {
					puntos++;
				} 
				break;
			} 
			System.out.println("\t"+i.getDVD().getTitulo()+" "+precio+"€");
			total=total+precio;
		}//for
		
		System.out.println("IMPORTE: "+total+"€");
		System.out.println("Puntos: "+puntos);
			
		
		return total;
	}
	//Informe Final
}
