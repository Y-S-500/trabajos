package taller;
/*
 * . Se tiene un conjunto de 1,000 tarjetas cada una contiene la información del censo 
para una persona:
- Número de censo,
- Sexo
- Edad
- Estado civil (a.- soltero, b. Casado, c. Viudo, d. Divorciado )
- Diseñe un pseudocódigo estructurado que lea todos estos datos, e imprima 
el número de censo de todas las jóvenes solteras que estén entre 16 y 21 
años
 */


	
import java.util.Scanner;

public class quinse {

   
            
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCenso;
        char sexo;
        int edad;
        char estadoCivil;
        int contador = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el número de censo:");
            numCenso = sc.nextInt();
            System.out.println("Ingrese el sexo (M/F):");
            sexo = sc.next().charAt(0);
            System.out.println("Ingrese la edad:");
            edad = sc.nextInt();
            System.out.println("Ingrese el estado civil (a.- soltero, b.- casado, c.- viudo, d.- divorciado):");
            estadoCivil = sc.next().charAt(0);

            if (sexo == 'F' && estadoCivil == 'a' && edad >= 16 && edad <= 21) {
                System.out.println("Número de censo de joven soltera: " + numCenso);
                contador++;
            }
        }

        System.out.println("Total de jóvenes solteras entre 16 y 21 años: " + contador);
    }


    
}
