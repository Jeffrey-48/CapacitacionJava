package java_collections_and_data_structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListArrayListJava {

	/*
	 * List en Java proporciona la facilidad para mantener la colecci�n ordenada.
	 * Contiene los m�todos basados en �ndices para insertar, actualizar, eliminar y
	 * buscar los elementos. Tambi�n puede tener los elementos duplicados. Tambi�n
	 * podemos almacenar los elementos nulos en la lista.
	 */

	// List es una interfaz, mientras que ArrayList es la clase de implementaci�n de
	// List.

	/*
	 * Una de las diferencias m�s importantes entre List y ArrayList es que la lista
	 * es una interfaz y ArrayList es una clase de colecci�n est�ndar. La interfaz
	 * de lista ampl�a el marco de la Colecci�n, mientras que ArrayList extiende la
	 * clase AbstractList e implementa las interfaces de lista. 
	 * El espacio de nombres para la interfaz de lista es System.Collection.Generic mientras que,
	 * el espacio de nombres para ArrayList es System.Collection. 
	 * La interfaz de lista crea una colecci�n de elementos que se almacenan en una secuencia y se
	 * identifican o acceden mediante su n�mero de �ndice. Por otro lado, ArrayList
	 * crea una matriz de objetos donde la matriz puede crecer din�micamente cuando
	 * sea necesario.
	 */
	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		Integer numero1 = 1;
		Integer numero2 = 2;
		Integer numero3 = 3;
		listaNumeros.add(numero1);
		listaNumeros.add(numero2);
		listaNumeros.add(numero3);
		listaNumeros.set(2, 5);

		for (int i = 0; i < listaNumeros.size(); i++) {
			System.out.println(listaNumeros.get(i));
		}
		System.out.println("__________________________________");

		List lista = new LinkedList();
		lista.add(1);
		lista.add(1, "hola");

		for (Object object : lista) {
			System.out.println(object);
		}
		System.out.println("___________________________________");
		List<List<String>> listaPrincipal = new LinkedList();
		List<String> listaSecundaria = new LinkedList<>();
		listaSecundaria.add("Hola");
		listaSecundaria.add("mundo");
		listaPrincipal.add(listaSecundaria);
		listaPrincipal.add(listaSecundaria);

		for (int i = 0; i < listaPrincipal.size(); i++) {
			for (int j = 0; j < listaPrincipal.get(i).size(); j++) {
				System.out.println("Lista numero: " + (i + 1) + " Elemento: " + (j + 1));
			}
		}

		listaPrincipal.remove(0);
		System.out.println("Se elimino la lista 1");
		for (int i = 0; i < listaPrincipal.size(); i++) {
			for (int j = 0; j < listaPrincipal.get(i).size(); j++) {
				System.out.println("Lista numero: " + (i + 1) + " Elemento: " + (j + 1));
			}
		}
	}

}
