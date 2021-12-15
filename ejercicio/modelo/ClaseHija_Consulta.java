package modelo;

public class ClaseHija_Consulta extends ClasePadre_Abstracta{

	@Override
	public void transacciones() {
		System.out.println("---------------------------------");
		System.out.println("Tu saldo actual es: " + getSaldo());
		System.out.println("_________________________________");
		agregarRegistro("Consulta de saldo: ", getSaldo());
	}
	
}	
