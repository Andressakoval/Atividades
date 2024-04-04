package Aula08Semana2203;
	import java.util.Scanner;
public class DiaDaSemana03 {
 public static void main(String[] airgs) {
	 Scanner scanner = new Scanner (System.in);
	 
	 System.out.print("Digite um número de 1 a 7: ");
	 
	 int Dia = scanner.nextInt();
	 switch (Dia) {
	 case 1:
	 System.out.println("Esse dia é um final de semana");
	 	break;
	 		
	 case 2:
		 System.out.println("Esse é um dia útil");
		 	break;
	 case 3:
		 System.out.println("Esse é um dia útil");
		 	break;
		 	
	 case 4:
		 System.out.println("Esse é um dia útil");
		 	break;
		 	
	 case 5:
		 System.out.println("Esse é um dia útil");
		 	break;
		 	
	 case 6:
		 System.out.println("Esse é um dia útil");
		 	break;
		 	
	 case 7:
		 System.out.println("Esse dia é um final de semana");
		 	break;
		 	
	default:	 	
		 			 		
	  }
	 
	 scanner.close();
	 
 	}
 
	}
