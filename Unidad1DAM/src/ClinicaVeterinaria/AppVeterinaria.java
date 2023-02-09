package ClinicaVeterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class AppVeterinaria {
	private ArrayList<Cliente> clientes;
	public AppVeterinaria() {
		this.clientes=new ArrayList<>();
	}
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}



	public static void main(String[] args) {
		Vacuna v=new Vacuna("Astra Zeneca", "Enero", "XX", 20);
		Vacuna v1=new Vacuna("Pfizer", "Junio", "XX", 30);
		
		
		ArrayList <Vacuna> listaVacunas=new ArrayList<>();
		listaVacunas.add(v1);
		listaVacunas.add(v);
		
		
		Perro p=new Perro("Pluto", "Border Collie", "Hembra", 1, 10, listaVacunas, "123455", false);
		Gato g=new Gato("Michi", "Siames", "Masculino", 3, 20.5, true);
		Gato g2=new Gato("Alfredo", "Ragdoll", "Femenini", 5, 14.5, false);
	
		ArrayList<Animal> mascotas=new ArrayList<>();
		mascotas.add(g);
		mascotas.add(p);
		ArrayList<Animal> mascotas1=new ArrayList<>();
		mascotas.add(g2);
		
		Cliente c=new Cliente("Maria", "1245H", "Plaza del Pan", "maria@ribera", mascotas);
		Cliente c1=new Cliente("Mariano", "1235H", "Plaza del Queso", "mariano@ribera", mascotas1);
		
		AppVeterinaria a=new AppVeterinaria();
		// ArrayList<Cliente> clientes=new ArrayList<>();
		a.getClientes().add(c1);		
		a.getClientes().add(c);
		
		System.out.println("1. Dar de alta un cliente");
		System.out.println("2. Atender un cliente");
		System.out.println("\t1.Ver mascotas");
		System.out.println("Elige una opcion");
		Scanner teclado=new Scanner(System.in);
		int opcion=teclado.nextInt();
		switch(opcion) {
		case 1:
			break;
		case 2: System.out.println("Introduzca el DNI: ");
		String dni=teclado.next();
			a.atenderCliente(dni);
		System.out.println("1.Dar de alta nueva mascota");
		System.out.println("2.Dar de baja mascota");
		opcion=teclado.nextInt();
		if(opcion==1) {
			a.darAlta(dni);
		}
		else {
			a.darBaja(dni);
		}
			break;
		}
		
	}


	private void darBaja(String dni) {
		int i=1;
		Scanner tec=new Scanner (System.in);
		for (Cliente cliente : this.getClientes()) {
			if (cliente.getDNI().equals(dni)) {
				for (Animal m : cliente.getMascotas()) {
					System.out.println(i+" "+m.getNombre());
					
				}
			}
		}
		System.out.println("¿Qué quieres dar de baja?");
		int indice=tec.nextInt();
		//cliente.getMascotas().remove(indice-1);
	}


	private void darAlta(String dni) {
		
		
	}


	private void atenderCliente(String dni) {
		for (Cliente cliente : this.getClientes()) {
			if (cliente.getDNI().equals(dni)) {
				System.out.println("El cliente es: "+cliente.getNombre());
				System.out.println("Mascotas: ");
				for (Animal a : cliente.getMascotas()) {
					if(a instanceof Perro) {
						System.out.println("\tPerro: "+a.getNombre());
					}
					if(a instanceof Gato) {
						System.out.println("\tGato: "+a.getNombre());
					}
				}
			}
			
		}
		
	}

}
