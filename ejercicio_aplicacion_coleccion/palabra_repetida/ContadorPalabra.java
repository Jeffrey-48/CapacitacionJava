package palabra_repetida;

import java.util.HashMap;

public class ContadorPalabra {

	public static void main(String[] args) {
		String cadena = "hola yo soy jeffrey soy de colombia y me apaciona el mundo del desarrollo de software ademas disfruto de los deportes extremos tambien de los buenos juegos buena musica y las carreras de carros y motos por otro lado me gusta compartir con mis amigos y familia tambien actualmente estoy iniciando como desarrollador backend en una empresa por fuera de mi pais y esto me tiene muy alegre ademas aun sigo sin creerlo siento que logre algo que veia muy lejos y estoy muy orgulloso de ello y mi familia tambien lo esta ademas me apoyan mucho para lograr todos mis sueños para eso cada dia doy lo mejor de mi";
		String[] palabras = cadena.split(" ");
		HashMap<String, Integer> mapaNumeroPalabraRepetida = new HashMap<>();
		for (String palabra : palabras) {
			if (mapaNumeroPalabraRepetida.containsKey(palabra)) {
				mapaNumeroPalabraRepetida.put(palabra, mapaNumeroPalabraRepetida.get(palabra) + 1);
			} else {
				mapaNumeroPalabraRepetida.put(palabra, 1);
			}
		}
		for (HashMap.Entry<String, Integer> entry : mapaNumeroPalabraRepetida.entrySet()) {
			System.out.println("La palabra: " + "'" + entry.getKey() + "'" + " esta repetida: " + entry.getValue());
		}
	}
}
