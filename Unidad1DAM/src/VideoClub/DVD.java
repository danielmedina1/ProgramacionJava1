package VideoClub;

public class DVD  {
	//dahbdf
	private String Titulo;
	private int Tipo;
	public static final int INFANTIL=2;
	public static final int NORMAL=0;
	public static final int NOVEDAD=1;
	
	//Getters y Setters Inicio
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public static int getInfantil() {
		return INFANTIL;
	}
	public static int getNormal() {
		return NORMAL;
	}
	public static int getNovedad() {
		return NOVEDAD;
	}
	//Getters y Setters Final
	//Constructores Inicio
	public DVD(String titulo, int tipo) {
		Titulo = titulo;
		Tipo = tipo;
	}
	public DVD() {
		Titulo = "";
		Tipo = 0;
	}
	//Constructores Final
	//To String Inicio
	@Override
	public String toString() {
		return "Alquiler [Titulo=" + Titulo + ", Tipo=" + Tipo + "]";
	}
	//To String Final
	
	


	
	
	
	
	

}
