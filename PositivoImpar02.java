package Aula08Semana2203;
	import java.util.Scanner;
public class PositivoImpar02 {
	public static void main (String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Digite um número:");
	
	float Num = scanner.nextFloat();
	
	
	 if (Num%2 == 0) {
		System.out.println("Esse número é par");

	} else {
		System.out.println("Esse número é ímpar");

	}
	scanner.close();
	}
}
