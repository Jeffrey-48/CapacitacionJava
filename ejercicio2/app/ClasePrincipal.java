package app;

import modelo.Bicicleta;
import modelo.BicicletaMontania;
import modelo.BicicletaRuta;
import modelo.Vehiculo;
import modelo.VehiculoDeportivo;
import modelo.VehiculoFurgoneta;
import modelo.VehiculoTurismo;

public class ClasePrincipal {
	
	public static void main(String[] args) {
		Vehiculo carro1 = new VehiculoDeportivo("123", "Ford", "94", 600);
		Vehiculo carro2 = new VehiculoFurgoneta("123", "Ford", "94", 4000);
		Vehiculo carro3 = new VehiculoTurismo("123", "Ford", "94", 24);
		
		System.out.println("Carro deportivo");
		carro1.avanzar();
		carro1.detenerse();
		System.out.println("______________________________________");
		
		System.out.println("Carro de carga");
		carro2.avanzar();
		carro2.detenerse();
		System.out.println("______________________________________");
		
		System.out.println("Carro de turismo");
		carro3.avanzar();
		carro3.detenerse();
		System.out.println("______________________________________");
		
		Bicicleta bici1 = new BicicletaMontania("GW","2018","S","PRO");
		Bicicleta bici2 = new BicicletaRuta("TREK","2021","X","PRO_Racing");
		
		
		System.out.println("Bicicleta de montaña");
		bici1.avanzar();
		bici1.detenerse();
		System.out.println("______________________________________");
		
		System.out.println("Bicicleta de ruta");
		bici2.avanzar();
		bici2.detenerse();
		System.out.println("______________________________________");
	}
}
