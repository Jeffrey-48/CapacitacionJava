package clasesYObjetosJava.interfaces;

public class Carro implements Rueda{
	
	public Carro() {
		
	}

	public void avanzar() {
		System.out.println("El carro avanza");
	}

	public void detenerse() {
		System.out.println("El carro se detiene");
	}
}
