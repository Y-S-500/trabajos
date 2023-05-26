package arreglos;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Almacenar en un vector los números de 1 hasta 100
 */
public class UNO {

	public UNO() {
		// TODO Auto-generated constructor stub
	}

	   public static void main(String[] args) {
	        int[] numeros = new int[100];

	        // Almacenar los números del 1 al 100 en el arreglo
	        for (int i = 0; i < 100; i++) {
	            numeros[i] = i + 1;
	        }

	        // Imprimir los números almacenados
	        for (int i = 0; i < 100; i++) {
	            System.out.println(numeros[i]);
	        }
	    }
	}


