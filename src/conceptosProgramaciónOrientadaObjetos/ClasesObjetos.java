package conceptosProgramaciónOrientadaObjetos;

import java.io.Serializable;

public class ClasesObjetos {

	/*
	 * Una clase es: Un modelo o prototipo definido a partir del cual se crean los
	 * objetos. Representa un conjunto de propiedades o métodos comunes a todos los
	 * objetos de un tipo.
	 */

	// Ejemplo de clase

	public class ClalseEjemplo implements Serializable {
		public void metodo() {
			int variable = 0;
		}
	}

	/*
	 * Un objeto es: Los objetos son una unidad fundamental de la programación
	 * orientada a objetos y representan entidades de la vida real. Un programa
	 * típico de Java crea muchos objetos que, como sabe, interactúan llamando a
	 * métodos.
	 */

	// Ejemplo de objeto
	String placa = "asd 123";
	Vehiculo vehiculo = new Vehiculo(placa);

	/*
	 * Tomado de:
	 * https://javadesdecero.es/poo/que-es-una-clase-ejemplos/#:~:text=Una%20clase%
	 * 20es%20una%20plantilla%20que%20define%20la,de%20planes%20que%20especifican%
	 * 20c%C3%B3mo%20construir%20un%20objeto.
	 */
}
