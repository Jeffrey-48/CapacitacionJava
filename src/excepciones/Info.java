package excepciones;

public class Info {

	/*
	 * cuando un programa viola las restricciones semánticas del lenguaje se produce
	 * un error, la maquina virtual de java cominuca esto mediante una exception,
	 * dichas excepciones se producen durante la ejecución
	 * 
	 * Una de las principales ventajas del manejo de excepciones es que automatiza
	 * gran parte del código de manejo de errores que antes se tenía que ingresar
	 * "a mano" en cualquier programa grande. Por ejemplo, en algunos lenguajes
	 * informáticos más antiguos, se devolvía un código de error cuando fallaba un
	 * método, y estos valores debían comprobarse manualmente cada vez que se
	 * llamaba al método. Este enfoque es tedioso y propenso a errores.
	 * 
	 * El manejo de excepciones simplifica el manejo de errores al permitir que su
	 * programa defina un bloque de código llamado manejador de excepciones que se
	 * ejecuta automáticamente cuando ocurre un error.
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
	 * 2. Utilizar Excepciones específicas
	 * 
	 * 3. Documente las excepciones que especifique
	 * 
	 * 4. Lance excepciones con mensajes descriptivos
	 * 
	 * 5. Captura la excepción más específica primero
	 * 
	 * 6. No capture Throwable
	 * 
	 * 7. No ignore excepciones
	 * 
	 * 8. No registre una excepción para luego lanzarla
	 * 
	 * 9. Envuelva la excepción sin consumirla
	 */

	/*
	 * Tomado de:
	 * https://www.clubdetecnologia.net/blog/2017/java-buenas-practicas-para-el-
	 * manejo-de-excepciones/#:~:text=Java%3A%20Buenas%20pr%C3%A1cticas%20para%20el%
	 * 20manejo%20de%20Excepciones,excepci%C3%B3n%20est%C3%A1ndar%20y%20envolverla%
	 * 20en%20una%20personalizada.%20
	 */
}
