package Coche.java;
enum TipoCoche{ MINI, DEPORTIVO, UTILITARIO, FAMILIAR }
enum Seguro{ TERCEROS, TODORIESGO }
public class PlantillaCoche {
	String modelo;
	String color;
	boolean Metalizada;
	String Matricula;
	TipoCoche tipoC;
	int anio;
	Seguro tipoS;

	public PlantillaCoche(String modelo,String color, boolean metalizada, String matricula, TipoCoche tipoC, int anio, Seguro tipoS) {
		super();
		this.color = color;
		Metalizada = metalizada;
		Matricula = matricula;
		this.tipoC = tipoC;
		this.anio = anio;
		this.tipoS = tipoS;
		this.modelo = modelo;
	}

	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isMetalizada() {
		return Metalizada;
	}
	public void setMetalizada(boolean metalizada) {
		Metalizada = metalizada;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public TipoCoche getTipoC() {
		return tipoC;
	}
	public void setTipoC(TipoCoche tipoC) {
		this.tipoC = tipoC;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Seguro getTipoS() {
		return tipoS;
	}
	public void setTipoS(Seguro tipoS) {
		this.tipoS = tipoS;
	}

	public String toString() {
		return "El coche introducido tiene color=" + color + ", Metalizada=" + Metalizada + ", Matricula=" + Matricula + ", tipoC="
				+ tipoC + ", anio=" + anio + ", tipoS=" + tipoS + ", modelo=" + modelo + ".";
	}
	

}
