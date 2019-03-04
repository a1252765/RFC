import java.util.Scanner;

public class Captura{

	public static String capturaString(String mensaje){
		Scanner captura = new Scanner(System.in);
		System.out.println(mensaje);
		return(captura.nextLine());
	}

	public static int capturaInt(String mensaje){
		Scanner captura = new Scanner(System.in);
		System.out.println(mensaje);
		return(captura.nextInt());	
	}

	public static long capturalong(String mensaje){
		Scanner captura = new Scanner(System.in);
		System.out.println(mensaje);
		return(captura.nextLong());
	}

	public static float capturaFloat(String mensaje){
		Scanner captura = new Scanner(System.in);
		System.out.println(mensaje);
		return(captura.nextFloat());
	}
}