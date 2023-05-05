package taller;
import java.util.Scanner;
/*
 *  Leer 2 números e Imprimir el producto del primer número con el segundo número 
por intermedio de sumas.
 */
public class diesisiete {

	public diesisiete() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int resultado;
		
		do {
			
			System.out.print("singres el primer numero");
			num1 = teclado.nextInt();
			System.out.print("singres el segundo numero");
			num2 = teclado.nextInt();
			
			resultado= num1 + num2;
			
			System.out.println("el  producto del primer nuymero "+ num1+ " es " +resultado);
			
			System.out.println("Presione 's' para continuar comprando o cualquier otra tecla para salir");

			teclado.nextLine(); // limpiar el buffer del teclado antes de leer la siguiente entrada

		} while (teclado.nextLine().equalsIgnoreCase("s"));
		

	
	
		teclado.close();
	}
		
	}

	
