package java_collections_and_data_structure;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {
	//principal caracteristica no posee elementos repetidos y no se preocupa por el orden
	/*
	 * tiene tres implementaciones
	 * HashSet
	 * TreeSet
	 * LinkedHashSet
	 */
	public static void main(String[] args) {
		//HashSet
		Set<String> lista = new HashSet<>();
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		lista.add("tres");
		lista.add("tres");
		lista.add("cuatro");
		for (String string : lista) {
			System.out.println(string);
		}
		//Toma en cuenta las instancias
		//Se puede comparar por metodo hashCode y equals
		Set<Estudiante> listaE = new HashSet<>();
		listaE.add(new Estudiante(1, "asf", 18, new Date()));
		listaE.add(new Estudiante(2, "fgh", 20, new Date()));
		listaE.add(new Estudiante(1, "jkl", 22, new Date()));
		//Id repetido especificado en hashCode y equals
		for (Estudiante estudiante : listaE) {
			System.out.println(estudiante);
		}
		System.out.println("________TreeSet_________");
		//TreeSet
		/*
		 * Elementos unicos y ordenados por el compareTo
		 */
		Set<Estudiante> listaT = new TreeSet<>();
		listaT.add(new Estudiante(1, "asf", 18, new Date()));
		listaT.add(new Estudiante(2, "fgh", 20, new Date()));
		listaT.add(new Estudiante(1, "jkl", 22, new Date()));
		listaT.add(new Estudiante(3, "zxc", 23, new Date()));
		for (Estudiante estudiante : listaT) {
			System.out.println(estudiante);
		}
		System.out.println("________LinkedHashSet_________");
		//LinkedHashSet
		/*
		* Elementos unicos y ordenados por la adicion a la lista
		 */
		Set<Estudiante> listaL = new LinkedHashSet<>();
		listaL.add(new Estudiante(1, "asf", 18, new Date()));
		listaL.add(new Estudiante(2, "fgh", 20, new Date()));
		listaL.add(new Estudiante(1, "jkl", 22, new Date()));
		listaL.add(new Estudiante(3, "zxc", 23, new Date()));
		for (Estudiante estudiante : listaL) {
			System.out.println(estudiante);
		}
	}
}
