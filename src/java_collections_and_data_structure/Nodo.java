package java_collections_and_data_structure;

public class Nodo {
	
	private char estado;
	private String nombre;
	private String tipo;
	private String valor;
	
	public Nodo(String nombre, String tipo, String valor) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.valor = valor;
	}

	public char isEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
