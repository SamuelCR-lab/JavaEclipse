package CentroEducativo.java;

public class Profesor {
	String DNI;
	String Nombre;
	String Apellidos;
	int Salario;
	int Nºasignaturas;
	private boolean Tutor;
	
	public Profesor(String dNI, String nombre, String apellidos, int salario, int nºasignaturas, boolean tutor) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Salario = salario;
		Nºasignaturas = nºasignaturas;
		Tutor = tutor;
	}
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
	public int getNºasignaturas() {
		return Nºasignaturas;
	}
	public void setNºasignaturas(int nºasignaturas) {
		Nºasignaturas = nºasignaturas;
	}
	public boolean isTutor() {
		return Tutor;
	}
	public void setTutor(boolean tutor) {
		Tutor = tutor;
	}

}
