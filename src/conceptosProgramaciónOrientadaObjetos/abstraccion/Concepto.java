package conceptosProgramaciónOrientadaObjetos.abstraccion;

public class Concepto {
	
	/*
	 * Una clase abstracta sirve para proporcionar una super clase apropiada a partir 
	 * de la cual heredan otras clases
	 * 
	 * Se utiliza sólo como super clase
	 * No se pueden instanciar objetos 
	 */
	
	public static void main(String[] args) {
		Planta planta = new Planta();
		planta.alimentarse();
		
		AnimalCarnivoro animalC = new AnimalCarnivoro();
		animalC.alimentarse();
		
		AnimalHerbivoro animalH = new AnimalHerbivoro();
		animalH.alimentarse();
	}
	
	/*
	 * Tomado de Programación ATS Youtube
	 */
}
