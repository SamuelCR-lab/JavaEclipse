package Aparatos_Electricos;

public class AparatosElec {


	String nombre;
	int consumo;
	static int potencia;
	boolean estado = false;
	
	
	public AparatosElec(String nombre, int consumo) {
		super();
		this.nombre = nombre;
		this.consumo = consumo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	public static int getPotencia() {
		return potencia;
	}
	public static void setPotencia(int potencia) {
		AparatosElec.potencia = potencia;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String toString() {
		return "Entre los Aparatos Electricos nombre = " + nombre + ", su consumo = " + consumo + ", su actual estado = " + estado + ", ConsumoActual = "+potencia+".";
	}
	public void encender() {
		if(estado==false) {
			estado = true;
			potencia+=consumo;
		}
	}
	public void apagar() {
		if(estado==true) {
			estado = false;
			potencia-=consumo;
		}
	}
}
