package SEMANA2103;
import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite a nota:");
		
		int nota = scanner.nextInt();
		
		if (nota>=90) {
			System.out.println("Aprovado,parabéns!");

		}
		else if (nota>=70) {
			System.out.println("Aprovado");
	
		}
		else {
			System.out.println("Reprovado");

		}
		scanner.close();
		
	}
}