package Coche.java;

import java.util.Scanner;

public class PruebasDeCoche {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		int contador = 3;
		boolean SiNo = true;
		do {
			PlantillaCoche[] coche = new PlantillaCoche[contador];
			coche[0] = new PlantillaCoche ("Nissan 2019","Amarillo",false,"1234ert",TipoCoche.FAMILIAR,2020,Seguro.TODORIESGO);
			System.out.println(coche[0].toString());
			coche[1] = new PlantillaCoche ("Toyota","Azul",true,"ecv1234",TipoCoche.UTILITARIO,2021,Seguro.TERCEROS);
			System.out.println(coche[1].toString());
			coche[2] = new PlantillaCoche ("Porsche","Plateado",true,"p45a12e",TipoCoche.DEPORTIVO,2023,Seguro.TODORIESGO);
			System.out.println(coche[2].toString());
			for (int i =0;i< contador;i++) {
				if (coche[i].getTipoC() == TipoCoche.DEPORTIVO || coche[i].getAnio()%2 == 0) {
					System.out.println(coche[i].toString());
				}
			}
			System.out.print("");
			System.out.println("¿Quieres agregar otro coche?: si (1), no (2)");
			if(entrada.nextInt()==1) {
				entrada.nextLine();
				contador++;
				String modelo;
				String color;
				boolean metalizado;
				String Matricula;
				int Tipos;
				int anio;
				int seguro;

				System.out.println("¿Cual es el modelo de tu coche?: ");
				modelo=entrada.nextLine();

				System.out.println("¿Que color tiene tu coche?: ");
				color=entrada.nextLine();
				
				System.out.println("La pintura del coche esta metalizada si (1) no (2): ");
				if(entrada.nextInt()==1) {
					metalizado = true;
				}else {
					metalizado = false;
				}
				entrada.nextLine();
				System.out.println("¿Cual es la matricula de tu coche?: ");
				Matricula=entrada.nextLine();
				
				System.out.println("¿Que tipo de coche es tu coche ? MINI(1), UTILITARIO(2), DEPORTIVO (3), FAMILIAR (4)");
				Tipos=entrada.nextInt();
				
				System.out.println("El año del coche: ");			
				anio=entrada.nextInt();
				
				System.out.println("¿Cual es el tipo de seguro que tienes para tu coche? Terceros (1) Todo Riesgo (2)");
				seguro=entrada.nextInt();
				if(seguro ==1) {
					if (Tipos == 1) {
						coche[contador-1] = new PlantillaCoche(""+modelo,""+color,metalizado,""+Matricula,TipoCoche.MINI,anio,Seguro.TERCEROS);
						System.out.println(coche[contador-1].toString());
					}else if(Tipos == 2) {
						coche[contador-1] = new PlantillaCoche(""+modelo,""+color,metalizado,""+Matricula,TipoCoche.UTILITARIO,anio,Seguro.TERCEROS);
						System.out.println(coche[contador-1].toString());
					}else if(Tipos == 3) {
						coche[contador-1] = new PlantillaCoche(""+modelo,""+color,metalizado,""+Matricula,TipoCoche.DEPORTIVO,anio,Seguro.TERCEROS);
						System.out.println(coche[contador-1].toString());
					}else {
						coche[contador-1] = new PlantillaCoche(""+modelo,""+color,metalizado,""+Matricula,TipoCoche.FAMILIAR,anio,Seguro.TERCEROS);
						System.out.println(coche[contador-1].toString());
					}
				}else {
					if (Tipos == 1) {
						coche[contador-1] = new PlantillaCoche(""+modelo,""+color,metalizado,""+Matricula,TipoCoche.MINI,anio,Seguro.TODORIESGO);
						System.out.println(coche[contador-1].toString());
					}else if(Tipos == 2) {
						coche[contador-1] = new PlantillaCoche(""+modelo,""+color,metalizado,""+Matricula,TipoCoche.UTILITARIO,anio,Seguro.TODORIESGO);
						System.out.println(coche[contador-1].toString());
					}else if(Tipos == 3) {
						coche[contador-1] = new PlantillaCoche(""+modelo,""+color,metalizado,""+Matricula,TipoCoche.DEPORTIVO,anio,Seguro.TODORIESGO);
						System.out.println(coche[contador-1].toString());
					}else {
						coche[contador-1] = new PlantillaCoche(""+modelo,""+color,metalizado,""+Matricula,TipoCoche.FAMILIAR,anio,Seguro.TODORIESGO);
						System.out.println(coche[contador-1].toString());
					}
				}
			}else {
				SiNo = false;
			}
		}while(!SiNo);

	}

}
