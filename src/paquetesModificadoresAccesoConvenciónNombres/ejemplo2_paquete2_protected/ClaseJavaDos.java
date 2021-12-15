package paquetesModificadoresAccesoConvenciónNombres.ejemplo2_paquete2_protected;

//Nos importa la clase que esta en el paquete 1
import paquetesModificadoresAccesoConvenciónNombres.ejemplo_paquete1_protected.ClaseAtributoMetodo;

public class ClaseJavaDos extends ClaseAtributoMetodo {

	public static void main(String[] args) {
		ClaseJavaDos cl = new ClaseJavaDos();
		int a = cl.valorUno;
		String b = cl.valorDos;
		cl.metodo();
	}

	/*
	 * En este caso, al tener la clase en otro paquete para poder hacer uso de los
	 * atributos y metodos es necesario aplicar herencia ya que la variable de
	 * acceso protected nos permite acceder al ser una subclase
	 */
}
