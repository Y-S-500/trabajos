package arreglos;

import java.util.Scanner;

/*
 * lmacenar en un vector los números de 1 hasta n y posteriormente imprimir los 
números menores a 500.
 */
public class cincoff {

	public cincoff() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int menor;
		int[] numeros;
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        n = teclado.nextInt();

        numeros = new int[n];
        
        
        for(int i = 0; i < n ; i++) {
        	 numeros[i] = i + 1;
        	 
        	
        }
        for(int i = 0; i <n; i++) {}
        menor = numeros[0];
         if (numeros[i] < n ) {
        	 menor = numeros[i];
        	 System.out.println(  "no  es primo"+ numeros[i]);
		} else{
            if (a[i] > menor){
                menor = menor;
        
            	}
            
		}
}         
