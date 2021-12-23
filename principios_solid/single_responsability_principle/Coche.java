package single_responsability_principle;

public class Coche {

	private String marca;

	public Coche(String marca) {
		this.marca = marca;
	}

	public String getMarcaCoche() {
		return marca;
	}
	
	//En este caso se esta asignando una responsabilidad extra e el coche
	public void guardarCocheDB(Coche coche){
		//Instrucciones para guardar coche
	}
	//la solucion seria asignar esta responsabilidad a una clase responsable
}
