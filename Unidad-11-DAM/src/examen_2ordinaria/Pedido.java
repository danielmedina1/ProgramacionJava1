package examen_2ordinaria;

public class Pedido {
	private int codigoPedido;
	private String dniCliente;
	private double total;
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Pedido(int codigoPedido, String dniCliente, double total) {
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.total = total;
	}
	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", dniCliente=" + dniCliente + ", total=" + total + "]";
	}
	
	

}
