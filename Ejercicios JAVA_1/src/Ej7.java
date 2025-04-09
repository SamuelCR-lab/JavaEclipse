import java.util.Scanner;

public class Ej7 {
	
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce una cadena de texto ");
		String texto=entrada.nextLine();
		int contador = contadorPalabra(texto.trim());
		System.out.println("El texto tiene "+contador+" palabras");
		
	}
	
	public static int contadorPalabra(String texto) {
		int contadorEspacios=1;
		if (texto.length()==0) return 0;
		for (int i = 0; i < texto.length();i++) {
			if(texto.charAt(i)==' ' && texto.charAt(i+1)!= ' ') {
				contadorEspacios++;
			}
		}
		return contadorEspacios;
	}
	
}
