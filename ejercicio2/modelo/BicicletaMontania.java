package modelo;

public class BicicletaMontania extends Bicicleta {

	private String tipoSuspencion;

	public BicicletaMontania(String marca, String modelo, String talla, String tipoSuspencion) {
		super(marca, modelo, talla);
		this.tipoSuspencion=tipoSuspencion;
	}

	public String getTipoSuspencion() {
		return tipoSuspencion;
	}

	public void setTipoSuspencion(String tipoSuspencion) {
		this.tipoSuspencion = tipoSuspencion;
	}

	@Override
	public String toString() {
		return "BicicletaMontania [tipoSuspencion=" + tipoSuspencion + ", marca=" + marca + ", modelo=" + modelo
				+ ", talla=" + talla + "]";
	}
	
	@Override
	public void avanzar() {
		System.out.println("La bicicleta de montaña avanza por los bosques");
	}
	
	@Override
	public void detenerse() {
		System.out.println("La bicicleta de montaña se detiene con sus frenos hidraulicos");
	}
	
}
