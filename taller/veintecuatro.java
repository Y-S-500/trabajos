package taller;
import java.util.Scanner;
public class veintecuatro {

	public veintecuatro() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        if (num2 % 2 != 0) {
            int max = Math.max(num1, num2);
            int mcm = 0;
            
            for (int i = num2; ; i += num2) {
                if (i % num1 == 0 && i % num2 == 0) {
                    mcm = i;
                    break;
                }
            }
            
            System.out.println("El MCM de " + num1 + " y " + num2 + " es: " + mcm);
        } else {
            System.out.println("El segundo número debe ser impar para calcular el MCM.");
        }
        
        input.close();
    }


	}


