package clasesYObjetosJava;

public class InnerClass {

	/*
	 * Una inner class es una clase dentro de otra clase Puede ser privada y y una
	 * vez que se declara privada una clase interna, no se puede acceder a ella
	 * desde un objeto fuera de la clase
	 */

	public static void main(String args[]) {
		// Instantiating the outer class
		Outer_Demo outer = new Outer_Demo();

		// Accessing the display_Inner() method.
		outer.display_Inner();
	}
}

class Outer_Demo {
	int num;

	// inner class
	private class Inner_Demo {
		public void print() {
			System.out.println("This is an inner class");
		}
	}

	// Accessing he inner class from the method within
	void display_Inner() {
		Inner_Demo inner = new Inner_Demo();
		inner.print();
	}

	/*
	 * Tomado de:
	 * https://www.tutorialspoint.com/java/java_innerclasses.htm#:~:text=Inner%
	 * 20classes%20are%20a%20security%20mechanism%20in%20Java.,to%20access%20the%
	 * 20private%20members%20of%20a%20class.
	 */
}