package CentroEducativo.java;
enum turno{ MAÑANA, TARDE }
public class Directivo {
	String DNI;
	String Nombre;
	String Apellidos;
	int Salario;
	boolean Salesiano;
	turno turnoMT;
	
	public Directivo(String dNI, String nombre, String apellidos, int salario, boolean salesiano, turno turnoMT) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Salario = salario;
		Salesiano = salesiano;
		this.turnoMT = turnoMT;
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
	public boolean isSalesiano() {
		return Salesiano;
	}
	public void setSalesiano(boolean salesiano) {
		Salesiano = salesiano;
	}
	public turno getTurnoMT() {
		return turnoMT;
	}
	public void setTurnoMT(turno turnoMT) {
		this.turnoMT = turnoMT;
	}
	
	
}
