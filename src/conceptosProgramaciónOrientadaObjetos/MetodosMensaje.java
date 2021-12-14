package conceptosProgramaciónOrientadaObjetos;

public class MetodosMensaje {

	/*
	 * Los metodo son: subrutinas que manipulan datos definidos por la clase y, en
	 * muchos casos, brindan acceso a esos datos. En la mayoría de los casos, otras
	 * partes de su programa interactuarán con una clase a través de sus métodos.
	 */

	// Ejemplo de metodo

	public Vehiculo funcionPlaca(String placa) {
		Vehiculo vh = new Vehiculo(placa);
		System.out.println("La placa de su vehiculo es: " + vh.getPlaca());
		return vh;
	}

	/*
	 * Un mensaje es cuando: Los objetos interactúan enviándose mensajes entre sí. Cuando
	 * se recibe el mensaje, el sujeto actuará. Las acciones pueden ser enviar otros
	 * mensajes, cambiar su estado o realizar cualquier otra tarea para la que se
	 * envía el objeto.
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
