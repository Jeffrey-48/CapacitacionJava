package java_collections_and_data_structure;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsJava {
	
	public static void main(String[] args) {
		//Map es una interface
		//key, value
		//No permite repetidos por clave
		Map<String, Estudiante> lista = new HashMap<String, Estudiante>();
		Estudiante es1 = new Estudiante(1, "Vargas", 22, new Date());
		Estudiante es2 = new Estudiante(2, "Martines", 20, new Date());
		Estudiante es3 = new Estudiante(3, "Gonzalez", 21, new Date());
		lista.put("primero", es1);
		lista.put("segundo", es2);
		lista.put("tercero", es3);
		Set<String> keys = lista.keySet();//Devuelve un set con las claves
		System.out.println(keys);
		Collection<Estudiante> est = lista.values();//Devuelve una collection con los valores
		System.out.println(est);
		lista.get("segundo");//Retorna el valor dada la clave
		lista.getOrDefault("primero", es1);//Devuelve el objeto con la clave, de lo contrario retorna el default
		lista.replace("primero", es2);//Remplaza el valor de la clave
		lista.remove("segundo");//Borra por clave
		lista.remove("primero", es1);
		for (Entry<String, Estudiante> e : lista.entrySet()) {
			System.out.println(e);
		}
	}
}
