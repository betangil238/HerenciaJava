package ExtraExercise4;

import java.util.ArrayList;

public class Estudientes extends Persona {
	protected ArrayList<String> cursos=new ArrayList<>();

	public Estudientes() {
		super();
	}
	public Estudientes(String nombre, String apellidos, String documento, String estadoCivil, ArrayList<String> cursos) {
		super(nombre, apellidos, documento, estadoCivil);
		this.cursos = cursos;
	}
	public ArrayList<String> getCurso() {
		return cursos;
	}
	public void setCurso(ArrayList<String> cursos) {
		this.cursos = cursos;
	}
	
	public void matricularCursos(String curso) {
		cursos.add(curso);
	}
	
}
