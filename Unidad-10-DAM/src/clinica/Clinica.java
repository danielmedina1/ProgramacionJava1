package clinica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
		private ArrayList<Profesionales> medicos;
		private ArrayList<Pacientes> listapacientes;
		
	public ArrayList<Profesionales> getMedicos() {
			return medicos;
		}

		public void setMedicos(ArrayList<Profesionales> medicos) {
			this.medicos = medicos;
		}

		public ArrayList<Pacientes> getListapacientes() {
			return listapacientes;
		}

		public void setListapacientes(ArrayList<Pacientes> listapacientes) {
			this.listapacientes = listapacientes;
		}
		

	public Clinica(ArrayList<Profesionales> medicos, ArrayList<Pacientes> listapacientes) {
			this.medicos = medicos;
			this.listapacientes = listapacientes;
		}
	public Clinica() {
		this.medicos = new ArrayList<>();
		this.listapacientes = new ArrayList<>();
	}

	public boolean esNumero(String n) {
		return n.matches("^[0-9]+$");
	}
	public void rellenarArrays() {
		File f = new File("personas.csv");
		try {
			Scanner entrada = new Scanner(f);
			String cadena;
			String []linea;
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split("\t");
				if(linea[0].equals("medico")) {
					this.medicos.add(new Profesionales(linea[1], linea[2], linea[3], linea[4], linea[5], Integer.parseInt(linea[6])));
				} else {
					this.listapacientes.add(new Pacientes(linea[1], linea[2], linea[3], linea[4], Float.parseFloat(linea[7]), Integer.parseInt(linea[8]), linea[10], ""));
				}
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Clinica clinicaRibera = new Clinica();
		boolean salir=false;
		Scanner sc=new Scanner(System.in);
		clinicaRibera.rellenarArrays();
		String opcion;
		int opt;
		String cadena="";
		do {
			do {
				clinicaRibera.menu();
				opcion=sc.next();
			}while(!clinicaRibera.esNumero(opcion));
			opt=Integer.parseInt(opcion);
			switch(opt) {
			case 1:
				clinicaRibera.pacientesHoy();
				break;
			case 2:
				
				break;
			case 3:
				break;
			case 4:
				System.out.println("Hasta Pronto");
				break;
			}
		}while(opt!=4);
		
	}

	private void pacientesHoy() {
		for(Profesionales m: this.getMedicos()) {
			System.out.println("**********************"+m.getEspecialidad()+"**********************");
			System.out.println("Dr/Dra."+m.getNombre()+" "+m.getApellidos()+": ");
			this.getListapacientes().stream().filter(p -> p.getCita().equals(m.getEspecialidad())).forEach(p -> System.out.println("\t"+p.getNombre()+" "+p.getApellidos()));
			System.out.println("---------------------------------------------------------");
		}
		
		
	}

	private void menu() {
		System.out.println("Seleccione la opcion que desee realizar: ");
		System.out.println("1. Listado de Pacientes");
		System.out.println("2. Cargar Historias Clinicas");
		System.out.println("3. Atender Paciente");
		System.out.println("4. Salir");
		System.out.println("Elija una opcion: ");
		
	}

}
