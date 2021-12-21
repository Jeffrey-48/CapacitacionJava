package decorator;

public class DecoradorConcretoB extends Decorador {
	public DecoradorConcretoB(Componente componente) {
		super(componente);
	}

	public void operacion() {
		super.operacion();
		comportamientoA�adido();
		System.out.println("DecoradorConcretoB.operacion()");
	}

	public void comportamientoA�adido() {
		System.out.println("Comportamiento B a�adido");
	}
}