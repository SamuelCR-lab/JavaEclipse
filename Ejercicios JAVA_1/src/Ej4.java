import java.util.Scanner;
public class Ej4 {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
			int numero =0, num1=0;
			boolean comprobacion = true;
			System.out.println("Introduce numeros enteros ");	
			while(comprobacion != false){
				numero = entrada.nextInt();
				if (numero < 0){
					comprobacion=false;
				}else {
					num1+=numero;
					comprobacion=true;
					System.out.print(" + ");
				}
			}while(comprobacion != false);
			System.out.println("La suma de los numeros total es = "+num1);
		}

	}
