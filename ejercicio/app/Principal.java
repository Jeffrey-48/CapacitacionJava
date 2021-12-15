package app;

import java.util.NoSuchElementException;
import java.util.Scanner;

import modelo.ClaseHija_Consulta;
import modelo.ClasePadre_Abstracta;

public class Principal {

	public static void main(String[] args) {
		ClasePadre_Abstracta control = new ClaseHija_Consulta();
		try {
			System.out.println("Ingrese su saldo: ");
			Scanner entrada = new Scanner(System.in);
			control.setSaldo(entrada.nextInt());
			control.operaciones();
		} catch (NoSuchElementException e) {
			System.out.println("La ejecución de la aplicacion termino debido a un error en la transaccion");
		}catch (NullPointerException e) {
			System.out.println("La ejecución de la aplicacion termino por un error en una variable vacia");
		}finally {
			System.out.println("Estamos trabajando en el problema, vuelva a intentarlo más tarde");
		}
	}

}
