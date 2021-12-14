package conceptosProgramaciónOrientadaObjetos;

public class Vehiculo {
	public String placa;
	public boolean estado;

	
	public Vehiculo(String placa, boolean estado) {
		this.placa = placa;
		this.estado = estado;
	}

	public Vehiculo(String placa) {
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
