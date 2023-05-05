package taller;
/*
 * . Leer 2 números donde el primer número es la base y segundo es el exponente:
- Imprimir el resultado mediante multiplicaciones
 */
import java.util.Scanner;
public class veinte {
	
	

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, exponente;
        double resultado = 1;

        System.out.println("Ingrese la base:");
        base = teclado.nextInt();
        System.out.println("Ingrese el exponente:");
        exponente = teclado.nextInt();

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println(base + "^" + exponente + " = " + resultado);
    }
}

	

