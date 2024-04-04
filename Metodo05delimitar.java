package SEMANA2803;

public class Metodo05delimitar {
	public static void main (String [] args ) {
		String str = "Flores,_ De,_ jardim";
		String[] partes = str.split(",");
		for (String parte : partes) {
            System.out.println(parte);
        }
}
}