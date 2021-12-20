package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
	private List<Integer> numeros;
	
	public void llenar() {
		numeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
	}
	
	public static void main(String[] args) {
		ParallelStream app = new ParallelStream();
		app.llenar();
		System.out.println("_________Secuencial_________");
		app.probarStream();
		System.out.println("_________Paralelo_________");
		app.probarParalelo();
	}

	private void probarParalelo() {
		numeros.parallelStream().forEach(System.out::println);
	}

	private void probarStream() {
		numeros.stream().forEach(System.out::println);
	}
}
