package modelo;

public class BicicletaRuta extends Bicicleta {

	private String tipoLlantas;

	public BicicletaRuta(String marca, String modelo, String talla, String tipoLlantas) {
		super(marca, modelo, talla);
		this.tipoLlantas=tipoLlantas;
	}

	public String getTipoLlantas() {
		return tipoLlantas;
	}

	public void setTipoLlantas(String tipoLlantas) {
		this.tipoLlantas = tipoLlantas;
	}
	
	@Override
	public void avanzar() {
		System.out.println("La bicicleta de ruta avanza por las pistas");
	}
	
	@Override
	public void detenerse() {
		System.out.println("La bicicleta de ruta se detiene con sus frenos de seguridad");
	}

	@Override
	public String toString() {
		return "BicicletaRuta [tipoLlantas=" + tipoLlantas + ", marca=" + marca + ", modelo=" + modelo + ", talla="
				+ talla + "]";
	}
	
}
