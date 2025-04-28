package Ejercicios_Metodos;

import java.util.Scanner;

public class Menu_3opciones_Figuras {
	
	static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		int eleccion;
		do {
			System.out.println("¿Que figura quieres?: Triángulo Equilatero(1), Triángulo rectangulo(2), Rectángulo(3), Salir(4)");
				eleccion = controlErrores();
					switch (eleccion){
						case 1: 
							densidad(eleccion);
							break;
						case 2:
							densidad(eleccion);
							break;
						case 3:
							densidad(eleccion);
							break;
						case 4:
							System.out.println("Nos vemos en la proxima ;)");
							break;	
						default:
							System.out.println("ERROR, introduce un número correcto.");
					}
			}while(0 > eleccion || eleccion <= 3 && eleccion != 4);
	}
	public static void densidad(int figura) {
		int tipo;
		switch (figura) {
			case 1:
				System.out.println("¿Como quieres que se vea tu Triangulo Equilatero? Relleno (1), Vacio(2)");
				tipo = controlErrores();
				switch (tipo) {
					case 1:
						TrianguloEquilateroRelleno();
						break;
					case 2:
						MarcoTrianguloEquilatero();
						break;
					default:
						System.out.println("Por defecto es relleno");
						TrianguloEquilateroRelleno();
				}
				break;
			case 2:
				System.out.println("¿Como quieres que se vea tu Triangulo Rectangulo? Relleno (1), Vacio(2)");
				tipo = controlErrores();
				switch (tipo) {
					case 1:
						TrianguloRectanguloRelleno();
						break;
					case 2:
						MarcoTrianguloRectangulo();
						break;
					default:
						System.out.println("Por defecto es relleno");
						TrianguloEquilateroRelleno();
				}
				break;
			default:
				System.out.println("¿Como quieres que se vea tu Rectangulo? Relleno (1), Vacio(2)");
				tipo = controlErrores();
				switch (tipo) {
					case 1:
						RectanguloRelleno();
						break;
					case 2:
						MarcoRectangulo();
						break;
					default:
						System.out.println("Por defecto es relleno");
						TrianguloEquilateroRelleno();
				}
						
		}
		}
	public static int altura() {
		int altura;
		System.out.println("Introduce la altura de la figura que has selecionado anteriormente:");
		altura = controlErrores();
		return altura;
	}
	public static int ancho() {
		int ancho;
		System.out.println("¿Cuanto de ancho quieres que tenga tu rectangulo?");
		ancho = controlErrores();
		return ancho;
	}
	public static void TrianguloEquilateroRelleno() {
		int alturaTriEqRell = altura();
		for (int i =0; i<alturaTriEqRell;i++) {
			for(int j = 0;j<alturaTriEqRell-i;j++) {
					System.out.print(" ");
				}
			for (int k = 0; k <= i*2;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	public static void MarcoTrianguloEquilatero() {
		int alturaTriEq = altura();
		for (int i =0; i<alturaTriEq;i++) {
			for(int j = 0;j<alturaTriEq-i;j++) {
					System.out.print(" ");
				}
				for (int k=0; k <= i*2;k++) {
					if (i==0||i == alturaTriEq-1 || k == 0 || k == i*2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
			System.out.println("");
			}
	}
	
	public static void TrianguloRectanguloRelleno() {
		int alturaTriRecRell = altura();
		for (int i =0;i<=alturaTriRecRell;i++) {
			for(int j = 0;j<=i;j++) {
					System.out.print("* ");
				}
			System.out.println("  ");
		}
		
	}
	public static void MarcoTrianguloRectangulo() {
		int alturaTriRec = altura();
		for (int i =0;i<=alturaTriRec;i++) {
			for(int j = 0;j<=i;j++) {
				if (j==0||i == j || i==alturaTriRec) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
	
	public static void RectanguloRelleno() {
		int alturaRec = altura();
		int anchoRec = ancho();
		for (int i =0;i<alturaRec;i++) {
			for(int j = 0;j<anchoRec;j++) {
				if (i == 0 || i == alturaRec-1||j == 0||j==anchoRec-1) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		
	}
	public static void MarcoRectangulo() {
		int alturaRec = altura();
		int anchoRec = ancho();
			for (int i =0;i<alturaRec;i++) {
				for(int j = 0;j<anchoRec;j++) {
					System.out.print("* ");
				}
				System.out.println(" ");
			}
	}

	public static int controlErrores() {
		boolean control = true;
		int dato = 0;
		do {
		if(entrada.hasNextInt()) {
			dato = entrada.nextInt();
			control = false;
		}else {
			System.out.println("ERROR introduce un número no una letra");
		}
		entrada.nextLine();
		}while(control);
		return dato;
	}
}
