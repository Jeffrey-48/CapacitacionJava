package capacitacionJava.EstructuraDelLenguaje;

public class ExprecionesYOperadoresJava {

	/*
	 * Los programas en Java constan de datos, sentencias de programas y
	 * expresiones. Una expresi�n es, normalmente, una ecuaci�n matem�tica, como 1 + 2
	 * En esta expresi�n, el s�mbolo m�s (+) es el operador de suma, y los
	 * n�meros 1 y 2 se llaman operandos. En s�ntesis, una expresi�n es una
	 * secuencia de operadores y operandos que especifica un c�lculo. Como en la
	 * mayor�a de los lenguajes, Java permite formar expresiones utilizando
	 * variables, constantes y operadores aritm�ticos.
	 * 
	 * Tomado de:
	 * https://manualjavaoracle.wordpress.com/2018/01/20/operaciones-y-expresiones/#
	 * :~:text=Operadores%20y%20expresiones.%20Los%20programas%20en%20Java%20constan
	 * ,una%20secuencia%20de%20operadores%20y%20operandos%20que%20
	 */

	// Operadores

	/*
	 * Operador de Asignaci�n: El operador de asignaci�n, =, asigna el valor de la
	 * expresi�n derecha a la variable situada a su izquierda.
	 */

	public void operadoresDeAsignacion() {
		int a = 1;
		int b = 1;
		a += b;
		a -= b;
		a *= b;
		a /= b;
		a %= b;
	}

	/*
	 * Operadores aritm�ticos: Los operadores aritm�ticos sirven para realizar
	 * operaciones aritm�ticas b�sicas. Los operadores aritm�ticos Java siguen las
	 * reglas algebraicas t�picas de jerarqu�a o prioridad. Cinco operadores se
	 * utilizan para operaciones b�sicas en Java: + � * / y %
	 */

	public void operadoresAritmeticos() {
		int a = 1;
		int b = 1;
		a = a + b;
		a = a - b;
		a = a * b;
		a = a % b;
	}

	/*
	 * Operadores de incrementaci�n y decrementaci�n: Dos caracter�sticas que
	 * incorpora Java, una de las m�s �tiles son los operadores de incremento ++ y
	 * decremento �. Los operadores ++ y �, denominados de incrementaci�n y
	 * decrementaci�n, suman o restan 1 a su argumento, respectivamente, cada vez
	 * que se aplican a una variable.
	 */

	public void operadoresIncrementoDecremento(int a, int b) {
		a++;
		b--;
	}

	/*
	 * Operadores relacionales: A menudo se utilizan en sentencias seleccion (if) o
	 * iteracion (while, for), que se utilizan para probar una condici�n. Usando
	 * operadores relacionales, se realizan las operaciones de igualdad, desigualdad
	 * y diferencia relativa
	 */
	public void operadoresRelacionales(int a, int b) {
		if (a == b) {
			System.out.println("a igual a b");
		}
		if (a != b) {
			System.out.println("a diferente a b");
		}
		if (a < b) {
			System.out.println("a menor a b");
		}
		if (a > b) {
			System.out.println("a mayor a b");
		}
		if (a <= b) {
			System.out.println("a menor o igual a b");
		}
		if (a >= b) {
			System.out.println("a mayor o igual a b");
		}
	}

	/*
	 * Operadores l�gicos: Estos operadores se utilizan con expresiones para
	 * devolver verdadero o falso. Los operadores l�gicos tambi�n se conocen como
	 * operadores booleanos
	 */

	public void operadoresLogicos(int a, int b) {
		if ((a == b) && (a > 5)) {
			System.out.println("a igual a b y a mayor a 5");
		}
		if ((a != b) || (b < 5)) {
			System.out.println("a diferente a b o b menor a 5");
		}
	}

	/*
	 * Operador condicional: && Operador condicional AND || Operador condicional OR
	 * ?: Operador Ternario instanceof Operador instanceof
	 */

	public void operadoresCondicionales() {
		int vble1 = 5;
		int vble2 = 4;
		int mayor;
		mayor = (vble1 > vble2) ? vble1 : vble2;
		System.out.println("El mayor de los dos n�meros es " + mayor);
	}
}
