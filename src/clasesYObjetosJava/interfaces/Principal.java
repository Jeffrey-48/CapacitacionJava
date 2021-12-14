package clasesYObjetosJava.interfaces;

public class Principal {
	/*
	 * Una interfaz en Java es una colección de métodos abstractos y propiedades
	 * constantes. En las interfaces se especifica qué se debe hacer pero no su
	 * implementación.
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
