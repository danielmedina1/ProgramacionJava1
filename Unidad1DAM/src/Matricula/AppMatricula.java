package Matricula;

import java.util.LinkedList;
import java.util.Scanner;

public class AppMatricula {
	private LinkedList<Alumno> preinscritos;
	private LinkedList<Alumno> matriculados;
	
	public AppMatricula() {
		this.preinscritos=new LinkedList<>();
		this.matriculados=new LinkedList<>();
	}

	public LinkedList<Alumno> getPreinscritos() {
		return preinscritos;
	}

	public void setPreinscritos(LinkedList<Alumno> preinscritos) {
		this.preinscritos = preinscritos;
	}

	public LinkedList<Alumno> getMatriculados() {
		return matriculados;
	}

	public void setMatriculados(LinkedList<Alumno> matriculados) {
		this.matriculados = matriculados;
	}

	@Override
	public String toString() {
		return "AppMatricula [preinscritos=" + preinscritos + ", matriculados=" + matriculados + "]";
	}
	
	public static void main(String[] args) {
		AppMatricula app=new AppMatricula();
		app.getPreinscritos().add(new Alumno("123", "1111H", "Margarita", "Marga@ribera"));
		app.getPreinscritos().add(new Alumno("124", "2222H", "Marta", "Marta@ribera"));
		app.getPreinscritos().add(new Alumno("125", "3333H", "Mario", "Mario@ribera"));
		app.getPreinscritos().add(new Alumno("126", "4444H", "Mar", "Mar@ribera"));
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		do {
			app.menu();
			opcion=teclado.nextInt();
			if(app.getPreinscritos().size()>0) {
				app.getMatriculados().addLast(null);
			}
			}while(opcion!=5);
		
	}

	private void menu() {
		System.out.println("1. Matricular alumnos");
		System.out.println("2. Borrar alumnos");
		System.out.println("3. Mostrar ultimo matriculado");
		System.out.println("4. ");
		System.out.println("5. Salir");
		
	}

}
