package Examen;


public class RobotRepartidor extends VehiculoInteligente{
	private String tipoCarga;
	private double capacidadLitros;
	private String zonaOperacion;
	private boolean resistenteAgua;
	private int numeroRuedas;
	
	
	
	public RobotRepartidor(int id, String modelo, boolean sensoresActivos, double bateriaNivel,
			String fechaActivacion, String tipoCarga, double capacidadLitros, String zonaOperacion,
			boolean resistenteAgua, int numeroRuedas) {
		super(id, modelo, sensoresActivos, bateriaNivel, fechaActivacion);
		this.tipoCarga = tipoCarga;
		this.capacidadLitros = capacidadLitros;
		this.zonaOperacion = zonaOperacion;
		this.resistenteAgua = resistenteAgua;
		this.numeroRuedas = numeroRuedas;
	}
	public String getTipoCarga() {
		return tipoCarga;
	}
	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	public double getCapacidadLitros() {
		return capacidadLitros;
	}
	public void setCapacidadLitros(double capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}
	public String getZonaOperacion() {
		return zonaOperacion;
	}
	public void setZonaOperacion(String zonaOperacion) {
		this.zonaOperacion = zonaOperacion;
	}
	public boolean isResistenteAgua() {
		return resistenteAgua;
	}
	public void setResistenteAgua(boolean resistenteAgua) {
		this.resistenteAgua = resistenteAgua;
	}
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	public void mostarInfo() {
		System.out.println(""+toString());
	}
	public void iniciarReparto() {
		System.out.println("El reparto ha sido iniciado, su pedido llegara pronto.");
	}
	@Override
	public String toString() {
		return "Robot Repartidor de"+super.toString()+"tipo de Carga = " + tipoCarga + ", capacidad en Litros = " + capacidadLitros + ", zona donde opera = "
				+ zonaOperacion + ", resistentencia al Agua = " + resistenteAgua + ", numero de Ruedas = " + numeroRuedas + ".";
	}
	
}
