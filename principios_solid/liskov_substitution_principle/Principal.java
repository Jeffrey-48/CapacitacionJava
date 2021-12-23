package liskov_substitution_principle;

public class Principal {
	/*
	 * public static void imprimirNumAsientos(Coche[] arrayCoches) { for (Coche
	 * coche : arrayCoches) { if (coche instanceof Renault)
	 * System.out.println(numAsientosRenault(coche)); if (coche instanceof Audi)
	 * System.out.println(numAsientosAudi(coche)); if (coche instanceof Mercedes)
	 * System.out.println(numAsientosMercedes(coche)); } }
	 * 
	 * public static void main(String[] args) { Coche[] arrayCoches = { new
	 * Renault(), new Audi(), new Mercedes() }; imprimirNumAsientos(arrayCoches); }
	 */

	public static void imprimirNumAsientos(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			System.out.println(coche.numAsientos());
		}
	}

	public static void main(String[] args) {
		Coche[] arrayCoches = { new Renault(), new Audi(), new Mercedes() };
		imprimirNumAsientos(arrayCoches);  
	}
}
