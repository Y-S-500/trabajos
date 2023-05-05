package taller;
import java.util.Scanner;
/*
 * En una granja se requiere saber alguna información para determinar el precio de 
venta por cada kilo de huevo. Es importante determinar el promedio de calidad de 
las n gallinas que hay en la granja. La calidad de cada gallina se obtiene según la 
fórmula:
Calidad = peso de la gallina * altura de la gallina 
Número de huevos que pone
- Finalmente para fijar el precio del kilo de huevo, se toma como base la 
siguiente tabla:
PRECIO TOTAL DE CALIDAD PESO POR KILO DE HUEVO
Mayor o igual que 15 1.2 * promedio de calidad
Mayor que 8 y menor que 15 1.00 * promedio de calidad
Menor o igual que 8 0.80 * promedio de calidad
 */
public class sexta {

	

	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int Ngallinas;
	        int calidad = 0;
	        int pesog;
	        int alturag;
	        int nhuevos;
	        double precio = 0;

	        System.out.println("Ingrese el número de gallinas:");
	        Ngallinas = teclado.nextInt();

	        for (int i = 1; i <= Ngallinas; i++) {
	            System.out.println("Ingrese el peso de la gallina " + i + ":");
	            pesog = teclado.nextInt();
	            System.out.println("Ingrese la altura de la gallina " + i + ":");
	            alturag = teclado.nextInt();
	            System.out.println("Ingrese el número de huevos que pone la gallina " + i + ":");
	            nhuevos = teclado.nextInt();
	            calidad += pesog * alturag / nhuevos;
	        }

	        double promedio = calidad / Ngallinas;
	        System.out.println("El promedio de calidad de las gallinas es: " + promedio);

	        if (promedio >= 15) {
	            precio = promedio * 1.2;
	        } else if (promedio > 8 && promedio < 15) {
	            precio = promedio;
	        } else if (promedio <= 8) {
	            precio = promedio * 0.8;
	        }

	        System.out.println("El precio del kilo de huevo es: " + precio);
	    }
	}

