package java_collections_and_data_structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola {

	private NodoCola inicioCola, finalCola;
	String cola = "";

	public Cola() {
		inicioCola = null;
		finalCola = null;
	}

	public static void main(String[] args) {
		int opcion = 0;
		int nodo_info = 0;
		Cola cola = new Cola();
		do {
			try {
				Scanner entrada = new Scanner(System.in);
				System.out.println("Menu");
				System.out.println("1. insertar");
				System.out.println("2. extraer");
				System.out.println("3. mostrar contenido");
				System.out.println("4. salir");
				opcion = entrada.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Inserte el valor del nodo");
					int info = entrada.nextInt();
					cola.insertar(info);
					break;
				case 2:
					if (!cola.colaVacia()) {
						System.out.println("Se extrajo un nodo con el valor: " + cola.extraer());
					}else {
						System.out.println("La cola esta vacia");
					}
					break;
				case 3:
					cola.mostrarContenido();
					break;
				case 4:
					opcion = 4;
					break;

				default:
					System.out.println("Opcion no disponible");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Error en el tipo de informacion");
			}
		} while (opcion != 4);
		
		/*Creamos la Cola Indicando el tipo de dato*/
        Queue<Integer> cola2=new LinkedList();
        /*Insertamos datos*/
            cola2.offer(3);
            cola2.add(14);
            cola2.offer(12);
            cola2.add(7);
            cola2.offer(10);
        /*Impresion de la Cola llena con los datos*/
        System.out.println("Cola llena: " + cola2);
        /*Estructura repetitiva para desencolar*/
        while(cola2.poll()!=null){//Desencolamos y el valor se compara con null
            System.out.println(cola2.peek());//Muestra el nuevo Frente
        }
        /*Muestra null debido a que la cola ya esta vacia*/
        System.out.println(cola2.peek());
	}

	public boolean colaVacia() {
		if (inicioCola == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insertar(int informacion) {
		NodoCola nodo = new NodoCola(informacion, null);
		if (colaVacia() == true) {
			inicioCola = nodo;
			finalCola = nodo;
		} else {
			finalCola.setNodoSiguiente(nodo);
			finalCola = nodo;
		}
	}

	public int extraer() {
		if (!colaVacia()) {
			int informacion = inicioCola.getInformacion();
			if (inicioCola == finalCola) {
				inicioCola = null;
				finalCola = null;
			} else {
				inicioCola = inicioCola.getNodoSiguiente();
			}
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	public void mostrarContenido() {
		NodoCola recorrido = inicioCola;
		String colaInvertida = "";
		while (recorrido != null) {
			cola += recorrido.getInformacion() + " ";
			recorrido = recorrido.getNodoSiguiente();
		}
		String cadena[] = cola.split(" ");
		for (int i = cadena.length - 1; i >= 0; i--) {
			colaInvertida += " " + cadena[i];
		}
		System.out.println(colaInvertida);
		cola = "";
	}
}
