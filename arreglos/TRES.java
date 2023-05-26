package arreglos;

import java.util.Scanner;

/*
 *  Almacenar en un vector los números de 1 hasta n y posteriormente imprimir los 
números pares e impares
 */
public class TRES {

	public TRES() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros;
        int n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        n = teclado.nextInt();

        numeros = new int[n];

        // Almacenar los números del 1 al n en el arreglo
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Números pares:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Números impares:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
