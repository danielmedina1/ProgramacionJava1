package examen2019;

public class Administrador extends Persona {
	private int turno;
	private static final int TURNO1=1;
	private static final int TURNO2=2;
	private static final int TURNO3=3;
	
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public static int getTurno1() {
		return TURNO1;
	}
	public static int getTurno2() {
		return TURNO2;
	}
	public static int getTurno3() {
		return TURNO3;
	}
	public Administrador(String dni, String nombre, String direccion, String usuario, String clave, int turno) {
		super(dni, nombre, direccion, usuario, clave);
		this.turno = turno;
	}
	
	

}
