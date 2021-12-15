package paquetesModificadoresAccesoConvenciónNombres;

public class ModificadoresDeAcceso {

	/*
	 * Los modificadores en java se dividen en dos grupos acceso y no acceso Acceso:
	 * public, private, protected 
	 * Sin acceso: static, final, abstract, synchronized,
	 * volatile, transienty native
	 */

	// public – se puede acceder al miembro desde cualquier lugar

	// protected – el miembro solo es inaccesible desde no subclases en un paquete
	// diferente

	// predeterminado (paquete privado) – también conocido como package acceso, el
	// miembro puede ser accedido por cualquier clase dentro del mismo paquete

	// private – el miembro solo puede ser accedido por otros miembros dentro de la
	// misma clase

	// package packageOne;

	public class MyPublicClass {
		String noModifierText = "No Modifier";
		private String privateText = "Private Text";
		protected String protectedText = "Protected Text";
		public String publicText = "Public Text";

		public MyPublicClass() {
			System.out.println("MyPublicClass constructor:");
			System.out.println(noModifierText);
			System.out.println(privateText);
			System.out.println(protectedText);
			System.out.println(publicText);
		}
	}

	/*
	 * Tomado de:
	 * https://pharos.sh/modificadores-de-acceso-en-java/#:~:text=Como%20se%
	 * 20mencion%C3%B3%20anteriormente%2C%20hay%20tres%20modificadores%20de,
	 * inaccesible%20desde%20no%20subclases%20en%20un%20paquete%20diferente
	 */
}
