package conceptosProgramaci�nOrientadaObjetos.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
	
	private int carga;

	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga=carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\n" +
				"Marca: " + marca + "\n" + 
				"Modelo: " + modelo + "\n" + 
				"Carga: " + carga;
				
	}
	
}
