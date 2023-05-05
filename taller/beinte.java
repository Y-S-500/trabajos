package taller;
import java.util.Scanner;
/*
 * . Leer 2 números donde el primer número es la base y segundo es el exponente:
- Imprimir el resultado mediante multiplicaciones.
 */
public class beinte {

	public beinte() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =  new Scanner(System.in);
		
		int resultado =0;
		int e =0 ;
		int n=0;

		System.out.println("ingrese el numero exponente :");
		e = teclado.nextInt();
		System.out.println("ingrese el numero base :");
		n = teclado.nextInt();
		for (int i = 0 ; i <= e ;i++) {
		
			
			resultado += n^e;
			System.out.println(" resultado :" + resultado);
			
			
		};
	}

}
