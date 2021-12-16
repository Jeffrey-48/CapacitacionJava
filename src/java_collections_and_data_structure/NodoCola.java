package java_collections_and_data_structure;

public class NodoCola {
	private int informacion;
	private NodoCola nodoSiguiente;
	
	public NodoCola(int informacion, NodoCola nodoSiguiente) {
		this.informacion = informacion;
		this.nodoSiguiente = nodoSiguiente;
	}
	public int getInformacion() {
		return informacion;
	}
	public void setInformacion(int informacion) {
		this.informacion = informacion;
	}
	public NodoCola getNodoSiguiente() {
		return nodoSiguiente;
	}
	public void setNodoSiguiente(NodoCola nodoSiguiente) {
		this.nodoSiguiente = nodoSiguiente;
	}
	
}
