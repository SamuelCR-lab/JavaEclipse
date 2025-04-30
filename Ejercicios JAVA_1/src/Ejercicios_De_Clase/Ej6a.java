package Ejercicios_De_Clase;
import java.util.Scanner;

public class Ej6a {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce 5 palabras ");
		String palabra;
		String palabraMayor="";
		int lonMayor=0;
		for (int i = 0; i<5;i++) {
			System.out.println("Introduce la "+(i+1)+"ª palabra ");
			palabra=entrada.nextLine();
			if(palabra.length()>lonMayor) {
				palabraMayor=palabra;
				lonMayor=palabra.length();
			}
		
		}
		System.out.println("La palabra de mayor longitud es = "+palabraMayor);
		System.out.println("Tiene de longitud "+lonMayor);
		entrada.close();
	}
	
}
