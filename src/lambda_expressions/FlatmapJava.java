package lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapJava {
	/*
	 * se utiliza para convertir un flujo de flujo en una lista de valores.
	 * 
	 * [{t,u}, {v,w,x}, {y,z}] Stream.flatMap() {t,u,v,w,x,y,z}
	 * 
	 * En resumen, podemos decir que el método flatMap() ayuda a convertir
	 * Stream<Stream<T>> a Stream<T>.
	 * 
	 * mapeador: Es un parámetro que es una función sin interferencias y sin estado
	 * para aplicar a cada elemento. Produce un flujo de nuevos valores.
	 * 
	 * El acoplamiento es el proceso de convertir varias listas de listas y fusionar
	 * todas esas listas para crear una sola lista que contenga todos los elementos
	 * de todas las listas.
	 */
	public static void main(String args[]) {
		System.out.println("Stream Después de aplicar la función map(): ");
		// crea una lista de enteros
		List<Integer> list = Arrays.asList(12, 45, 67, 19, 87, 2, 9);
		// al crear una nueva secuencia de los elementos, se imprime la misma mediante
		// el bucle foreach
		list.stream().map(number -> number * 2).forEach(System.out::println);

		// FlatMap

		// crear ArrayList
		List<String> productlist1 = Arrays.asList("Impresora", "Mouse", "Teclado", "Motherboard");
		List<String> productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
		List<List<String>> allproducts = new ArrayList<List<String>>();

		// agregar elementos a la lista
		allproducts.add(productlist1);
		allproducts.add(productlist2);
		allproducts.add(productlist3);
		allproducts.add(productlist4);

		System.out.println("Lista antes de aplicar asignación y acoplamiento: \n");
		// imprime la secuencia antes de aplicar el método flatMap()
		System.out.println(allproducts);
		System.out.println();
		// crea una secuencia de elemnts usando flatMap()
		List<String> flatMapList = allproducts.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
		System.out.println("Lista después de aplicar la operación de asignación y acoplamiento: \n");
		// imprime la nueva secuencia que obtenemos después de aplicar la asignación y
		// el acoplamiento
		System.out.println(flatMapList);
	}
	/*
	 * Dado una cadena de palabras "Jeffrey esta de 100 caracteres" dada dicha lista
	 * retorne el listado de todas las letras y cuantas veces se repiten
	 */
}
