package clasesYObjetosJava;

public class SobrecargaMetodosJava {
	
	private String variable1;
	private String variable2;
	private String variable3;

	/*
	 * La sobrecarga de metodos permite definir m�s de un constructor o m�todo con el mismo nombre, con la
	 * condici�n de que no puede haber dos de ellos con el mismo n�mero y tipo de
	 * par�metros.
	 */
	
	//Sobrecarga de constructores
	
	public SobrecargaMetodosJava(String variable1, String variable2, String variable3) {
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
	}
	public SobrecargaMetodosJava() {

	}
	public SobrecargaMetodosJava(String variable1) {
		this.variable1 = variable1;
	}
	
	//Sobrecarga de metodos
	
	public void contarKm() {
		int km = 16;
		System.out.println("Hoy recorri: " + km);
	}
	public void contarKm(int km) {
		System.out.println("Hoy recorri: " + km);
	}
	
}
