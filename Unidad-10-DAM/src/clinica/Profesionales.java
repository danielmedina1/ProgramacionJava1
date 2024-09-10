package clinica;

public class Profesionales extends Persona {
	protected String especialidad;
	protected int horario;
	private static final int MAÑANA=0;
	private static final int TARDE=1;
	private static final int GUARDIA=2;
	
	
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public static int getMañana() {
		return MAÑANA;
	}
	public static int getTarde() {
		return TARDE;
	}
	public static int getGuardia() {
		return GUARDIA;
	}
	
	public Profesionales(String dni, String nombre, String apellidos, String telefono, String especialidad,
			int horario) {
		super(dni, nombre, apellidos, telefono);
		this.especialidad = especialidad;
		this.horario = horario;
	}
	@Override
	public String toString() {
		return "Profesionales [especialidad=" + especialidad + ", horario=" + horario + "]";
	}
	
	
	
	
	

}
