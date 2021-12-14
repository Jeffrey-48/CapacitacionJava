package clasesYObjetosJava.interfaces;

public class Principal {
	/*
	 * Una interfaz en Java es una colecci�n de m�todos abstractos y propiedades
	 * constantes. En las interfaces se especifica qu� se debe hacer pero no su
	 * implementaci�n.
	 */
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		Bicicleta bici = new Bicicleta();
		
		carro.avanzar();
		bici.avanzar();
		
		carro.detenerse();
		bici.detenerse();
	}
}
