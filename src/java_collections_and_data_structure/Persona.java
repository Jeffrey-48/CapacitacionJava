package java_collections_and_data_structure;

public class Persona /*implements Comparable<T>*/{
	
	private int id;
	private String nombre;
	private int edad;
	
	public Persona(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

//	@Override
//	public int compareTo(Object o) {
//		return this.edad - o.getEdad();
//	}
	
}
