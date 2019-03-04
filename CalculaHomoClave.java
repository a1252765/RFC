import java.util.*;

public class CalculaHomoClave{

	static HomoClave anexos = new HomoClave();

	public static String dosPrimerosDigitos(String nombre, String apellidoPaterno, String apellidoMaterno){
		String dosprimerosdigitos;
		String nombrecompleto;
		StringBuilder nombrenumerico = new StringBuilder();
		int acumulador = 0;

			nombrecompleto = nombre + apellidoPaterno + apellidoMaterno; 
			nombrecompleto = nombrecompleto.toUpperCase();

			nombrenumerico.append("0");

			for (int i=0; i < nombrecompleto.length(); i++) //revisar si hace falta el - 1 ///////////////////////////IMPORTANTE
				nombrenumerico.append(anexos.anexo1.get(""+nombrecompleto.charAt(i)));

			for(int i=0; i < nombrenumerico.length() - 1; i += 2 ) 
				acumulador = acumulador + ((Integer.parseInt(""+nombrenumerico.charAt(i))*10) + Integer.parseInt(""+nombrenumerico.charAt(i+1)))* Integer.parseInt(""+nombrenumerico.charAt(i+1));
		
		acumulador = acumulador%1000;

		dosprimerosdigitos = anexos.anexo2.get(acumulador/34) + anexos.anexo2.get(acumulador%34);

		return dosprimerosdigitos;
	}

	public static String ultimoDigito(String rfc){
		
		String ultimodigito;
		StringBuilder rfcnumerico = new StringBuilder();
		int suma = 0, pi = 13;

			for(int i=0; i < rfc.length(); i++)
				rfcnumerico.append( anexos.anexo3.get(""+rfc.charAt(i)));

			for(int i=0; i< rfc.length(); i += 2)
			{
				suma = suma + ((Integer.parseInt(""+rfcnumerico.charAt(i)) * 10) + Integer.parseInt(""+rfcnumerico.charAt(i+1)))* pi;
				pi--;
			}

			if(suma%11 != 0 ){
				suma = 11 - (suma % 11);
					if (suma == 10)
						rfc += "A";
			else
				rfc+= "0";
			}


		return ultimodigito;
	}
}