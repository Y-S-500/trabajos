package arreglos;
/*
 * . Almacenar en un vector los números de 1 hasta n y posteriormente imprimir los 
números primos.
 */

import java.util.Iterator;
import java.util.Scanner;

public class CUATRO {

	public CUATRO() {
		// TODO Auto-generated constructor stub
	}


		public static void main(String[] args) {
			
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

	        System.out.println("Números primos:");
	        for (int i = 0; i < n ; i++) {
	            if (numeros[i] % 2 == 0) {
	                System.out.println(  "es primo"+ numeros[i]);
	            }
	            
	        }
	        for (int i = 0; i < n ; i++) {
	        	 if (numeros[i] % 2 != 0) {
	        		 System.out.println(  "no  es primo"+ numeros[i]);
	             }
			}
	  
		
		
		
		

		
		
		
		
		}
}
			// TODO Auto-generated method stub
			
			
	        
	        
	        
	        
	        

		
	        
	    
	        


