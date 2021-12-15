package modelo;

public class ClaseHija_Deposito extends ClasePadre_Abstracta{

	@Override
	public void transacciones() {
		System.out.println("Cuanto deseas depositar: " );
		solicitarDinero();
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		System.out.println("---------------------------------");
		System.out.println("Depositaste: " + deposito);
		System.out.println("Su saldo actual es: " + getSaldo());
		System.out.println("_________________________________");
		agregarRegistro("Deposito de saldo: ", deposito);
	}

}
