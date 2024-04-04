package SEMANA2803;

public class metodo03i {
	public static void main (String [] args ) {

		String texto = "Devils night - Kill switch";
		char caractere = 'a';
		System.out.println("Índice:" + texto.indexOf(caractere));
		System.out.println("Índice:" + texto.indexOf(caractere,10));
		System.out.println("Índice:" + texto.indexOf("Kill"));
		System.out.println("Índice:" + texto.indexOf("Java, 15")); 
}
}
