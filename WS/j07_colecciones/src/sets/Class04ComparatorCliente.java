package sets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import modelo.Cliente;

public class Class04ComparatorCliente {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(15,"Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(123,"Juan", "Perez", "López");
		Cliente c3 = new Cliente(168,"Pedro", "Vacis", "Miranda");
		Cliente c4 = new Cliente(516,"Susana", "García", "Pinto");
		Cliente c5 = new Cliente(125,"Adriana", "Jimenez", "Perez");//podría haber dos iguales (c1 y c5)
		
		
		System.out.println("Orden natural de set: ");
		Set<Cliente> set = new TreeSet<Cliente>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		set.add(c5);
		
		 
		for (Cliente cliente : set) {
			System.out.println(cliente);
		}
		System.out.println("-----");
		
		
		System.out.println("Orden por metodo getComparatorApellidos() de set2(clon set): ");
		//creamos el TreeSet de tipo Cliente y usamos el método estático de la clase
		//cliente para ordenar por apellido y finalmente por idCliente para indicar que usafremos ese orden en el objeto
		//cuando lo "rellenamos" con addAll.
		Set<Cliente> set02 = new TreeSet<Cliente>(Cliente.getComparatorApellidos());
		set02.addAll(set);
		
		for (Cliente cliente : set02) {
			System.out.println(cliente);
		}
		System.out.println();
		
		
	}
}
