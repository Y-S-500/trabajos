package taller;

import java.util.Scanner;

public class segundo {
	/*
	 * En un supermercado, una ama de casa pone en su carrito los artículos que va
	 * tomando de los estantes. La señora quiere asegurarse de que el cajero le cobre
	 * bien lo que ella ha comprado, por lo que cada vez que toma un artículo anota su
	 * precio junto con la cantidad de artículos iguales que ha tomado y determina
	 * cuánto dinero gastará en ese artículo. A esto le suma lo que irá gastando en los
	 * demás artículos, hasta que decide que ya tomó todo lo que necesitaba. Ayuda a
	 * esta señora a obtener el total de sus compras.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int articulos;
		int precio;
		int total = 0;
		int totalCompra;// variable para acumular el total de la compra

		do {
			System.out.println("Ingrese el precio del artículo:");
			precio = teclado.nextInt();

			System.out.println("Ingrese la cantidad de artículos:");
			articulos = teclado.nextInt();

			int subtotal = precio * articulos; // calcular el subtotal de la compra
			System.out.println("El subtotal de esta compra es: " + subtotal);

			total += subtotal; // acumular el subtotal al total de la compra

			System.out.println("Presione 's' para continuar comprando o cualquier otra tecla para salir");

			teclado.nextLine(); // limpiar el buffer del teclado antes de leer la siguiente entrada

		} while (teclado.nextLine().equalsIgnoreCase("s"));
		

		System.out.println("El total de su compra es: " + total);
	
		teclado.close(); // cerrar el objeto Scanner
	}
}
