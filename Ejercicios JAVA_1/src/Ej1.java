import java.util.Scanner;
public class Ej1{
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] arg) {
		int numeros= 0;
		System.out.println("¿Cuantos numeros quieres introducir?: ");
		numeros=entrada.nextInt();
		int[] arrNumeros= new int[numeros];
		System.out.println("Introduce los "+numeros+" números y encontrare su mayor y menor");
		for(int i=0;i<numeros;i++) {
			arrNumeros[i]=entrada.nextInt();
		}
		mayor_menor(arrNumeros,numeros);
	}
	public static void mayor_menor(int[] numero,int cantidad) {
		int mayor=numero[0],menor=numero[0],contadorMayor=0,contadorMenor=0;
		for (int i=1;i<cantidad;i++) {
			if(mayor < numero[i]) {
				mayor=numero[i];
				contadorMayor=0;
			}else{
				if(menor > numero[i]) {
					menor=numero[i];
					contadorMenor=0;
				}
			}
			if (contadorMenor==numero[i]) {
				contadorMenor++;
			}
			if (contadorMayor==numero[i]) {
				contadorMayor++;
			}
		}
		
		System.out.println("El numero mayor de tu array de numeros es el "+mayor+" repitiendose "+contadorMayor+" y el menor es "+menor+" repitiendose "+contadorMenor);
	}
}
