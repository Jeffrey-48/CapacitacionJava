package modelo;

public class VehiculoFurgoneta extends Vehiculo {

	private int carga;

	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public void avanzar() {
		System.out.println("El vehiculo furgoneta avanza lento por su peso");
	}
	
	@Override
	public void detenerse() {
		System.out.println("El vehiculo furgoneta se detiene lentamente por su peso");
	}

	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Carga: "
				+ carga;

	}

}