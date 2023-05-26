package arreglos;

import java.util.Scanner;

/*
 * lmacenar en un vector los números de 1 hasta n.
 */
public class DOS {

	public DOS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] numeros = new int[100];
		   int  n;
		   int  numero =0;
		   Scanner teclado  = new Scanner(System.in);
			System.out.println("ingrese un numero");
			n = teclado.nextInt();
		  
	        // Almacenar los números del 1 al 100 en el arreglo
	        for (int i = 0; i < n; i++) {
	            numeros[i] = i + 1;
	        }

	        // Imprimir los números almacenados
	        for (int i = 0; i < n; i++) {
	            System.out.println(numeros[i]);
	        }
	    }
	}


