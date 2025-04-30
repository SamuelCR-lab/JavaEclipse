package Ejercicios_De_Clase;
import java.util.Scanner;
public class Ej2 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce un número cualquiera: ");
		int numero = entrada.nextInt();
		int[] numeros = new int[100];
		boolean confirmacion=false;
		for(int i = 0; confirmacion = true; i++) {
			if (numero > 0) {
				numeros[i]=Resto(numero);
				System.out.println(i+1+"º número es: "+numeros[i]);
				numero /= 10;
			}else {
				confirmacion = true;	
			}
		}
	}
	
	public static int Resto(int numero) {
		int guardarResto =0;
		if (numero > 0) {
			guardarResto = numero % 10;  
		}
		return guardarResto;
	}

}
