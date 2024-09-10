package ejercicio_algo;

public class CargaProductos {
	private String codigoProducto;
	private String nombre;
	private String gama;
	private String dimensiones;
	private String proveedor;
	private String descripcion;
	private String cabtidadStock;
	private String precioVenta;
	private String precioProveeddor;
	//Getters y Setters
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGama() {
		return gama;
	}
	public void setGama(String gama) {
		this.gama = gama;
	}
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCabtidadStock() {
		return cabtidadStock;
	}
	public void setCabtidadStock(String cabtidadStock) {
		this.cabtidadStock = cabtidadStock;
	}
	public String getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(String precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getPrecioProveeddor() {
		return precioProveeddor;
	}
	public void setPrecioProveeddor(String precioProveeddor) {
		this.precioProveeddor = precioProveeddor;
	}
	//Constructor
	public CargaProductos(String codigoProducto, String nombre, String gama, String dimensiones, String proveedor,
			String descripcion, String cabtidadStock, String precioVenta, String precioProveeddor) {
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.gama = gama;
		this.dimensiones = dimensiones;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.cabtidadStock = cabtidadStock;
		this.precioVenta = precioVenta;
		this.precioProveeddor = precioProveeddor;
	}
	//To String
	@Override
	public String toString() {
		return "codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", gama=" + gama
				+ ", dimensiones=" + dimensiones + ", proveedor=" + proveedor + ", descripcion=" + descripcion
				+ ", cabtidadStock=" + cabtidadStock + ", precioVenta=" + precioVenta + ", precioProveeddor="
				+ precioProveeddor;
	}
	
	
	
	
	

}
