package java_collections_and_data_structure;

import java.util.Date;
import java.util.Objects;

public class Estudiante implements Comparable<Estudiante>{
	
	private int id;
	private String apellido;
	private int edad;
	private Date fecha;
	
	public Estudiante(int id, String apellido, int edad, Date fecha) {
		this.id = id;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", apellido=" + apellido + ", edad=" + edad + ", fecha=" + fecha + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return id == other.id;
	}
	@Override
	public int compareTo(Estudiante e) {
		return e.getApellido().codePointAt(0) ;
	}
	
}
