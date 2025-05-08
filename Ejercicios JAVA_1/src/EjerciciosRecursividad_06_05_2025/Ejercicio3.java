package EjerciciosRecursividad_06_05_2025;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		int num=0,longitud;
		System.out.println("Introduce un numero positivo y lo invertiré: ");
		num = entrada.nextInt();
		longitud = contador(num);
		System.out.print("El número de "+num+" es ");
		Invertir(num, longitud);

	}
	public static void Invertir(int num, int contador) {
		int modular = 0;
		modular=num%10;
		if(contador ==1) {
			System.out.print(modular+".");
		}else {
			System.out.print(modular);
			Invertir(num/10,contador-1);
			
		}
		
	}
	public static int contador (int num) {
		if (num < 10) {
			return 1;
		}
		return 1+contador(num/10);
}
}
