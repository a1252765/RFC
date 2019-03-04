import java.util.Scanner;
import java.util.*;

public class CalculoRFC{


	public static void main(String args[]){

	char numero;
	Scanner get = new Scanner(System.in);
	Persona persona = new Persona(Captura.capturaString("Nombre: "), Captura.capturaString("Apellido Paterno: "),Captura.capturaString("Apellido Materno: "),Captura.capturaString("Fecha de Nacimiento YYYY/MM/DD: "));
	System.out.println();
	System.out.println("RFC: "+ persona.rfc);
	
	do{
			System.out.println("Presione 1 para calcular otro RFC o 2 para salir del programa.");
		    numero = get.next().charAt(0);
			switch(numero){
				case '1': 
					Persona persona2 = new Persona(Captura.capturaString("Nombre: "), Captura.capturaString("Apellido Paterno: "),Captura.capturaString("Apellido Materno: "),Captura.capturaString("Fecha de Nacimiento YYYY/MM/DD: "));
					System.out.println("RFC: "+persona2.rfc);
					System.out.println();
					break;
				
			
				default: 
					break;
			}

		}while(numero!='2');

	}

}