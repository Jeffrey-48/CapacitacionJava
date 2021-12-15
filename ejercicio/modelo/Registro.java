package modelo;

public class Registro {
	
	private String registroTransacción;
	private int valor;

	public Registro(String registroTransacción) {
		this.registroTransacción = registroTransacción;
	}

	public Registro(String registroTransacción, int valor) {
		this.registroTransacción = registroTransacción;
		this.valor = valor;
	}

	public String getRegistroTransacción() {
		return registroTransacción;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Registro [" + registroTransacción + " valor=" + valor + "]";
	}
	
}
