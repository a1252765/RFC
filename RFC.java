public class RFC{

	static String rfc;
	static String homoclave;

	public static String calculaRFC(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento){
		rfc = ""+ apellidoPaterno.substring(0,2) +""+ apellidoMaterno.substring(0) +""+ fechaNacimiento.substring(2,4) +""+ fechaNacimiento.substring(5,7) +""+ fechaNacimiento.substring(8,10);
		rfc = rfc.toUpperCase();
		rfc = rfc +""+ CalculaHomoClave.dosPrimerosDigitos(nombre, apellidoPaterno, apellidoMaterno);
		rfc = rfc +""+ CalculaHomoClave.ultimoDigito(rfc);

		return rfc;
	}


}