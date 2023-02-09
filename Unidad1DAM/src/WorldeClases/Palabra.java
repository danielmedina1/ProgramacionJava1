package WorldeClases;

public class Palabra {
	String cadena;

	boolean correcta() {
		return this.cadena.matches("^[A-Z]{5}$");
	}
	
	public String comparar(Palabra usuario) {
		String adivina="";
		for (int i = 0; i < usuario.getCadena().length(); i++) {
			if(this.getCadena().charAt(i)==usuario.getCadena().charAt(i)) {
				adivina=adivina+this.getCadena().charAt(i);
			}
			else {
				adivina=adivina+"_";
			}
			
		}
		return adivina;
	}
	
	
	
	public Palabra(String cadena) {
		super();
		this.cadena = cadena;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public String toString() {
		return cadena;
	}

	public boolean equals(Palabra p) {
	return this.getCadena().equals(p.getCadena());
	}
	
	
	
	

}
