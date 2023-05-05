
package taller;

/*
 *  El profesor de una materia desea conocer la cantidad de sus alumnos que no 
tienen derecho al examen de nivelación.
- Diseñe un pseudocódigo que lea las calificaciones obtenidas en las 5 unidades por 
cada uno de los 40 alumnos y escriba la cantidad de ellos que no tienen derecho al 
examen de nivelación
 */
import java.util.Scanner;


	/*
	 *  El profesor de una materia desea conocer la cantidad de sus alumnos que no 
	tienen derecho al examen de nivelación.
	- Diseñe un pseudocódigo que lea las calificaciones obtenidas en las 5 unidades por 
	cada uno de los 40 alumnos y escriba la cantidad de ellos que no tienen derecho al 
	examen de nivelación
	 */

	public class desimo {

	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int notas;
	        int estudiantes = 0;
	        int aprobados = 0;

	        while (estudiantes < 40) {
	            System.out.print("Ingrese las 5 calificaciones del estudiante " + (estudiantes + 1) + " separadas por espacios: ");
	            double suma = 0;
	            for (int i = 0; i < 5; i++) {
	                notas = teclado.nextInt();
	                suma += notas;
	            }
	            double promedio = suma / 5.0;
	            if (promedio < 3.0) {
	                System.out.println("El estudiante " + (estudiantes + 1) + " no tiene derecho al examen de nivelación");
	            } else {
	            	System.out.println("El estudiante " + (estudiantes + 1) + "  tiene derecho al examen de nivelación");
	                aprobados++;
	            }
	            estudiantes++;
	        }

	        System.out.println("La cantidad de alumnos que tienen derecho al examen de nivelación es: " + aprobados);
	    }
	}

