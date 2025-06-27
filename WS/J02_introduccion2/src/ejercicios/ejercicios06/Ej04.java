package ejercicios.ejercicios06;

public class Ej04 {
	public static void main(String[] args) {
//		Suma de los dígitos de un número natural.
		int n = 123;
		String cantidadDigitos = String.valueOf(n);
		System.out.println(cantidadDigitos.charAt(Character.getNumericValue(n)));
//		System.out.println(sumaDigitos(120));
	}
	
//	public static int sumaDigitos(int num) {
//		String cantidadDigitos = String.valueOf(num);
//		if (num / 10 < 1) {
//			System.out.println(Integer.valueOf(cantidadDigitos.charAt(num)));
//			return Integer.valueOf(cantidadDigitos.charAt(num));  
//		}
//		System.out.println(Integer.valueOf(cantidadDigitos.charAt(num) + sumaDigitos(num / 10)));
//		return Integer.valueOf(cantidadDigitos.charAt(num) + sumaDigitos(num / 10));
//	}
}