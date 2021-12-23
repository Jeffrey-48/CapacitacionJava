package open_closed_principle_violation;

public class Principal {

	public static void main(String[] args) {
		Coche[] arrayCoches = { new Coche("Renault"), new Coche("Audi") };
		imprimirPrecioMedioCoche(arrayCoches);
	}

	public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			if (coche.getMarcaCoche().equals("Renault"))
				System.out.println(18000);
			if (coche.getMarcaCoche().equals("Audi"))
				System.out.println(25000);
		}
	}

	/*
	 * Aqui no se cumpliria el principio ya que si deseamos agregar un coche
	 * adicional tenemos que modificar el metodo imprimir
	 */
}
