package modelo;

public class ClaseHija_Retiro extends ClasePadre_Abstracta{

	@Override
	public void transacciones() {
		System.out.print("Cuanto dinero desea retirar: ");
		retiroDinero();
		if (retiro <= getSaldo()) {
			transacciones = getSaldo();
			System.out.println("---------------------------------");
			setSaldo(transacciones-retiro);
			System.out.println("Retiraste: " + retiro);
			System.out.println("Tu saldo actual es: " + getSaldo());
			System.out.println("_________________________________");
			agregarRegistro("Retiro de saldo: ", retiro);
		}else {
			System.out.println("------------------");
			System.out.println("Saldo insuficiente");
			System.out.println("__________________");
		}
		
	}

}
