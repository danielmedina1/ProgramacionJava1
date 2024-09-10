package examen_2ordinaria;

import java.io.File;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class App implements Informe {
	public static void main(String[] args) throws SQLException {
		Informe obj = new Informe() {	
			@Override
			public void informeVentas() throws SQLException {

				BD miconexion = BD.getInstance();
				
				miconexion.setUsuario("tiendaFruta");
				miconexion.setPassword("tiendaFruta");
				miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
				
				try {
					double total = 0;
					ArrayList<Cliente> clis = new ArrayList<>();
					ResultSet rset=miconexion.consultaBD("SELECT dni, nombre, apellidos, direccion FROM persona ");
					while (rset.next()) {
						clis.add(new Cliente(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), null));
					}
					for (int j = 0; j < clis.size(); j++) {
						clis.get(j).asignarMetodoPago();
						clis.get(j).cargarHistorico();
						System.out.println("-----------------------------------------------------------");
						System.out.println("Cliente: "+clis.get(j).getNombre()+" "+clis.get(j).getApellidos());
						if (clis.get(j).getMetodoPago() == null) {
							System.out.println("No se ha registrado ningun metodo de pago");
						} else {
							System.out.println("Metodo de pago: "+clis.get(j).getMetodoPago());	
						}
						if (clis.get(j).getHistoricoPedidios().size() == 0) {
							System.out.println("Este cliente no ha realizado pedidos");
						} else {
							System.out.println("Pedidos realizados en 2022: ");
							for (int i = 0; i < clis.get(j).getHistoricoPedidios().size(); i++) {
								System.out.println("\t"+clis.get(j).getHistoricoPedidios().get(i).getCodigoPedido()+" ---> "+clis.get(j).getHistoricoPedidios().get(i).getTotal());
								total = total + clis.get(j).getHistoricoPedidios().get(i).getTotal();
							
						}
						System.out.println("Importe total: "+total);
						}
						total = 0;

					}
					System.out.println("-----------------------------------------------------------");
				} catch (Exception e) {
					e.printStackTrace();
				}
				BD.getInstance().cerrarConsulta();
			}};
			
		if (args[0].split("=")[1].equals("DNI")) {
			obj.informeVentas();
		} else {
			muestraClientes();
		}
		
	}

	private static void muestraClientes() throws SQLException{
		BD miconexion = BD.getInstance();
		Cliente cli = new Cliente(null, null, null, null, null);
		
		miconexion.setUsuario("tiendaFruta");
		miconexion.setPassword("tiendaFruta");
		miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521/XE");
		
		try {
			double total = 0;
			ResultSet rset=miconexion.consultaBD("SELECT nombre||' '||apellidos, dni FROM persona");
			PrintWriter pw = new PrintWriter(new File("Ventas2022.txt"));
			while (rset.next()) {
				cli.setDni(rset.getString(2));
				cli.cargarHistorico();
				for (int i = 0; i < cli.getHistoricoPedidios().size(); i++) {
					total= total +cli.getHistoricoPedidios().get(i).getTotal();
				}
					
				
				pw.println("***************************Cliente****************************");
				if(cli.getHistoricoPedidios().size() == 0) {
					pw.println("\t"+ rset.getString(1)+" no ha realizado ningun pedido");
				} else {
					pw.println("\t"+"\t"+rset.getString(1)+" ---> "+total);
				}
				pw.println("");
				total = 0;
				cli.setHistoricoPedidios(null);
				}
			pw.println("**************************************************************");
			pw.flush();
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		BD.getInstance().cerrarConsulta();
	
	}

	@Override
	public void informeVentas() throws SQLException{}
}