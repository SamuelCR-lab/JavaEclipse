import java.util.Scanner;

public class Ej9 {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("¿Cuanto de altura quieres que sea el rectángulo?");
		int altura = entrada.nextInt();
		System.out.println("¿Cuanto de ancho quieres que sea el rectángulo?");
		int ancho = entrada.nextInt();
		System.out.println("Rectángulo relleno");
		dibujarRectangulo(ancho,altura);
		System.out.println("Rectángulo vacío");
		MarcoRectangulo(ancho,altura);
		
	}
	public static void MarcoRectangulo(int ancho, int altura) {
		for (int i =0;i<altura;i++) {
			for(int j = 0;j<ancho;j++) {
				if (i == 0 || i == altura-1||j == 0||j==ancho-1) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
		
	
	
	
	public static void dibujarRectangulo(int ancho,int altura) {
		for (int i =0;i<altura;i++) {
			for(int j = 0;j<ancho;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
	}
}
