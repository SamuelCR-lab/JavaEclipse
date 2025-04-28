import java.util.Scanner;

public class Ej11 {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {

			System.out.println("¿Cuanta altura tiene tu triangulo?");
			int altura = entrada.nextInt();
			System.out.println("Rectángulo relleno");
			TrianguloRellenoEq(altura);
			System.out.println("Rectángulo vacío");
			MarcoTrianguloEq(altura);
			
		}
		public static void MarcoTrianguloEq(int altura) {
			for (int i =0; i<altura;i++) {
				for(int j = 0;j<altura-i;j++) {
						System.out.print(" ");
					}
					for (int k=0; k <= i*2;k++) {
						if (i==0||i == altura-1 || k == 0 || k == i*2) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
						
					}
				System.out.println("");
				}
		}
			
		
		
		public static void TrianguloRellenoEq(int altura) {
			for (int i =0; i<altura;i++) {
				for(int j = 0;j<altura-i;j++) {
						System.out.print(" ");
					}
				for (int k=0;k<i;k++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
		}

	}

