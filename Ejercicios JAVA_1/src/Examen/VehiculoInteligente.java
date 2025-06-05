package Examen;


public class VehiculoInteligente {
	private int id;
	private String modelo;
	private boolean sensoresActivos;
	private double bateriaNivel;
	private String fechaActivacion;
	
	public VehiculoInteligente(int id, String modelo, boolean sensoresActivos, double bateriaNivel,
			String fechaActivacion) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.sensoresActivos = sensoresActivos;
		this.bateriaNivel = bateriaNivel;
		this.fechaActivacion = fechaActivacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isSensoresActivos() {
		return sensoresActivos;
	}
	public void setSensoresActivos(boolean sensoresActivos) {
		this.sensoresActivos = sensoresActivos;
	}
	public double getBateriaNivel() {
		return bateriaNivel;
	}
	public void setBateriaNivel(double bateriaNivel) {
		this.bateriaNivel = bateriaNivel;
	}
	public String getFechaActivacion() {
		return fechaActivacion;
	}
	public void setFechaActivacion(String fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}
	@Override
	public String toString() {
		return " id = " + id + ", modelo = " + modelo + ", sensores Activos = " + sensoresActivos
				+ ", Nivel de bateria = " + bateriaNivel + "%, fecha en la que fue activado = " + fechaActivacion+" ";
	}
	
}
