package Unidad6_NotasAlumno;

public class ClaseDAM {
	private Alumno[] dam;
	
	public ClaseDAM() {
		this.dam=new Alumno[3];
		for (int i = 0; i < dam.length; i++) {
			this.dam[i]=new Alumno();
		}
	}

	public Alumno[] getDam() {
		return dam;
	}

	public void setDam(Alumno[] dam) {
		this.dam = dam;
	}
	
	public static void main(String[] args) {
		ClaseDAM d=new ClaseDAM();
		d.getDam()[0].setNombre("Maria");
		d.getDam()[0].setApellidos("Perez");
		d.getDam()[0].setEdad(18);
		System.out.println(d.getDam()[0].getNombre());
		
		
	}

}
