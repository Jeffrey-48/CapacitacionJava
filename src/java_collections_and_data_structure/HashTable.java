package java_collections_and_data_structure;

public class HashTable {
	private int tamanio = 9;
	private int[] arreglo;
	private int indice;
	private int ocupados;
	private float porcentajeUtil;
	private float factorUtil;
	private Nodo[] vectorHash;

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		hashTable.insertar("Nodo1", "int", "5");
		hashTable.insertar("Nodo2", "int", "6");
		hashTable.insertar("Nodo3", "int", "7");
		hashTable.insertar("Nodo4", "int", "6");
		hashTable.insertar("Nodo5", "String", "hola");
		Nodo tmp = hashTable.buscarNodo("Nodo2");
		System.out.println(tmp.getNombre()+ " " + tmp.getTipo() + " " + tmp.getValor());
	}

	public HashTable() {
		this.arreglo = new int[] { 23, 29, 37, 43, 47, 53, 59, 67, 73 };
		this.indice = 0;
		this.ocupados = 0;
		this.tamanio = arreglo[indice];
		this.porcentajeUtil = calcularPorcentaje();
		this.factorUtil = 65.0f;
		this.vectorHash = new Nodo[tamanio];
	}

	private int dobleHashing(String id, int factor) {
		int tmp = generarClave(id);
		return funcionUno(tmp) + (factor * funcionDos(tmp) % tamanio);
	}

	private float calcularPorcentaje() {
		return (ocupados * 100 / tamanio);
	}

	private int funcionUno(int clave) {
		return clave % tamanio;
	}

	private int funcionDos(int clave) {
		return 1 + (clave % (tamanio - 1));
	}

	private int generarClave(String id) {
		String codigo = "";
		int tmp = 0;
		for (int i = 0; i < id.length(); i++) {
			codigo += id.codePointAt(i);
		}
		if (codigo.length() > 9) {
			return reduccion(codigo);
		} else {
			return Integer.parseInt(codigo);
		}
	}

	private int reduccion(String codigo) {
		int tmp = 0;
		while (codigo.length() > 9) {
			String aux = codigo.substring(0, codigo.length() / 2);
			if (aux.length() > 9) {
				tmp = reduccion(aux);
				aux = "";
			} else {
				tmp = Integer.parseInt(aux);
				aux = "";
			}
			aux = codigo.substring(codigo.length() / 2, codigo.length());
			if (aux.length() > 9) {
				tmp = reduccion(aux);
				aux = "";
			} else {
				tmp = Integer.parseInt(aux);
				aux = "";
			}
			codigo = tmp + "";
		}
		return tmp;
	}

	private void insertar(String nombre, String tipo, String valor) {
		boolean insertado = false;
		if (porcentajeUtil <= 65.00f) {
			for (int i = 0; i < tamanio; i++) {
				int pos = dobleHashing(nombre, i);
				if (pos > tamanio) {
					pos -= tamanio;
				}
				if (vectorHash[pos] == null || vectorHash[pos].isEstado() == 'b') {
					vectorHash[pos] = new Nodo(nombre, tipo, valor);
					ocupados++;
					porcentajeUtil = calcularPorcentaje();
					insertado = true;
					break;
				} else {
					if (vectorHash[pos].getNombre().equals(nombre)) {
						System.out.println("La variable ya esta en la tabla: " + nombre);
						break;
					} else {
						System.out.println("Colision en la pos: " + pos);
					}
				}
			}
			if (insertado == true) {
				System.out.println("Se inserto correctamente el dato: " + nombre);
			} else {
				System.out.println("No se pudo insertar el dato: " + nombre);
			}
		} else {
			System.out.println("Hacer Rehashing, porcentaje util: " + porcentajeUtil);
			rehashing();
			insertar(nombre,tipo,valor);
		}
	}

	private void rehashing() {
		Nodo[] tmp = vectorHash;
		int tamanioTmp = tamanio;
		if (indice<arreglo.length) {
			indice++;
			if (indice==arreglo.length-1) {
				System.out.println("Aviso: se alcanzo el tamaño maximo");
			}
		}
		tamanio = arreglo[indice];
		vectorHash = new Nodo[tamanio];
		ocupados = 0;
		porcentajeUtil = calcularPorcentaje();
		for (int i = 0; i < tamanioTmp; i++) {
			if (tmp[i]!=null) {
				insertar(tmp[i].getNombre(),tmp[i].getTipo(),tmp[i].getValor());
			}
		}
		System.out.println("Rehashing realizado correctamente");		
	}
	
	public Nodo buscarNodo(String nombre) {
		boolean encontrado = false;
		Nodo tmp = null;
		int pos = 0;
		for (int i = 0; i < tamanio; i++) {
			int posicion = dobleHashing(nombre, i);
			if (posicion>tamanio) {
				posicion=tamanio;
				pos=posicion;
			}
			if (vectorHash[posicion]!=null) {
				if (vectorHash[posicion].getNombre().equals(nombre)) {
					tmp = vectorHash[posicion];
					encontrado = true;
					pos = posicion;
					break;
				}
			}
		}
		if (encontrado == true) {
			System.out.println("Se encontro la variable en la posicion: " + pos);
		}else {
			System.out.println("La variable " + nombre + " no se encuentrar en la tabla");
		}
		return tmp;
	}
}
