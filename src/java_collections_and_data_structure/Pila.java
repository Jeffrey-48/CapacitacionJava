package java_collections_and_data_structure;

import java.util.Scanner;

public class Pila {
	private NodoCola UltimoValorIngresado;
	int tamano = 0;
	String lista = "";

	public Pila() {
		UltimoValorIngresado = null;
		tamano = 0;
	}

	public static void main(String[] args) {
		int opcion = 0, nodo = 0;
		Pila pila = new Pila();

		do {
			try {
				Scanner entrada = new Scanner(System.in);
				System.out.println("Menú de Opciones\n\n" + "1. Insertar un nodo\n" + "2. Eliminar un nodo\n"
						+ "3. ¿La Pila esta vacia?\n" + "4. ¿Cual es el último valor ingresado en la Pila?\n"
						+ "5. ¿Cuantos nodos tiene la pila?\n" + "6. Vaciar Pila\n"
						+ "7. Mostrar contenido de la Pila\n" + "8. Salir.\n\n");
				opcion = entrada.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Porfavor ingresa el valor a guardar en el nodo");
					nodo = entrada.nextInt();
					pila.insertarNodo(nodo);
					break;

				case 2:
					if (!pila.PilaVacia()) {
						System.out.println("Se ha eliminado un nodo con el valor: " + pila.eliminarNodo());
					} else {
						System.out.println("La pila esta vacia.");
					}
					break;

				case 3:
					if (pila.PilaVacia()) {
						System.out.println("La pila esta vacia.");
					} else {
						System.out.println("La pila no esta vacia.");
					}
					break;

				case 4:
					if (!pila.PilaVacia()) {
						System.out.println("El último valor ingresado en la pila es: " + pila.MostrarUltimoValorIngresado());
					} else {
						System.out.println("La pila esta vacia");
					}
					break;

				case 5:
					System.out.println("La pila contiene " + pila.TamanoPila() + " nodos.");
					break;

				case 6:
					if (!pila.PilaVacia()) {
						pila.VaciarPila();
						System.out.println("Se ha vaciado la pila correctamente");
					} else {
						System.out.println("La pila esta vacia");
					}
					break;

				case 7:
					pila.MostrarValores();
					break;

				case 8:
					opcion = 8;
					break;

				default:
					System.out.println("Opción incorrecta, vuelve intentar nuevamente.");
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("Error en los datos ingresados");
			}
		} while (opcion != 8);
	}

	public boolean PilaVacia() {
		return UltimoValorIngresado == null;
	}

	public void insertarNodo(int nodo) {
		NodoCola nuevo_nocdo = new NodoCola(nodo, null);
		nuevo_nocdo.setNodoSiguiente(UltimoValorIngresado);
		UltimoValorIngresado = nuevo_nocdo;
		tamano++;
	}

	public int eliminarNodo() {
		int auxiliar = UltimoValorIngresado.getInformacion();
		UltimoValorIngresado = UltimoValorIngresado.getNodoSiguiente();
		tamano--;
		return auxiliar;
	}

	public int MostrarUltimoValorIngresado() {
		return UltimoValorIngresado.getInformacion();
	}

	public int TamanoPila() {
		return tamano;
	}

	public void VaciarPila() {
		while (!PilaVacia()) {
			eliminarNodo();
		}
	}

	public void MostrarValores() {
		NodoCola recorrido = UltimoValorIngresado;

		while (recorrido != null) {
			lista += recorrido.getInformacion() + "\n";
			recorrido = recorrido.getNodoSiguiente();
		}
		System.out.println(lista);
		lista = "";
	}
}
