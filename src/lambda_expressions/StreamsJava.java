package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class StreamsJava {
	private List<String> lista;
	private List<String> numeros;
	
	public StreamsJava() {
		lista = new ArrayList<>();
		lista.add("code");
		lista.add("stream");
		lista.add("colletion");
		lista.add("java");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
	}
	
	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("c"))
		.forEach(System.out::println);
	}
	
	public void ordenar() {
		//lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
	}
	
	public void transformar() {
		//lista.stream().map(String::toUpperCase).forEach(System.out::println);
		numeros.stream().map(x -> Integer.parseInt(x)+1).forEach(System.out::println);
	}
	
	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		long x = lista.stream().count();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		StreamsJava sj = new StreamsJava();
		System.out.println("________Filtrar_______");
		sj.filtrar();
		System.out.println("________Ordenar_______");
		sj.ordenar();
		System.out.println("________Transformar_______");
		sj.transformar();
		System.out.println("________Limitar_______");
		sj.limitar();
		System.out.println("________Contar_______");
		sj.contar();
	}
}
