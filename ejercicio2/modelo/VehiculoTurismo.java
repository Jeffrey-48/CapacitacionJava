package modelo;

public class VehiculoTurismo extends Vehiculo {

	private int numPuertas;

	public VehiculoTurismo(String matricula, String marca, String modelo, int numPuertas) {
		super(matricula, marca, modelo);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	@Override
	public void avanzar() {
		System.out.println("El vehiculo turismo avanza a medianas velocidades");
	}
	
	@Override
	public void detenerse() {
		System.out.println("El vehiculo turismo se detiene lento por sus pasajeros");
	}

	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n"
				+ "Numero de puertas: " + numPuertas;

	}
}