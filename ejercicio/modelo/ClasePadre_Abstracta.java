package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

	protected int transacciones;
	protected int retiro;
	protected int deposito;
	private static int saldo;
	private static ArrayList<Registro> registros = new ArrayList<>();

	Scanner entrada = new Scanner(System.in);

	public void operaciones() {
		int controlCiclo = 0;
		int seleccion = 0;
		do {
			do {
				System.out.println("Porfavor seleccione una opción");
				System.out.println("	1. Consultar saldo");
				System.out.println("	2. Retiro de efectivo");
				System.out.println("	3. Agregar saldo");
				System.out.println("	4. Ver movimientos");
				System.out.println("	5. Salir");
				seleccion = entrada.nextInt();
				if (seleccion >= 1 && seleccion <= 5) {
					controlCiclo = 1;
				} else {
					System.out.println("-----------------------------------------------------");
					System.out.println("Opción no disponible, seleccione una opcion correcta.");
					System.out.println("_____________________________________________________");
				}
			} while (controlCiclo == 0);
			if (seleccion == 1) {
				ClasePadre_Abstracta cp = new ClaseHija_Consulta();
				cp.transacciones();
			}else if (seleccion == 2) {
				ClasePadre_Abstracta cp = new ClaseHija_Retiro();
				cp.transacciones();
			}else if (seleccion == 3) {
				ClasePadre_Abstracta cp = new ClaseHija_Deposito();
				cp.transacciones();
			}else if (seleccion == 4) {
				System.out.println("-----------------------------");
				for (Registro registro : registros) {
					System.out.println(registro.toString());
				}
				System.out.println("_____________________________");
			}else if (seleccion == 5) {
				System.out.println("----------------------");
				System.out.println("Gracias, vuelva pronto");
				System.out.println("______________________");
				controlCiclo = 2;
			}
		} while (controlCiclo != 2);
	}
	
	public void retiroDinero() {
		retiro = entrada.nextInt();
	}
	
	public void solicitarDinero() {
		deposito = entrada.nextInt();
	}
	
	public abstract void transacciones();

	public int getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(int transacciones) {
		this.transacciones = transacciones;
	}

	public int getRetiro() {
		return retiro;
	}

	public void setRetiro(int retiro) {
		this.retiro = retiro;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}
	
	public void agregarRegistro(String transaccion, int valor) {
		Registro registro = new Registro(transaccion,valor);
		registros.add(registro);
	}
	
}
