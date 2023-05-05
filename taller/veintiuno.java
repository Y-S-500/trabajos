package taller;

import java.util.Scanner;

public class veintiuno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        // Calcular el MCD utilizando el algoritmo de Euclides
        int mcd = calcularMCD(num1, num2);

        // Mostrar el resultado
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es " + mcd);
    }

    // Función para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
