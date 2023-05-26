package arreglos;

import java.util.Scanner;

//utilisando arreglos capturar 5 notas de 1 estudiante y calcular el promedio del estudiante
public class primer {

	public primer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado=0;
		double suma =0;
		int [] numero= new int [5];
	
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("ingrese las cinco notas"+i);
			numero [i]=teclado.nextInt();

		
			resultado +=(suma + numero[i])/5;
			
			
		}
		
//		resultado+=(numero[0]+numero[1]+numero[2]+numero[3]+numero[4] )/4;
		System.out.println("sus notas"+resultado);

	}

}
