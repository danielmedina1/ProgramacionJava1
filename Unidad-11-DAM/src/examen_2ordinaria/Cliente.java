package examen_2ordinaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona {
	private String metodoPago;
	private ArrayList<Pedido> historicoPedidios = new ArrayList<Pedido>();
	
	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public ArrayList<Pedido> getHistoricoPedidios() {
		return historicoPedidios;
	}

	public void setHistoricoPedidios(ArrayList<Pedido> historicoPedidios) {
		this.historicoPedidios = new ArrayList<Pedido>();
	}

	public Cliente(String dni, String nombre, String apellidos, String direccion, String metodoPago,
			ArrayList<Pedido> historicoPedidios) {
		super(dni, nombre, apellidos, direccion);
		this.metodoPago = metodoPago;
		this.historicoPedidios = new ArrayList<Pedido>();
	}
	public Cliente(String dni, String nombre, String apellidos, String direccion, String metodoPago) {
		super(dni, nombre, apellidos, direccion);
		this.metodoPago = metodoPago;
	}
	
	

	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + ", historicoPedidios=" + historicoPedidios + "]";
	}
	
	public void asignarMetodoPago() {
		try {
			Scanner entrada = new Scanner(new File("metodoPagocliente.csv"));
			String cadena = "";
			String linea [];
			entrada.nextLine();
			while (entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				if (linea[0].equals(this.getDni())) {
					this.setMetodoPago(linea[1]);
				}
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void cargarHistorico() {
		try {
			Scanner entrada = new Scanner(new File("Pedidos2022.csv"));
			String cadena = "";
			String linea [];
			entrada.nextLine();
			while (entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				if(linea[1].equals(this.getDni())) {
					this.historicoPedidios.add(new Pedido(Integer.parseInt(linea[0]) , linea[1], Double.parseDouble(linea[2])));	
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		
	}
	
	

}
