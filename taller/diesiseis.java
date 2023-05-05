package taller;

/*
 * Leer un número (n) e imprimir la sumatoria de 1 hasta n
 */

import java.util.Scanner;
public class diesiseis {

	public diesiseis() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		int resultado=0;
		int contador=0;
		
		System.out.println("ingrese un numer"  );
		int n = teclado.nextInt();
		for(int i =1;  i <= n ; i++) {
			
			resultado += i ;
			
			System.out.println("respuesta" + resultado);
			
			
			
		};
	}

}
