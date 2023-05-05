package taller;
/*
 * En la Cámara de Diputados se levanta una encuesta con todos los integrantes con 
el fin de determinar qué porcentaje de los n diputados está a favor del Tratado de 
Libre Comercio, que porcentaje está en contra y que porcentaje se abstiene de 
opinar.

 */

import java.util.Scanner;
public class septima {

	public septima() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int diputados, favor = 0, encontra = 0, abstenciones = 0;
		System.out.println("Número de diputados:");
		diputados = teclado.nextInt();
		
		do {
			System.out.println("¿A favor del Tratado de Libre Comercio? (s/n)");
			String respuesta = teclado.next();
			if (respuesta.equalsIgnoreCase("s")) {
				favor++;
			} else if (respuesta.equalsIgnoreCase("n")) {
				encontra++;
			} else {
				abstenciones++;
			}
			System.out.println("¿Continuar encuesta? (s/n)");
		} while (teclado.next().equalsIgnoreCase("s"));

		System.out.println("Resultados de la encuesta:");
		System.out.println("A favor: " + (favor * 100.0 / diputados) + "%");
		System.out.println("En contra: " + (encontra * 100.0 / diputados) + "%");
		System.out.println("Abstenciones: " + (abstenciones * 100.0 / diputados) + "%");
		
		teclado.close();
	}


		
}


