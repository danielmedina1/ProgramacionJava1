package examen_1ordinaria;

import java.util.ArrayList;

public class Factura {
	public String codigoFactura;
	public int codigoPedido;
	public String dniCliente;
	public ArrayList<ProductoPedido> productosPedidos;
	public double total;
	public String getCodigoFactura() {
		return codigoFactura;
	}
	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}
	public int getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public ArrayList<ProductoPedido> getProductosPedidos() {
		return productosPedidos;
	}
	public void setProductosPedidos(ArrayList<ProductoPedido> productosPedidos) {
		this.productosPedidos = productosPedidos;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public Factura(String codigoFactura, int codigoPedido, String dniCliente,
			ArrayList<ProductoPedido> productosPedidos, double total) {
		super();
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.productosPedidos = productosPedidos;
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", codigoPedido=" + codigoPedido + ", dniCliente="
				+ dniCliente + ", productosPedidos=" + productosPedidos + ", total=" + total + "]";
	}
	
	
	

}
