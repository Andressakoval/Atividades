package SEMANA2203;
	import java.util.Scanner;
public class Batimentos {
	public static void main (String[] args) {
	Scanner dado  = new Scanner (System.in);
	
	System.out.print(" Digite sua idade: ");
	int idade = dado.nextInt();
	
	System.out.print(" Digite o seu batimento: ");
	int batimento = dado.nextInt();
	
	if(idade>60 && batimento>150) {
		System.out.println("URGENTE!");
	}
	else if(idade>60 && batimento<=150){
			System.out.println("Urgencia moderada");}
	else if(idade<=60 && batimento>150){
				System.out.println("Urgencia moderada");}
		
	else if(idade<=60 && batimento<=150){
					System.out.println("Nao urgente");
					
					dado .close();
	
}
}
}
