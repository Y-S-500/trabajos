package taller;

/*
 * . Una persona que va de compras a la tienda “Enano, S.A.”, decide llevar un control 
sobre lo que va comprando, para saber la cantidad de dinero que tendrá que pagar 
al llegar a la caja. La tienda tiene una promoción del 20% de descuento sobre 
aquellos artículos cuya etiqueta sea roja. Determinar la cantidad de dinero que 
esta persona deberá pagar
 */
import java.util.Scanner;
public class octava {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int precio;
		String compra;
		String etiqueta;
		int totalcom=0;
		double totalpagar = 0;
		
		System.out.println("Enano, S.A.");
		System.out.println("Ingrese el número de compras a registrar:");
		totalcom = teclado.nextInt();
		
		for(int i = 1; i <= totalcom; i++) {
			System.out.println("Compra #" + i + ":");
			System.out.println("Ingrese el nombre del producto:");
			compra = teclado.next();
			System.out.println("Ingrese el precio:");
			precio = teclado.nextInt();
			
			System.out.println("Ingrese el color de etiqueta:");
			etiqueta = teclado.next();
			
			if(etiqueta.equals("rojo")) {
			    totalpagar += precio * 0.8; // Aplica el 20% de descuento
			} else {
			    totalpagar += precio;
			}

			
		}
		
		System.out.println("Total a pagar: $" + totalpagar);
	}

}

