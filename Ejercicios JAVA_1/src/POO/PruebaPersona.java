package POO;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona p1= new Persona(20, 1.8 , 80, true, "Grave");
		System.out.println(p1.toString());
		p1.setAltura(1.2);
		System.out.println(p1.toString());
		System.out.println("La Altura de esta persona es = "+p1.getAltura());
		

	}

}
