package conceptosProgramaciónOrientadaObjetos.Polimorfismo;

import java.util.ArrayList;

public class Concepto {

	/*
	 * En una relacion de tipo herencia, un objeto de la superclase puede almacenar 
	 * un objeto de cualquiera de sus subclases
	 * 
	 * La superclase es compatible con los tipos que derivan de ella, pero no al revés
	 */
	
	/*
	 * Tomado de Programación ATS Youtube
	 */
	
	public static void main(String[] args) {
		ArrayList<Vehiculo> misVehiculos = new ArrayList<>();
		misVehiculos.add(new Vehiculo("123", "Toyota", "94"));
		misVehiculos.add(new VehiculoTurismo("123", "Toyota", "94",6));
		misVehiculos.add(new VehiculoDeportivo("123", "Toyota", "94",1100));
		misVehiculos.add(new VehiculoFurgoneta("123", "Toyota", "94",4000));
		for (Vehiculo vehiculo : misVehiculos) {
			System.out.println(vehiculo.mostrarDatos());
			System.out.println("      ");
		}
	}
}
