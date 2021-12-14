package estructuraDelLenguaje;

public class IdentificadoresEjemplo {

	/*
	 * Identificadores Un identificador es: Este es el nombre de variables, clases,
	 * objetos y m�todos. Las palabras clave y las palabras espec�ficas del idioma
	 * no pueden ser identificadores.
	 */

	// Ejemplos de identificadores

	public static void main(String[] args) {
		int numero = 0;
		String cadena = "";
		double promedio = 0;
	}

	/*
	 * Los identificadores del metodo anterior son: main args numero cadena promedio
	 */

	/*
	 * Reglas: 1. Los �nicos caracteres permitidos en los identificadores de Java
	 * son a a z, A a Z, 0 a 9, $ y _
	 * 
	 * 2. Los identificadores no pueden comenzar con d�gitos, es decir, 123name no
	 * es v�lido.
	 * 
	 * 3. Los identificadores Java distinguen entre may�sculas y min�sculas, por
	 * supuesto, el lenguaje java se considera como lenguaje de programaci�n
	 * sensible a may�sculas y min�sculas. es decir, nombre, Nombre, NOMBRE, ambos
	 * son nombres de variables diferentes.
	 * 
	 * 4. No hay l�mite de longitud para los identificadores de Java, pero no se
	 * recomienda tomar identificadores de longitud.
	 * 
	 * 5. No podemos usar palabras reservadas como identificadores, de lo contrario
	 * obtendremos un error de compilaci�n. es decir, int if = 20; Aqu� obtendremos
	 * un error de compilaci�n.
	 * 
	 * 6. Todos los nombres de clase de Java predefinidos y los nombres de interfaz
	 * que podemos usar como identificadores. es decir, int String = 20; aqu� no
	 * obtendremos ning�n error de compilaci�n. Pero no es una buena pr�ctica de
	 * programaci�n. Tomado de:
	 * https://program.gobetech.com/37545/que-es-un-identificador-en-java.html
	 */

}
