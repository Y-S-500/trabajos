package taller;

/*
 *  Suponga que tiene usted una tienda y desea registrar las ventas en una 
computadora. Diseñe un pseudocódigo que lea por cada cliente, el monto total de 
su compra. Al final del día escriba la cantidad total de las ventas y el número de 
clientes atendidos.

 */
import java.util.Scanner;


public class doce {

	public doce() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int totalVentas = 0;
		int numClientes = 0;
		int compra;
		while(numClientes < 200) {
			numClientes++;
			System.out.println("Ingrese el monto total de la compra del cliente " + numClientes + ":");
			compra = teclado.nextInt();
			totalVentas += compra;
		}
		System.out.println("Cantidad total de ventas: " + totalVentas);
		System.out.println("Número de clientes atendidos: " + numClientes);
	}

}

