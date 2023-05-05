package taller;
import java.util.Scanner;
/* Un teatro otorga descuentos según la edad del cliente. determinar la cantidad de 
*dinero que el teatro deja de percibir por cada una de las categorías. Tomar en 
*cuenta que los niños menores de 5 años no pueden entrar al teatro y que existe un 
*precio único en los asientos. Los descuentos se hacen tomando en cuenta el 
*siguiente cuadro:
*           Edad Descuento
*Categoría 1 5 - 14 35 %
*Categoría 2 15 - 19 25 %
*Categoría 3 20 - 45 10 %
*Categoría 4 46 - 65 25 %
*Categoría 5 66 en adelante 35 %
 
 */
public class tercer {

	public tercer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int edad;
	        int categoria;
	        double teatro;
	        double total = 0;
	        double descuento = 0;

	        System.out.println("¿Cuál es tu edad?");
	        edad = teclado.nextInt();

	        if (edad < 5) {
	            System.out.println("Lo siento, no puedes entrar al teatro.");
	        } else {
	            do {
	                System.out.println("Ingrese su categoría:");
	                System.out.println("1. 5-14 años (descuento 35%)");
	                System.out.println("2. 15-19 años (descuento 25%)");
	                System.out.println("3. 20-45 años (descuento 10%)");
	                System.out.println("4. 46-65 años (descuento 25%)");
	                System.out.println("5. 66 años o más (descuento 35%)");
	                categoria = teclado.nextInt();

	                System.out.println("¿Cuánto cobra el teatro?");
	                teatro = teclado.nextDouble();

	                switch (categoria) {
	                    case 1:
	                        descuento = 0.35;
	                        break;
	                    case 2:
	                        descuento = 0.25;
	                        break;
	                    case 3:
	                        descuento = 0.1;
	                        break;
	                    case 4:
	                        descuento = 0.25;
	                        break;
	                    case 5:
	                        descuento = 0.35;
	                        break;
	                    default:
	                        System.out.println("Categoría inválida");
	                        break;
	                }

	                if (descuento > 0) {
	                    total = teatro * (1 - descuento);
	                    System.out.println("Su descuento es de $" + (teatro - total));
	                    System.out.println("El total a pagar es $" + total);
	                }

	                System.out.println("¿Desea continuar comprando? (s/n)");
	            } while (teclado.next().equalsIgnoreCase("s"));
	        }

	        teclado.close();
	    }

	}
