package Aula08Semana2203;
	import java.util.Scanner;
public class EstaçãoAno06 {
public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	
 System.out.print("Digite um número de 1 a 12: ");
	 
	 int mes = scanner.nextInt();
	 switch (mes) {
	 case 1:
	 System.out.println("Esse mês a estação é verão");
	 		break;
	 		
	 case 2:
		 System.out.println("Esse mês a estação é verão");
		 	break;
	 case 3:
		 System.out.println("Esse mês a estação é verão do dia 1 ao dia 21; e do dia 21 ao dia 31 é outono ");
		 	break;
		 	
	 case 4:
		 System.out.println("Esse mês a estação é outono");
		 	break;
		 	
	 case 5:
		 System.out.println("Esse mês a estação é outono");
		 	break;
		 	
	 case 6:
		 System.out.println("Esse mês a estação é do dia 1 ao dia 21 é outono ; E inverno do dia 21 ao dia 30 ");
		 break;
		 
		 
	 case 7:
		 System.out.println("Esse mês a estação é inverno");
		 	break;
		 	
	 case 8:
		 System.out.println("Esse mês a estação é inverno");
		 	break;
		 	
	 case 9:
		 System.out.println("Esse mês a estação é inverno do dia 1 ao dia 23 de setembro; E do dia 23 ao dia 30 é primavera ");
		 	break; 
		 	
	 case 10:
		 System.out.println("Esse mês a estação é primavera");
		 	break;
		 	
	 case 11:
		 System.out.println("Esse mês a estação é primavera");
		 	break;
		 	
	 case 12:
		 System.out.println("Esse mês a estação é Verão do dia 21 de dezembro ao 31; E do dia 1 ao 21 é primavera");
		 	break;
		 
		 	
	default:	 	

	 }
	 scanner.close();
	 
}
	
}
