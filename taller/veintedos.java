package taller;
import java.util.Scanner;
public class veintedos {
	/*
	 * eer dos números e imprimir el mínimo común múltiplo.
	 */

	public veintedos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        int max = Math.max(num1, num2);
        int mcm = 0;
        
        for (int i = max; ; i += max) {
            if (i % num1 == 0 && i % num2 == 0) {
                mcm = i;
                break;
            }
        }
        
        System.out.println("El MCM de " + num1 + " y " + num2 + " es: " + mcm);
        
        input.close();
    }

}
	
		


	


