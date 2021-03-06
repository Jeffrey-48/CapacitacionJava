package decorator;

public class DecoradorConcretoB extends Decorador {
	public DecoradorConcretoB(Componente componente) {
		super(componente);
	}

	public void operacion() {
		super.operacion();
		comportamientoAņadido();
		System.out.println("DecoradorConcretoB.operacion()");
	}

	public void comportamientoAņadido() {
		System.out.println("Comportamiento B aņadido");
	}
}