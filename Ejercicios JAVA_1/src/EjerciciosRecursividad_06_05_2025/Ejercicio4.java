package EjerciciosRecursividad_06_05_2025;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		int num=0,bin,vueltas;
		System.out.println("Introduce un número y comprobare si esta en binario: ");
		num = entrada.nextInt();
		vueltas = contador(num);
		bin = comprobacion(num, vueltas);
		if(bin == 1) {
			System.out.println("El número "+num+" es binario.");
		}else{
			System.out.println("El número "+num+" no es binario");
		}
	}
	public static int comprobacion (int num, int vueltas) {
		if (num%10 == 0 || num%10 == 1 && vueltas != 1) {
			return comprobacion(num/10,vueltas-1);
		}else if(vueltas == 1) {
			return 1;
		}
		return 0;
		
		
	}
	public static int contador (int num) {
		if (num < 10) {
			return 1;
		}
		return 1+contador(num/10);
	}
}
