package Aparatos_Electricos;

public class AparatosConsumo {
	
	public static void main(String[] args) {
		AparatosElec Bombilla = new AparatosElec ("Bombilla",100);
		AparatosElec Radiador = new AparatosElec ("Radiador",2000);
		AparatosElec Plancha = new AparatosElec ("Plancha",1200);
		System.out.println(Bombilla.toString());
		System.out.println(Radiador.toString());
		System.out.println(Plancha.toString());
		Bombilla.encender();
		Plancha.encender();
		System.out.println("Consumo total en estos momentos con Bombilla y Plancha encendida: "+AparatosElec.getPotencia());
		Plancha.apagar();
		Radiador.encender();
		System.out.println("Consumo Total en estos momentos con Bombilla y Radiador encendida: "+AparatosElec.getPotencia());
	}
}
