package EjerciciosRecursividad_06_05_2025;

import java.util.Scanner;

public class Ejercicio5 {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		int num;
		System.out.println("Introduce un número para convertirlo en binario: ");
		num = entrada.nextInt();	
		String bin =convertidor(num); 
		System.out.print("El número "+num+" en binario es "+bin);

	}
	public static String convertidor(int a) {
		if (a==0||a==1) {
			return "" + a%2;
		}
		return convertidor(a/2)+ a%2;
	}

}
