package Unidad5;

public class JugadorCarta {
	private String nombre;
	private Carta c;
	
	public JugadorCarta (String nombre) {
		this.nombre=nombre;
		this.c=new Carta();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta getC() {
		return c;
	}

	public void setC(Carta c) {
		this.c = c;
	}

	public void extraerCarta() {
		int numero=0;
		String palos[]= {"Copas", "Bastos", "Espadas", "Oros"};
		int posicion=(int)(Math.random()*4);
		this.c.setPalo(palos[posicion]);
		do {
			numero=(int)(1+Math.random()*12);
		}while(numero==8 || numero==9);
		this.c.setNumero(numero);
	}
}
