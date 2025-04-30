package Ejercicios_De_Clase;
import java.util.Scanner;

public class Ej8 {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
	
			System.out.println("Introduce una palabra para saber si es un palindromo: ");
			String texto=entrada.nextLine();
			
			if (palindromo(texto) == 1) {
				System.out.println("La palabra "+texto+" es un palindromo");
			}else {
				System.out.println("La palabra "+texto+" no es un palindromo");
			}
			entrada.close();
			
	}
	public static int palindromo(String texto) {
		boolean comprobacion = true;
		int longitud = texto.length();
		for (int i = 0; i< longitud/2 || comprobacion == false; i++) {
			if (texto.charAt(i) != texto.charAt(longitud-i-1)) {
				comprobacion = false;
			}
		}
		if (comprobacion == true) {
			return 1;
		}else {
			return 0;
		}
	}

}
