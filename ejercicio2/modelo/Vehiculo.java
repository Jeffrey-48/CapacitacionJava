package modelo;

public class Vehiculo implements Accion{

	protected String matricula;
	protected String marca;
	protected String modelo;

	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public String mostrarDatos() {
		return "Matricula: " + matricula + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo;

	}

	@Override
	public void avanzar() {
		System.out.println("El carro avanza por carretera");
	}

	@Override
	public void detenerse() {
		System.out.println("El carro se detiene en sus 4 ruedas");
	}

}