package tests;

public class Test01 {
	public static void main(String[] args) {
		for(Contacto c : Contactos.generaContactos()) {
			System.out.println(c);
		}
	}
	
}