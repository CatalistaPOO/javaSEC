package sets;

import java.util.Comparator;

public class StringComparatorCantLetras implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// Comparamos objetos, devuelve: positivo, negativo o 0 (mirar interface Comparator)
		return o1.length() - o2.length();
	}

	
	
}
