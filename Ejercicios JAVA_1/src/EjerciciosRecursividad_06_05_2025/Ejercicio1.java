package EjerciciosRecursividad_06_05_2025;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		int num =0,num1=0;
		System.out.println("Introduce un número, para separarlo por partes: ");
		num = entrada.nextInt();
		num1=contador(num);
		System.out.print("El número "+num+" separado es ");
		recursiva(num,0);
		System.out.print("El número "+num+" tiene "+num1+" digitos");
	}

	public static void recursiva (int num, int contador) {
		int base;
		base = num % 10;
			if (num < 10) {
				System.out.print(base+", ");
			}else {
				contador++;
				recursiva(num/10, contador);
				if (contador == 1) {
					System.out.println(base+". ");
				}else {
					System.out.print(base+", ");
				}
			}
	}
	public static int contador(int num) {
			if (num < 10) {
				return 1;
			}
			return 1+contador(num/10);
	}
}
