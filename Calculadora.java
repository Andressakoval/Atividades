package SEMANA2203;
	import java.util.Scanner;
public class Calculadora {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número : ");
		float num1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo número : ");
		float num2= scanner.nextFloat();
		
		System.out.println("Escolha uma operação : ");
		System.out.println("1. Adição");
		System.out.println("2. Substração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.print("Opção: ");
		
		int ops = scanner.nextInt();
		float Resultado = 0;
		
		switch (ops) {
		
		case 1:
			Resultado = num1 + num2;
			break;
			
		case 2: 
			Resultado = num1 - num2;
			break;
			
		case 3:
			Resultado = num1 * num2;
			break;
			
		case 4:
			Resultado = num1 / num2;
			break;
			
		default:
            System.out.println("Opção inválida!");
    					
		}
		
		System.out.println("Resultado: " + Resultado);
		
		scanner.close();
	}
}
