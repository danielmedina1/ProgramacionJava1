package gimnasio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AppGimnasio {
	
	
	public static void main(String[] args) {
		Monitor mn=new Monitor("Yoga", 9.15, "100", 0, 0, "Mario", "Lopez", "adsad@gmail.com", null);
		Monitor mn2=new Monitor("Zumba", 11.15, "300", 0, 0, "Maria", "Gonzalez", "adsad@gmail.com", null);
		Monitor mn3=new Monitor("Step", 13.15, "100", 0, 0, "Jesus", "Villanueva", "adsad@gmail.com", null);
		Monitor mn4=new Monitor("Bike", 17.15, "200", 0, 0, "Adolfo", "Joseph", "adsad@gmail.com", null);
		Monitor mn5=new Monitor("Pilates", 11.15, "500", 0, 0, "Antonio", "Gomez", "adsad@gmail.com", null);
		Cliente c=new Cliente("1", "Cliente", "Uno", null, 0, null, null);
		Cliente c2=new Cliente("2", "Cliente", "Dos", null, 0, null, null);
		Cliente c3=new Cliente("3", "Cliente", "Tres", null, 0, null, null);
		Cliente c4=new Cliente("4", "Cliente", "Cuatro", null, 0, null, null);
		Cliente c5=new Cliente("5", "Cliente", "Cinco", null, 0, null, null);
		ArrayList<Monitor> arr=new ArrayList<>();
		ArrayList<Cliente> acc=new ArrayList<>();
		arr.add(mn5); arr.add(mn4); arr.add(mn3); arr.add(mn2); arr.add(mn);
		acc.add(c5); acc.add(c4); acc.add(c3); acc.add(c2); acc.add(c);
		
		Scanner teclado=new Scanner(System.in);
		String usuario, contraseña;
		
		System.out.println("Introduzca el usuario y la contraseña (Ambos en minuscula):");
		System.out.println("Usuario: ");
		usuario=teclado.next();
		System.out.println("Contraseña: ");
		
		contraseña=teclado.next();
		for (int i = 0; i < arr.size(); i++) {
			if(usuario.equals("monitor") && contraseña.equals(arr.get(i).getCodigo())) {
				System.out.println("Monitor "+arr.get(i).getCodigo()+": "+arr.get(i).getNomMonitor()+" "+mn.getApeMonitor());
				System.out.println(arr.get(i).getActividadesReservadas());
			}
			
		}
		
		if(usuario.equals("admin") && contraseña.equals("1234")) {
			int opcion=0;
			do {
			menu();	
				
				
			}while(opcion!=5);
				
		}
		//Metodo Clientes
		for (int i = 0; i < acc.size(); i++) {
			if(usuario.equals("cliente") && contraseña.equals(acc.get(i).getCodigoCliente())) {
				File fn=new File("participantesCodigo.txt");
				try {
					Scanner cli=new Scanner(fn);
					String horaAnt="0";
					String linea[];
					String linea2[] = null;
					String cadena=cli.nextLine();
					String cadena2=cli.nextLine();
					while(cli.hasNext()) {
						cadena=cli.nextLine();
						cadena2=cadena;
						linea=cadena.split("-");
						linea2=cadena2.split("-");
						
						if(linea[3].equals(acc.get(i).getCodigoCliente())) {
							System.out.println("El cliente "+acc.get(i).getNombre()+" "+acc.get(i).getApellidos()+" tiene clase de "+linea[1]+" a las "+linea[2]);
								if(linea2[3].equals(linea[3]) && linea2[2].equals(linea[2])) {
									System.out.println("El cliente "+acc.get(i).getNombre()+" "+acc.get(i).getApellidos()+" tiene la clase de "+linea[1]+" a las "+linea[2]+" repetida con la clase "+linea2[1]+" a las "+linea2[2]);
									
								}
						}
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}

	

	private static void menu() {
		System.out.println("Bienvenido Administrador, que operaciones desea realizar:");
		System.out.println("1. Ver monitores");
		System.out.println("2. Ver Actividades de un monitor");
		System.out.println("3. Dar de alta a un monitor");
		System.out.println("4. Guardar y salir");
	}
	
	public void guardarMonitores() {
		try {
			FileOutputStream fi=new FileOutputStream("monitores.bin");
			ObjectOutputStream salida=new ObjectOutputStream(fi);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
