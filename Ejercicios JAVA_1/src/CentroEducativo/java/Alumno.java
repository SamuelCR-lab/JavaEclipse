package CentroEducativo.java;
enum sexo { MASCULINO, FEMENINO }
public class Alumno {
	String DNI;
	String Nombre;
	String Apellidos;
	String fechaNacimiento;
	sexo genero;
	boolean Repetidor;
	
	public Alumno(String dNI, String nombre, String apellidos, String fechaNacimiento, sexo genero, boolean repetidor) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		Repetidor = repetidor;
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
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public sexo getGenero() {
		return genero;
	}
	public void setGenero(sexo genero) {
		this.genero = genero;
	}
	public boolean isRepetidor() {
		return Repetidor;
	}
	public void setRepetidor(boolean repetidor) {
		Repetidor = repetidor;
	}
	
}
