package CentroEducativo.java;

public class Centro {

	public static void main(String[] args) {
		int personas = 2;
		Profesor[] profesor = new Profesor[personas];
		Administracion[] administrador = new Administracion[personas];
		Directivo[] directivo = new Directivo[personas];
		Modulo[] modulo = new Modulo[personas];
		Alumno[] alumno = new Alumno[personas];
		
		profesor[0] = new Profesor("Y123456","Pepe","Rodrigo Perez",1000,6,true);
		profesor[1] = new Profesor("J123456","PEPA","Rodrigo Perez",1100,4,false);
		administrador[0] = new Administracion("P123456","PACO","FRANCISCO FRAN",1300,"Universitarios",7);
		administrador[1] = new Administracion("E123456","MERY","AUXILIADORA",1150,"Doctorado",4);
		
		
	}

}
