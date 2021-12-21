package java_collections_and_data_structure;

import java.util.Hashtable;
import java.util.Map.Entry;

public class FuncionHashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		map.put(100,"Amit");
		map.put(102,"Ravi");
		map.put(101,"Vijay");
		map.put(103,"Rahul");
		System.out.println("Antes de eliminar: "+ map);
		//Quitar valor de la clave 102  
		map.remove(102);
		System.out.println("Después de eliminar: "+ map);
	}
}
