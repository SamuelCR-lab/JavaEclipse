package EjerciciosRecursividad_06_05_2025;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		int num =0,numElevado=0,elevado;
		System.out.println("Introduce un número que quieres elevar: ");
		num = entrada.nextInt();
		System.out.println("Introduce el número con el que quieres elevar el anterior: ");
		numElevado=entrada.nextInt();
		elevado=Elevacion(num,numElevado);
		System.out.print("El número "+num+" elevado a "+numElevado+" es "+elevado );
	}
	public static int Elevacion(int base, int exponente) {
		if(exponente==0) {
			return 1;
		}
		return base*Elevacion(base,exponente-1);
	}
}
