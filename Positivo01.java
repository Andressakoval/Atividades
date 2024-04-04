package Aula08Semana2203;
	import java.util.Scanner;
public class Positivo01 {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);	
		System.out.print("Digite um número:");
		
		float Num = scanner.nextFloat();
		
		
		 if (Num>0) {
			System.out.println("Esse número é positivo");

		} else {
			System.out.println("Esse número é negativo");

		}
		scanner.close();
	}
	
	}
