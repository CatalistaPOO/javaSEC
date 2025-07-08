package interfaces;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test02OtroOrder {
	public static void main(String[] args) {
		//creamos TreeSet estableciendo su orden por Comparator(definido por longitud de mayor a menor)
		Set<String> set= new TreeSet<String>(new Comparator<String>() {
			//Definimos compare que es el metodo abstracto
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});
		//Llenamos TreeSet, que respetará el orden indicado al crearlo, NO el natural.		
		set.add("uno");
		set.add("dos");
		set.add("tres");
		set.add("cuatro");
		set.add("cinco");
		set.add("AS");
		set.add("ZAPATO");
		set.add("Ávila");
		set.add("ágil");
		
		for  (String s : set) {
			System.out.println(s);
		}
		
	}
}