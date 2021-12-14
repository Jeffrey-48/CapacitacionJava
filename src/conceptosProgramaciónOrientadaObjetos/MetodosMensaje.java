package conceptosProgramaci�nOrientadaObjetos;

public class MetodosMensaje {

	/*
	 * Los metodo son: subrutinas que manipulan datos definidos por la clase y, en
	 * muchos casos, brindan acceso a esos datos. En la mayor�a de los casos, otras
	 * partes de su programa interactuar�n con una clase a trav�s de sus m�todos.
	 */

	// Ejemplo de metodo

	public Vehiculo funcionPlaca(String placa) {
		Vehiculo vh = new Vehiculo(placa);
		System.out.println("La placa de su vehiculo es: " + vh.getPlaca());
		return vh;
	}

	/*
	 * Un mensaje es cuando: Los objetos interact�an envi�ndose mensajes entre s�. Cuando
	 * se recibe el mensaje, el sujeto actuar�. Las acciones pueden ser enviar otros
	 * mensajes, cambiar su estado o realizar cualquier otra tarea para la que se
	 * env�a el objeto.
	 */
	
	//Ejemplo de mensaje entre objetos
	
	public void cambiarEstado(boolean condicion, Vehiculo vh) {
		if (condicion == false) {
			vh.setEstado(false);
		}else {
			vh.setEstado(true);
		}
	}
}
