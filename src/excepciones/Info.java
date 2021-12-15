package excepciones;

public class Info {

	/*
	 * cuando un programa viola las restricciones sem�nticas del lenguaje se produce
	 * un error, la maquina virtual de java cominuca esto mediante una exception,
	 * dichas excepciones se producen durante la ejecuci�n
	 * 
	 * Una de las principales ventajas del manejo de excepciones es que automatiza
	 * gran parte del c�digo de manejo de errores que antes se ten�a que ingresar
	 * "a mano" en cualquier programa grande. Por ejemplo, en algunos lenguajes
	 * inform�ticos m�s antiguos, se devolv�a un c�digo de error cuando fallaba un
	 * m�todo, y estos valores deb�an comprobarse manualmente cada vez que se
	 * llamaba al m�todo. Este enfoque es tedioso y propenso a errores.
	 * 
	 * El manejo de excepciones simplifica el manejo de errores al permitir que su
	 * programa defina un bloque de c�digo llamado manejador de excepciones que se
	 * ejecuta autom�ticamente cuando ocurre un error.
	 * 
	 * El manejo de excepciones nos permite controlar lo que se ejecuta en el
	 * codigo, podemos reaccionar de alguna manera cuando se presenta algun error,
	 * podemos seguir ejecutando el codigo o incluso informar o corregir el error
	 */

	// Documentacion Exception java:
	// https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html

	/*
	 * Tomado de: https://javadesdecero.es/intermedio/manejo-de-excepciones/
	 */

	// Buenas practicas en las excepciones

	/*
	 * 1. Limpia los recursos en el bloque Finally o utiliza la sentencia de Try con
	 * recursos
	 * 
	 * 2. Utilizar Excepciones espec�ficas
	 * 
	 * 3. Documente las excepciones que especifique
	 * 
	 * 4. Lance excepciones con mensajes descriptivos
	 * 
	 * 5. Captura la excepci�n m�s espec�fica primero
	 * 
	 * 6. No capture Throwable
	 * 
	 * 7. No ignore excepciones
	 * 
	 * 8. No registre una excepci�n para luego lanzarla
	 * 
	 * 9. Envuelva la excepci�n sin consumirla
	 */

	/*
	 * Tomado de:
	 * https://www.clubdetecnologia.net/blog/2017/java-buenas-practicas-para-el-
	 * manejo-de-excepciones/#:~:text=Java%3A%20Buenas%20pr%C3%A1cticas%20para%20el%
	 * 20manejo%20de%20Excepciones,excepci%C3%B3n%20est%C3%A1ndar%20y%20envolverla%
	 * 20en%20una%20personalizada.%20
	 */
}
