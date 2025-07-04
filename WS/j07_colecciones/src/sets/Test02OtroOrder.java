package sets;

import java.util.Set;
import java.util.TreeSet;

public class Test02OtroOrder {
	public static void main(String[] args) {
		
		Set<String> set= new TreeSet<>(new StringComparatorCantLetras());
				
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