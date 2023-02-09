package Actividades_Repaso_6;

public class Direccion {
	private String nombreCalle;
	private String numeroPortal;
	private int numeroPiso;
	private int numeroPuerta;
	private int codPostal;
	
	//ToString Start
	@Override
	public String toString() {
		return "nombreCalle=" + nombreCalle + ", numeroPortal=" + numeroPortal + ", numeroPiso=" + numeroPiso
				+ ", numeroPuerta=" + numeroPuerta + ", codPostal=" + codPostal ;
	}
	//ToString End
	//Getters y Setters Start
	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public String getNumeroPortal() {
		return numeroPortal;
	}

	public void setNumeroPortal(String numeroPortal) {
		this.numeroPortal = numeroPortal;
	}

	public int getNumeroPiso() {
		return numeroPiso;
	}

	public void setNumeroPiso(int numeroPiso) {
		this.numeroPiso = numeroPiso;
	}

	public int getNumeroPuerta() {
		return numeroPuerta;
	}

	public void setNumeroPuerta(int numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	//Getters y Setters End
	//Constructors Start
	public Direccion(String nombreCalle, String numeroPortal, int numeroPiso, int numeroPuerta, int codPostal) {
		this.nombreCalle = nombreCalle;
		this.numeroPortal = numeroPortal;
		this.numeroPiso = numeroPiso;
		this.numeroPuerta = numeroPuerta;
		this.codPostal = codPostal;
	}
	public Direccion() {
		this.nombreCalle = "";
		this.numeroPortal = "";
		this.numeroPiso = 0;
		this.numeroPuerta = 0;
		this.codPostal = 0;
	}
	//Constructors End
	
	public static void main(String[] args) {
		Direccion d=new Direccion("Plaza del pan","1B",1 , 2, 45600);
		System.out.println(d);
	}

}
