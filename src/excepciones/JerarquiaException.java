package excepciones;

public class JerarquiaException {

	/*
	 * Primeramente sabemos que la clase que contiene todos los posibles errores y
	 * excepciones es throwable que extiende de object
	 * 
	 * En el siguiente nivel jerarquico tenemos las clases Exception y Error, donde
	 * error es todo lo referente a errores a nivel de hardware que no podemos
	 * controlar desde el codigo, por otro lado esta el Exception que nos indica
	 * errores a nivel de codigo que podemos solucionar
	 * 
	 * En el tercer nivel tenemos las clases IOException y RunTimeException, dichas
	 * clases extienden de Exception, IOException hace referencia a errores que
	 * surgen con archivos externos a el codigo pero nosotros como programadores los
	 * podemos tratar o arreglar, por otro lado esta el RunTimeException donde se
	 * encuantran alojadas todas las excepciones que ocurren a nivel de codigo,
	 * estas pueden ser errores aritmeticos, de tipos de datos, datos nullos etc.
	 */
}
