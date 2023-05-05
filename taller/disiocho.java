package taller;
import java.util.Scanner;
/*
 * . Imprimir la tabla de multiplicar del 5.
 */
public class disiocho {

	public disiocho() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int contador=0;
		
		for(int i=1; i<= 10;i++) {
			
			int resultado = i * 5;
			System.out.println("5 x " + i + " = " + resultado);
			
			
		}
	}

}
