package clasesYObjetosJava;

public class ConstructoresYCreacionObjetosJava {

	/*
	 * un constructor es una subrutina cuya misión es inicializar un objeto de una
	 * clase. En el constructor se asignan los valores iniciales del nuevo objeto.
	 */

	// Creacion de una clase con su respectivo constructor

	public class Hamburguesa {
		private String lechuga;
		private String carne;
		private String pan;

		// Constructor con parametros
		public Hamburguesa(String lechuga, String carne, String pan) {
			this.lechuga = lechuga;
			this.carne = carne;
			this.pan = pan;
		}

		// Constructor vacio
		public Hamburguesa() {

		}

		public String getLechuga() {
			return lechuga;
		}

		public void setLechuga(String lechuga) {
			this.lechuga = lechuga;
		}

		public String getCarne() {
			return carne;
		}

		public void setCarne(String carne) {
			this.carne = carne;
		}

		public String getPan() {
			return pan;
		}

		public void setPan(String pan) {
			this.pan = pan;
		}

	}

	/*
	 * El constructor se usa para la creacion de un objeto en especifico
	 */

	public void usoObjetos() {

		// Creacion de objeto a partir de constructor con parametros

		Hamburguesa hamburguesa = new Hamburguesa("Lechuga verde", "Carne de res", "Pan dorado");

		// Creacion de objeto a partir de constructor vacio;

		Hamburguesa hamburguesa2 = new Hamburguesa();
		hamburguesa2.setLechuga("Lechuga tierna");
		hamburguesa2.setCarne("Carne ahumada");
		hamburguesa2.setPan("Pan picante");

	}
}
