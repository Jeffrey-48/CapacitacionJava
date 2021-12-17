package java_collections_and_data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorted {
	
	public static void main(String[] args) {
		List<Integer> listaE = new ArrayList<>();
		listaE.add(80);
		listaE.add(300);
		listaE.add(5);
		//Ordena la lista decendente
		Collections.sort(listaE);
		System.out.println(listaE);
		//Ordena la lista acendente
		Collections.reverse(listaE);
		System.out.println(listaE);
		
		//Compare
		List<Persona> listaP = new ArrayList<>();
		listaP.add(new Persona(1, "carlos", 25));
		listaP.add(new Persona(2, "juan", 20));
		listaP.add(new Persona(3, "andres", 35));
		Collections.sort(listaP, new NombreComparator());
		System.out.println("Orden nombre");
		for (Persona persona : listaP) {
			System.out.println(persona.getNombre());
		}
		Collections.sort(listaP, new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				int respuesta = 0;
				if(p1.getEdad() > p2.getEdad()) {
					respuesta = 1;
				}else if (p1.getEdad() < p2.getEdad()) {
					respuesta = -1;
				}else {
					respuesta = 0;
				}
				return respuesta;
			}
			
		});
		System.out.println("Orden edad");
		for (Persona persona : listaP) {
			System.out.println(persona.getEdad());
		}
	}
}
