package excepciones;

import java.util.Iterator;

public class ManejoExcepciones {

	public static void main(String[] args) {
		// errorPorTryCatch();
		// errorPorTryCatchMultiple();
		// errorPorTryCathAnidado();
		// lanzarException();
		// conFinally();
		try {
			metodoError();
		} catch (NullPointerException e) {
			System.out.println("Se encontro un valor nulo");
		}

	}

	public static void errorPorTryCatch() {
		int a = 5;
		int b = 0;
		try {
			// En esta sección es donde deberiamos de agrupar el codigo que pueda generar
			// una excepcion
			// Como vemos estamos dividiendo un numero entre 0, lo cual nos produce un
			// ArithmeticException
			int resultado = a / b;
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			// En este apartado se crean las instrucciones que se desean hacer despues de
			// que se encuentre la excepcion
			System.out.println("Se esta dividiendo por cero en la exprecion");
		}
	}

	public static void errorPorTryCatchMultiple() {
		int a = 5;
		int b = 2;
		try {
			// Exception division entre 0
			int resultado = a / b;
			System.out.println("El resultado es: " + resultado);
			// Exception elemento nulo
			Integer cadena = null;
			System.out.println(cadena / 2);
		} catch (ArithmeticException e) {
			System.out.println("Se esta dividiendo por cero en la exprecion");
		} catch (NullPointerException e) {
			System.out.println("Uno de los elementos esta vacio");
		}
	}

	public static void errorPorTryCathAnidado() {
		try {
			String cadena = "cadena";
			System.out.println(cadena.charAt(6));
			int a = 5;
			int b = 0;
			try {
				int resultado = a / b;
				System.out.println("El resultado es: " + resultado);
			} catch (ArithmeticException e) {
				System.out.println("Se esta dividiendo por cero en la exprecion");
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Esta exediendo el valor de la cadena");
		}
	}

	public static void lanzarException() {
		try {
			System.out.println("Antes de lanzar el error");
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("Error lanzado");
		}
	}

	public static void conFinally() {
		try {
			System.out.println("Antes de lanzar el error");
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("Error lanzado");
		} finally {
			// En este apartado se dan las instrucciones para el cierre total del metodo
			// sin que queden registros de que esta corriendo dicho metodo
			System.out.println("El metodo termino");
		}
	}

	//Propagacion de la exception
	public static String metodoError() throws java.lang.NullPointerException {
		Integer valor = null;
		int division = valor / 3;
		return "En este metodo hay un elemento nulo" + valor;
	}

	/*
	 * Referencia: https://javadesdecero.es/intermedio/manejo-de-excepciones/
	 */
}
