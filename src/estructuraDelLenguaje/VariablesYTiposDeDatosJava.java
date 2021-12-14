package estructuraDelLenguaje;

public class VariablesYTiposDeDatosJava {
	/*
	 * Se puede pensar en una variable como un contenedor de valor para usted
	 * durante la vida útil de un programa Java. A cada variable se le asigna un
	 * tipo de datos que especifica el tipo y número de valores que puede contener.
	 */

	/*
	 * tipos de variables:
	 * 
	 * Variables locales: Las variables locales son una variable que se declara
	 * dentro del cuerpo de un método.
	 * 
	 * Variables de instancia: Las variables de instancia se definen sin la palabra
	 * clave STATIC. Están definidos fuera de la declaración del método. Son
	 * específicas del objeto y se denominan variables de instancia.
	 * 
	 * Variables estáticas: Las variables estáticas se inicializan solo una vez al
	 * comienzo de la ejecución del programa. Estas variables deben inicializarse a
	 * primero, antes de que se inicialicen las variables de instancia.
	 */

	int datos = 99; // Instancia variable
	static int a = 1; // variable estática

	public void metodo() {
		int b = 90; // variable local
	}

	// Tipos de datos

	/*
	 * Los tipos de datos clasifican los diferentes valores que se almacenarán en la
	 * variable. En Java, hay dos tipos de tipos de datos:
	 * 
	 * Tipos de datos primitivos: Los datos primitivos son solo un valor único. No
	 * tienen habilidades especiales. Java admite ocho tipos de datos primitivos:
	 * booleano, byte, char, short, int, long, float y double.
	 * 
	 * Tipos de datos no primitivos> tipos complejos String Scanner ArrayList
	 */

	// Informacion tomada de:
	// https://javadesdecero.es/basico/tipos-datos-java-ejemplos/
	// https://guru99.es/java-variables/#:~:text=Los%20tipos%20de%20datos%20clasifican%20los%20diferentes%20valores,de%20datos%20primitivos.%20Tipos%20de%20datos%20no%20primitivos.
}
