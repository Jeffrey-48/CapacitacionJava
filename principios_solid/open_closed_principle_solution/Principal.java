package open_closed_principle_solution;

public class Principal {
	public static void main(String[] args) {

		Coche[] arrayCoches = { new Renault(), new Audi(), new Mercedes() };

		imprimirPrecioMedioCoche(arrayCoches);
	}

	public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			System.out.println(coche.precioMedioCoche());
		}
	}
}
