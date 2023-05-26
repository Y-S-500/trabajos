package arreglos;
import java.util.Iterator;
import java.util.Scanner;
/*
 * todos los campos deven ser del  mismo tipo de datos 
 * arreglos int todos deven ser iguales
 * 1 . tipo de dato
 * 2. nombre de la variable
 * 3. new
 * 4. [longitud maxima de cajas]
 * 2 . una caja "[]"
 * ejemplo : int [] numero= new int [5];
 */
public class arrayArreglos {

	public arrayArreglos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numero= new int [5];
		String [] palabras = new String[6];
		/*
		 * para guardar valores 
		 * nombre del arreglo [posiscion]= valor a guardar
		 * ejemplo numero [0 ]=5
		 */
		numero [0 ]=5;
		numero [1 ]=15;
		numero [2 ]=66;
		numero [3 ]=10;
		numero [4 ]=54;
		
	
	  	System.out.println(numero [0]);
		System.out.println(numero [1]);
		System.out.println(numero [2]);
		System.out.println(numero [3]);
		System.out.println(numero [4]);
		
	 
		
		/*
		 * ejercicio para cargar los arreglos de un ciclo
		 */
		Scanner teclado  = new Scanner(System.in);
		 

		for ( int i =0; i<4 ;i++ ) {
			System.out.println("ingrese el valor de la posicion" + i);
			numero [i]=teclado.nextInt();
		}
		
		
		

	}

}
