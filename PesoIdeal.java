package SEMANA2203;
	import java.util.Scanner;
	
public class PesoIdeal {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua altura em metros : ");
		double altura = scanner.nextDouble();

		System.out.println(" Digite o seu sexo f para feminino ou m para masculino: ");
		char sexo = scanner.next().charAt(0);
		
		double pesoIdeal = 0;
		
		if (sexo == 'm'){
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo == 'f'){
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		else{
			System.out.println("Sexo não reconhecido");
		}
		 if (pesoIdeal != 0) {
			System.out.println("Seu peso ideal é:" + pesoIdeal + "kg");
		}
			scanner.close();



		
	}
	}
	
