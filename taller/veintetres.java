package taller;
import java.util.Scanner;
/*
 * Leer dos números:
- Si el primer número es par imprimir el máximo común divisor.
 */

public class veintetres {

	public veintetres() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        if (num1 % 2 == 0) {
            int mcd = 0;
            
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    mcd = i;
                }
            }
            
            System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
        } else {
            System.out.println("El primer número debe ser par para calcular el MCD.");
        }
        
        input.close();
    }



	}


