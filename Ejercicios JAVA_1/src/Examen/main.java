package Examen;

import java.util.Scanner;

public class main {
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Bienvenido a mi programa sobre Vehiculos Inteligentes.");
		menu();

	}
	public static void menu() {
		int vehiculosBase =2;
		CocheAutonomo[] cocheA = new CocheAutonomo[vehiculosBase];
		DroneAereo[] droneA = new DroneAereo[vehiculosBase];
		RobotRepartidor[] robotR = new RobotRepartidor[1];
		creacionCocheA(cocheA);
		creacionDroneA(droneA);
		int contadorIniciacion = 4;
		boolean marcador = true;
		do {
			int opcion=0;
			System.out.println("1. Crea un nuevo Vehiculo.");
			System.out.println("2. Mostrar toda la informacion de los Vehiculos inteligentes guardados.");
			System.out.println("3. Contardor de los Vehiculos que tienen los sensores Activados");
			System.out.println("4. Salir del menú.");
			opcion = entrada.nextInt();
			entrada.nextLine();
			switch(opcion) {
				case 1:
					if (contadorIniciacion == 4) {
						creacionRobotRepartidor(robotR);
						entrada.nextLine();
						contadorIniciacion++;
					}else {
						System.out.println("Ya has creado el nuevo vehiculo inteligente nada más se permite iniciar 1");
					}
					break;
				case 2:
					mostrarInformacion(cocheA,droneA,robotR,contadorIniciacion);
					break;
				case 3:
					int sensoresActivos = contadorSensores(cocheA,droneA,robotR,contadorIniciacion);
					System.out.println("Hay "+sensoresActivos+" vehiculos inteligentes con los sensores activos");
					break;
				case 4:
					marcador = false;
					System.out.println("Has salido del programa, espero lo hayas disfrutado.");
					break;
				default:
				System.out.println("Introduce un número o uno que este entre las opciones dadas.");		
			}
		}while(marcador);
	}
	
	public static void creacionCocheA(CocheAutonomo[] a) {
		a[0]= new CocheAutonomo(01,"modelT",true,100,"05/06/2025",200000,250,"ytr1234",5,"Tesla");
		a[1]= new CocheAutonomo(02,"Cupra 4",true,50,"06/05/2024",200000,250,"ytr1234",5,"Tesla");
	}
	public static void creacionDroneA(DroneAereo[] b) {
		b[0]= new DroneAereo(03,"eretyy",true,80,"19/12/2024",150,8,30,true,"Indra");
		b[1]= new DroneAereo(04,"pasoire-xtr",false,100,"07/01/2023",100,15,40,true,"ChatGPT");
	}
	public static void creacionRobotRepartidor(RobotRepartidor[] c) {
		System.out.println("Vamos a crear un Robot repartidor.");
		System.out.println("Intoduce el id que quiere que tenga el robot: ");
		int id = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Intoduce el modelo del robot: ");
		String modelo = entrada.nextLine();
		System.out.println("¿El robot tiene los sensores activados? si(1) o no(2): ");
		int sentemp = entrada.nextInt();
		boolean sensores = TrueOrFalse(sentemp);
		entrada.nextLine();
		System.out.println("Intoduce el nivel de bateria del robot, ejemplo (80% = 80): ");
		double bateria = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Intoduce la fecha de activación del robot: ");
		String fechaActivacion = entrada.nextLine();
		System.out.println("Intoduce el tipo de carga del robot: ");
		String carga = entrada.nextLine();
		System.out.println("Intoduce la capacidad de litros del tanque de combustible del robot: ");
		double capacidad = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Intoduce la zona donde opera el robot: ");
		String zona = entrada.nextLine();
		System.out.println("¿El robot es resistente al agua? si(1) o no(2): ");
		int aguatemp = entrada.nextInt();
		boolean agua = TrueOrFalse(aguatemp);
		entrada.nextLine();
		System.out.println("Intoduce el número de ruedas del robot: ");
		int ruedas = entrada.nextInt();
		c[0] = new RobotRepartidor(id,modelo,sensores,bateria,fechaActivacion,carga,capacidad,zona,agua,ruedas);
		System.out.print("Has creado este robot -->");
		System.out.println(" "+c[0].toString());
	}
	public static boolean TrueOrFalse(int a) {
		if(a == 1) {
			return true;
		}else {
			return false;
		}
	}
	public static void mostrarInformacion(CocheAutonomo[] coche,DroneAereo[] drone,RobotRepartidor[] robot,int a) {
		for(int i =0;i<a;i++) {
			if(i < 2) {
				coche[i].mostarInfo();
			}else if(i >1 && i<4) {
				if(i==2) {
					drone[i-2].mostarInfo();
				}else {
					drone[i-2].mostarInfo();
				}
			}else {
				robot[0].mostarInfo();
			}
		}
	}
	public static int contadorSensores(VehiculoInteligente[] coche,VehiculoInteligente[] drone,VehiculoInteligente[] robot,int bucle) {
		int contador=0;
		for(int i =0;i<bucle;i++) {
			if(i < 2) {
				if(coche[i].isSensoresActivos() == true)
					contador++;
			}else if(i >1 && i<4) {
				if(i==2) {
					if(drone[i-2].isSensoresActivos() == true)
					contador++;
				}else {
					if(drone[i-2].isSensoresActivos() == true)
					contador++;
				}
			}else {
				if(robot[0].isSensoresActivos() == true)
				contador++;
			}
		}
		
		return contador;
	}
}
