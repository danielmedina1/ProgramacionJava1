package Unidad5;

public class Password {

	public String contraseña;
	public int longitud;
	
	public Password(){
		this.longitud=8;
		this.contraseña ="";
		
	}
	
	
	public Password(String contraseña, int longitud) {
		super();
		this.contraseña = contraseña;
		this.longitud = 8;
	}
	
	public void generarPassword(String cadena) {
		if(cadena.length()>=6) {
			this.contraseña=cadena.substring(0, 2).toUpperCase()+cadena.substring(2)+(int)(1+Math.random()*99);
			this.longitud=this.contraseña.length();
		}
		else {this.contraseña= "";}
		
	}


	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	@Override
	public String toString() {
		return "La contraseña es: " + contraseña ;
	}
	

	

}
