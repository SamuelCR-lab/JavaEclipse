package CentroEducativo.java;

public class Modulo {
	String Nombre;
	int numeroHoras;
	Profesor unProfesor;
	boolean Convalidable;
	
	public Modulo(String nombre, int numeroHoras, Profesor unProfesor, boolean convalidable) {
		super();
		Nombre = nombre;
		this.numeroHoras = numeroHoras;
		this.unProfesor = unProfesor;
		Convalidable = convalidable;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	public Profesor getUnProfesor() {
		return unProfesor;
	}

	public void setUnProfesor(Profesor unProfesor) {
		this.unProfesor = unProfesor;
	}

	public boolean isConvalidable() {
		return Convalidable;
	}
	public void setConvalidable(boolean convalidable) {
		Convalidable = convalidable;
	}
	
}
