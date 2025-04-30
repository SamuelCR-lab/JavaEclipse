package Ejercicios_De_Clase;
import java.util.Scanner;

public class Ej6 {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("Introduce 5 palabras ");
			String palabra[] = new String[5];
			for (int i = 0; i<5;i++) {
				palabra[i] = entrada.nextLine();
			}
			
			if (palabra[0].length()> palabra[1].length() && palabra[0].length() > palabra[2].length() && palabra[0].length() > palabra[3].length() && palabra[0].length() > palabra[4].length()) {
				System.out.println("La Primera palabra es la que tiene mayor longitud y es = "+palabra[0]);
			}else if (palabra[1].length()> palabra[0].length() && palabra[1].length() > palabra[2].length() && palabra[1].length() > palabra[3].length() && palabra[1].length() > palabra[4].length()) {
				System.out.println(palabra[1]);
			} else if (palabra[2].length()> palabra[0].length() && palabra[2].length() > palabra[1].length() && palabra[2].length() > palabra[3].length() && palabra[2].length() > palabra[4].length()) {
				System.out.println("La Segunda palabra es la que tiene mayor longitud y es = "+palabra[0]);
			}else if (palabra[3].length()> palabra[0].length() && palabra[3].length() > palabra[1].length() && palabra[3].length() > palabra[2].length() && palabra[3].length() > palabra[4].length()) {
				System.out.println("La Tercera palabra es la que tiene mayor longitud y es = "+palabra[3]);
			}else if (palabra[4].length()> palabra[0].length() && palabra[4].length() > palabra[1].length() && palabra[4].length() > palabra[2].length() && palabra[4].length() > palabra[3].length()) {
				System.out.println("La Cuarta palabra es la que tiene mayor longitud y es = "+palabra[4]);
			}else {
				System.out.println("Todas las palabras tienen la misma longitud");
			}
			entrada.close();
		}


	}
