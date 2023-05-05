package taller;
/*
 * . Leer el multiplicando y el multiplicador y hallar el producto e imprimir la tabla
 */
import java.util.Scanner;
public class diesinueve {

	public diesinueve() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
 System.out.println("ingrese el numero");
        
        numero= teclado.nextInt();
		for(int i = 0; i<= 10;i++) { 
        
         int resultado = numero*i;
         System.out.println("m x " + i + " = " + resultado);
        
		}
		
	}

}
