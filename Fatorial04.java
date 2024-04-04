package Aula08Semana2203;
		import java.util.Scanner;
public class Fatorial04 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número que deseja saber o resultado do fatorial dele: ");
		
		int Num = scanner.nextInt();
		int fatorial = scanner.nextInt();
		
		while  (Num >= 1) {
			fatorial = fatorial*(Num-1);
			
		Num--;
		
		}
		
		System.out.println(fatorial);
		scanner.close();
	
}
}

