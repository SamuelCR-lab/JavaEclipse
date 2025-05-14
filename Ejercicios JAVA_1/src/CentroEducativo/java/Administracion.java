package CentroEducativo.java;

public class Administracion {
	String DNI;
	String Nombre;
	String Apellidos;
	int Salario;
	String Estudios;
	int Antiguedad;
	
	public Administracion(String dNI, String nombre, String apellidos, int salario, String estudios, int antiguedad) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Salario = salario;
		Estudios = estudios;
		Antiguedad = antiguedad;
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
	public String getEstudios() {
		return Estudios;
	}
	public void setEstudios(String estudios) {
		Estudios = estudios;
	}
	public int getAntiguedad() {
		return Antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		Antiguedad = antiguedad;
	}
	
	
}
