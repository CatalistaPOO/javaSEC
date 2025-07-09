package ejercicios.ejercicios06;

public class Ej08 {
	public static void main(String[] args) {
//		Imprimir un valor decimal en hexadecimal
		System.out.println(toHexadecimal(34));
	}

	private static String hexadecimal(int num) {
		//numero es mayor que 9:
		//caso1 divisor=A, caso2 divisor=B, caso2 divisor=C, caso3 divisor=D, caso4 divisor=E, caso5 divisor=F
		private static final char[] DIGITOS_HEX = {
			        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
				};
		}
		
		public static String toHexadecimal(int n) {
		   // Caso base: si el número es 0, su hexadecimal es "0".
	        if (n == 0) {
	            return "0";
	        }
	        // Caso base: si el número es menor que 16, es un solo dígito hexadecimal.
	        if (n < 16) {
	            return String.valueOf(DIGITOS_HEX[n]);
	        }
			 //TODO: convertir a hexadecimal el return
			return toHexadecimal(n / 16) + DIGITOS_HEX[n % 16];
	}
		
}

//public class ConversorHexadecimal {
//
//    // Este arreglo nos ayuda a mapear los valores de 10 a 15 a sus letras hexadecimales.
//    private static final char[] DIGITOS_HEX = {
//        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
//    };
//
//    public static String decimalAHexadecimal(int numero) {
//        // Caso base: si el número es 0, su hexadecimal es "0".
//        if (numero == 0) {
//            return "0";
//        }
//        // Caso base: si el número es menor que 16, es un solo dígito hexadecimal.
//        if (numero < 16) {
//            return String.valueOf(DIGITOS_HEX[numero]);
//        }
//
//        // Paso recursivo:
//        // Divide el número por 16 y recursivamente llama al método con el cociente.
//        // El residuo (numero % 16) es el siguiente dígito hexadecimal.
//        // Usamos el arreglo DIGITOS_HEX para obtener la representación correcta (0-9 o A-F).
//        return decimalAHexadecimal(numero / 16) + DIGITOS_HEX[numero % 16];
//    }