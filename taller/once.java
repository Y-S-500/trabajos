package taller;
import java.util.Scanner;
/*
 * . Diseñe un diagrama que lea los 2,500,000 votos otorgados a los 3 candidatos a 
gobernador e imprima el número del candidato ganador y su cantidad de votos.
 */
public class once {

	public once() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner teclado = new Scanner(System.in);
		   int votos=0;
		   int votacion,v1=0,v2=0,v3=0;
		 
		   while(votos!=2500000) {
			   votos++;
			   
			   System.out.println("escoja su candidato");
			   System.out.println("1: candidato");
			   System.out.println("2: candidato");
			   System.out.println("3:  candidato");
			   votacion=teclado.nextInt();
			   switch(votacion){
			   case 1:
				   v1=v1+1;
				   break;
			   case 2:
				   v2=v2+1;
				   break;
			   case 3:
				   v2=v2+1;
				   break;
			   default:
				   System.out.println("opcion no valida");
			   
			   }
			   System.out.println("primer candidato "+ v1);
			   System.out.println("segundo candidato "+ v2);
			   System.out.println("tercer candidato "+ v3);
		   }
		   
		   

	}

}
