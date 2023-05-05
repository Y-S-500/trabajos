package taller;

import java.util.Scanner;

public class trese {

	public trese() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int totalVentas = 0;
		int numClientes = 0;
		int compra;
		int iva;
		int totalApagar;
		int cantidadPaga;
		int cambio;

		while (numClientes < 2) {
			numClientes++;
			System.out.println("Ingrese el monto total de la compra del cliente " + numClientes + ":");
			compra = teclado.nextInt();
			iva = (int) (compra * 0.19);
			totalApagar = compra + iva;
			System.out.println("El IVA de la compra es: " + iva);
			System.out.println("El total a pagar es: " + totalApagar);
			System.out.println("Ingrese la cantidad con que paga el cliente " + numClientes + ":");
			cantidadPaga = teclado.nextInt();
			cambio = cantidadPaga - totalApagar;
			System.out.println("El cambio es: " + cambio);
			totalVentas += totalApagar;
		}
		System.out.println("La cantidad de dinero en la caja es: " + totalVentas);
	}
}
