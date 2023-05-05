package taller;

import java.util.Scanner;

public class primer {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int descuento;
        double total;
        String bolita;
        
        do {
            System.out.println("Bienvenido a la tienda de descuento");
            System.out.println("Ingrese el color de su bolita (roja, amarilla o blanca): ");
            bolita = teclado.nextLine();
            switch (bolita) {
                case "roja":
                    descuento = 40;
                    break;
                case "amarilla":
                    descuento = 25;
                    break;
                case "blanca":
                    descuento = 0;
                    break;
                default:
                    descuento = 0;
                    System.out.println("Color de bolita inválido");
            }
            if (descuento > 0) {
                System.out.println("Ingrese el total de su compra: ");
                total = teclado.nextDouble();
                double descuentoAplicado = total * descuento / 100;
                double totalPagar = total - descuentoAplicado;
                System.out.println("El descuento aplicado es: " + descuentoAplicado);
                System.out.println("El total a pagar es: " + totalPagar);
            }
            teclado.nextLine(); // limpiar el buffer de entrada
            System.out.println("Presione 's' para continuar comprando o cualquier otra tecla para salir");
        } while (teclado.nextLine().equalsIgnoreCase("s"));
        System.out.println("Gracias por su compra");
    }

}
