package Examen;


public class DroneAereo extends VehiculoInteligente{
	private double altitudMaxima;
	private int numeroHelices;
	private double pesoCargaMax;
	private boolean gpsIntegrado;
	private String fabricante;
	
	
	
	public DroneAereo(int id, String modelo, boolean sensoresActivos, double bateriaNivel, String fechaActivacion,
			double altitudMaxima, int numeroHelices, double pesoCargaMax, boolean gpsIntegrado, String fabricante) {
		super(id, modelo, sensoresActivos, bateriaNivel, fechaActivacion);
		this.altitudMaxima = altitudMaxima;
		this.numeroHelices = numeroHelices;
		this.pesoCargaMax = pesoCargaMax;
		this.gpsIntegrado = gpsIntegrado;
		this.fabricante = fabricante;
	}
	public double getAltitudMaxima() {
		return altitudMaxima;
	}
	public void setAltitudMaxima(double altitudMaxima) {
		this.altitudMaxima = altitudMaxima;
	}
	public int getNumeroHelices() {
		return numeroHelices;
	}
	public void setNumeroHelices(int numeroHelices) {
		this.numeroHelices = numeroHelices;
	}
	public double getPesoCargaMax() {
		return pesoCargaMax;
	}
	public void setPesoCargaMax(double pesoCargaMax) {
		this.pesoCargaMax = pesoCargaMax;
	}
	public boolean isGpsIntegrado() {
		return gpsIntegrado;
	}
	public void setGpsIntegrado(boolean gpsIntegrado) {
		this.gpsIntegrado = gpsIntegrado;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void mostarInfo() {
		System.out.println(""+toString());
	}
	public void despegar() {
		System.out.println("El drone ha despegado.");
	}
	@Override
	public String toString() {
		return "Drone Aereo de"+super.toString()+" vuela a altitud máxima = " + altitudMaxima + ", número de helices = " + numeroHelices + ", peso máximo de carga = "
				+ pesoCargaMax + ", gps integrado = " + gpsIntegrado + " y nombre del fabricante = " + fabricante+".";
	}
	

}
