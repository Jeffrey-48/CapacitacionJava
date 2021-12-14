package conceptosProgramaciónOrientadaObjetos.Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{

	private int cilindrada;
	
	public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada=cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\n" +
				"Marca: " + marca + "\n" + 
				"Modelo: " + modelo + "\n" +
				"Cilindrada: " + cilindrada;
				
	}
}
