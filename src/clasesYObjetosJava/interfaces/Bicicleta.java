package clasesYObjetosJava.interfaces;

public class Bicicleta implements Rueda{

	@Override
	public void avanzar() {
		System.out.println("La bicicleta avanza");
		
	}

	@Override
	public void detenerse() {
		System.out.println("La bicicleta se detiene");
		
	}

}
