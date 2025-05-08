package Ejercicios_De_Clase;
import java.util.Scanner;
public class Ej10 {

	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("¿Cuanta altura tiene tu triangulo?");
		int altura = entrada.nextInt();
		System.out.println("Rectángulo relleno");
		TrianguloRelleno(altura);
		System.out.println("Rectángulo vacío");
		MarcoTriangulo(altura);
		
	}
	public static void MarcoTriangulo(int altura) {
		for (int i =0;i<=altura;i++) {
			for(int j = 0;j<=i;j++) {
			if (j==0||i == j || i==altura) {
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			
			
			}
			System.out.println(" ");
		}
	}
	
	public static void TrianguloRelleno(int altura) {
		for (int i =0;i<=altura;i++) {
			for(int j = 0;j<=i;j++) {
					System.out.print("* ");
				}
			System.out.println("  ");
		}
	}
}