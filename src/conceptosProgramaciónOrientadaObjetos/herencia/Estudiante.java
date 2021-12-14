package conceptosProgramaciónOrientadaObjetos.herencia;

public class Estudiante extends Persona{
	
	private int codigoEstudiante;
	private int notaFinal;
	
	public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, int notaFinal) {
		super(nombre, apellido, edad);
		this.codigoEstudiante=codigoEstudiante;
		this.notaFinal=notaFinal;
	}
	
	public void showDatos() {
		System.out.println("Nombre: " + getNombre() + "\n" + "Apellido: " + getApellido() +
				"\n" + "Edad: " + getEdad() + "\n" + "Codigo: " + codigoEstudiante + "\n" + "Nota: " + notaFinal);
	}
}
