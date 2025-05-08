package POO;

public class Persona {
	int edad;
	public Persona(int edad, double altura, int peso, boolean pelo, String voz) {
		super();
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.pelo = pelo;
		this.voz = voz;
	}
	double altura;
	int peso;
	boolean pelo;
	String voz;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}  
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isPelo() {
		return pelo;
	}
	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	public String getVoz() {
		return voz;
	}
	public void setVoz(String voz) {
		this.voz = voz;
	}
	

}
