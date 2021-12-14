package clasesYObjetosJava;

public class AccesoVariablesMetodosJava {

	/*
	 * Una variable se define como el nombre utilizado para mantener un valor de
	 * cualquier tipo durante la ejecución del programa. En Java, una variable puede
	 * ser estática, local o de instancia.
	 */

	static int numero;
	// Acceder a variables estáticas en Java
	// Si una variable es estática, podemos acceder a ella usando el nombre de la
	// clase

	int suma;
	// Acceder a las variables de instancia en Java
	// Solo puede acceder a las variables de instancia mediante el objeto de clase.

	int suma2; // a partir de una herencia
	/*
	 * Suponga que una clase hereda de otra clase; las variables de superclase se
	 * vuelven completamente accesibles en la clase hija. Puede acceder a todas las
	 * variables utilizando un objeto de subclase y no necesita crear un objeto de
	 * clase principal. Este escenario ocurre solo cuando la clase se extiende; de
	 * lo contrario, la única forma de acceder a él es utilizando subclase.
	 */

	/*
	 * Tomado de:
	 * https://www.delftstack.com/es/howto/java/java-access-a-variable-from-another-
	 * class/#:~:text=En%20Java%2C%20una%20variable%20puede%20ser%20est%C3%A1tica%2C
	 * %20local,objeto%20de%20clase%20para%20acceder%20a%20la%20variable.
	 */

	// Para acceso a metodos

	/*
	 * private: únicamente la clase puede acceder a la propiedad o método. package
	 * private (valor por defecto si no se indica ninguno): solo las clases en el
	 * mismo paquete pueden acceder a la propiedad o método. protected: las clases
	 * del mismo paquete y que heredan de la clase pueden acceder a la propiedad o
	 * método. public: la propiedad o método es accesible desde cualquier método de
	 * otra clase.
	 */

	/*
	 * Tomado de:
	 * https://picodotdev.github.io/blog-bitix/2020/01/los-modificadores-de-acceso-
	 * de-clases-propiedades-y-metodos-en-java/#:~:text=El%20acceso%20a%20las%
	 * 20propiedades%20y%20m%C3%A9todos%20se,clase%20puede%20acceder%20a%20la%
	 * 20propiedad%20o%20m%C3%A9todo.
	 */
}
