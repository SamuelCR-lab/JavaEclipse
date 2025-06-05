package CentroEducativo.java;

public class Aprendiz extends Profesor{
	int horasPracticas;



	public Aprendiz(String dNI, String nombre, String apellidos, int salario, int nºasignaturas, boolean tutor,
			int horasPracticas) {
		super(dNI, nombre, apellidos, salario, nºasignaturas, tutor);
		this.horasPracticas = horasPracticas;
	}

	@Override
	public String toString() {
		return "Aprendiz [horasPracticas=" + horasPracticas + ", DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos="
				+ Apellidos + ", Salario=" + Salario + ", Nºasignaturas=" + Nºasignaturas + ", getHorasPracticas()="
				+ getHorasPracticas() + ", getDNI()=" + getDNI() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getSalario()=" + getSalario() + ", getNºasignaturas()=" + getNºasignaturas()
				+ ", isTutor()=" + isTutor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int getHorasPracticas() {
		return horasPracticas;
	}

	public void setHorasPracticas(int horasPracticas) {
		this.horasPracticas = horasPracticas;
	}
}
