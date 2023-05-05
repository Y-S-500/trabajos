package taller;
import java.util.Scanner;

public class quinto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nobreros;
        int horas;
        int extras;
        double tasaHoraria = 10; // Tasa hor1aria de $10
        
        System.out.println("Ingrese el número de obreros:");
        nobreros = teclado.nextInt();
        
        for (int i = 1; i <= nobreros; i++) {
            System.out.println("Ingrese las horas trabajadas por el obrero " + i + ":");
            horas = teclado.nextInt();
            
            if (horas > 40) {
                System.out.println("Se realizaron horas extras.");
                extras = horas - 40;
                if (extras <= 8) {
                    double salarioSemanal = 40 * tasaHoraria + extras * 2 * tasaHoraria;
                    System.out.println("El salario semanal del obrero " + i + " es: $" + salarioSemanal);
                } else {
                    double salarioSemanal = 40 * tasaHoraria + 8 * 2 * tasaHoraria + (extras - 8) * 3 * tasaHoraria;
                    System.out.println("El salario semanal del obrero " + i + " es: $" + salarioSemanal);
                }
            } else {
                double salarioSemanal = horas * tasaHoraria;
                System.out.println("El salario semanal del obrero " + i + " es: $" + salarioSemanal);
            }
        }
        
        teclado.close();
    }
}
