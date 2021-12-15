package modelo;

public class Bicicleta implements Accion{
	
	protected String marca;
	protected String modelo;
	protected String talla;
	
	public Bicicleta(String marca, String modelo, String talla) {
		this.marca = marca;
		this.modelo = modelo;
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", modelo=" + modelo + ", talla=" + talla + "]";
	}

	@Override
	public void avanzar() {
		System.out.println("La bicicleta avanza a el ritmo de las piernas");
		
	}

	@Override
	public void detenerse() {
		System.out.println("La bicicleta se detiene con sus frenos de mano");
		
	}
	
}
