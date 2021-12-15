package modelo;

public class Registro {
	
	private String registroTransacci�n;
	private int valor;

	public Registro(String registroTransacci�n) {
		this.registroTransacci�n = registroTransacci�n;
	}

	public Registro(String registroTransacci�n, int valor) {
		this.registroTransacci�n = registroTransacci�n;
		this.valor = valor;
	}

	public String getRegistroTransacci�n() {
		return registroTransacci�n;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Registro [" + registroTransacci�n + " valor=" + valor + "]";
	}
	
}
