package paquetesModificadoresAccesoConvenciónNombres.ejemplo_paquete1_protected;

public class ClaseJavaUno {

	public static void main(String[] args) {
		ClaseAtributoMetodo cl = new ClaseAtributoMetodo();
		int a = cl.valorUno;
		String b = cl.valorDos;
		cl.metodo();
	}

	/*
	 * En este caso estamos utilizando los metodos y atributos de la clase ya que
	 * estamos en el mismo paquete y podemos hacer uso de ello
	 */
}
