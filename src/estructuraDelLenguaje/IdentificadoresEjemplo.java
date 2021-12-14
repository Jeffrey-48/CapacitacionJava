package estructuraDelLenguaje;

public class IdentificadoresEjemplo {

	/*
	 * Identificadores Un identificador es: Este es el nombre de variables, clases,
	 * objetos y métodos. Las palabras clave y las palabras específicas del idioma
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
	 * Reglas: 1. Los únicos caracteres permitidos en los identificadores de Java
	 * son a a z, A a Z, 0 a 9, $ y _
	 * 
	 * 2. Los identificadores no pueden comenzar con dígitos, es decir, 123name no
	 * es válido.
	 * 
	 * 3. Los identificadores Java distinguen entre mayúsculas y minúsculas, por
	 * supuesto, el lenguaje java se considera como lenguaje de programación
	 * sensible a mayúsculas y minúsculas. es decir, nombre, Nombre, NOMBRE, ambos
	 * son nombres de variables diferentes.
	 * 
	 * 4. No hay límite de longitud para los identificadores de Java, pero no se
	 * recomienda tomar identificadores de longitud.
	 * 
	 * 5. No podemos usar palabras reservadas como identificadores, de lo contrario
	 * obtendremos un error de compilación. es decir, int if = 20; Aquí obtendremos
	 * un error de compilación.
	 * 
	 * 6. Todos los nombres de clase de Java predefinidos y los nombres de interfaz
	 * que podemos usar como identificadores. es decir, int String = 20; aquí no
	 * obtendremos ningún error de compilación. Pero no es una buena práctica de
	 * programación. Tomado de:
	 * https://program.gobetech.com/37545/que-es-un-identificador-en-java.html
	 */

}
