import java.util.*;

public class HomoClave{

		Hashtable<String,String> 	 	anexo1 = new Hashtable<String,String>(); 
		Hashtable<String,String>		anexo2 = new Hashtable<String,String>();
		Hashtable<String,String> 	 	anexo3 = new Hashtable<String,String>();
		
	public HomoClave(){
		setAnexos();
	}


	public void setAnexos(){
		anexo1.put(" ", "00");		anexo2.put("0","1");		anexo3.put("0","00");
		anexo1.put("1", "01");		anexo2.put("1","2");		anexo3.put("1","01");
		anexo1.put("2", "02");		anexo2.put("2","3");		anexo3.put("2","02");
		anexo1.put("3", "03");		anexo2.put("3","4");		anexo3.put("3","03");
		anexo1.put("4", "04");		anexo2.put("4","5");		anexo3.put("4","04");
		anexo1.put("5", "05");		anexo2.put("5","6");		anexo3.put("5","05");
		anexo1.put("6", "06");		anexo2.put("6","7");		anexo3.put("6","06");
		anexo1.put("7", "07");		anexo2.put("7","8");		anexo3.put("7","07");
		anexo1.put("8", "08");		anexo2.put("8","9");		anexo3.put("8","08");
		anexo1.put("9", "09");		anexo2.put("9","A");		anexo3.put("9","09");
		anexo1.put("&", "10");		anexo2.put("10","B");		anexo3.put("A","10");
		anexo1.put("A", "11");		anexo2.put("11","C");		anexo3.put("B","11");
		anexo1.put("B", "12");		anexo2.put("12","D");		anexo3.put("C","12");
		anexo1.put("C", "13");		anexo2.put("13","E");		anexo3.put("D","13");
		anexo1.put("D", "14");		anexo2.put("14","F");		anexo3.put("E","14");
		anexo1.put("E", "15");		anexo2.put("15","G");		anexo3.put("F","15");
		anexo1.put("F", "16");		anexo2.put("16","H");		anexo3.put("G","16");
		anexo1.put("G", "17");		anexo2.put("17","I");		anexo3.put("H","17");
		anexo1.put("H", "18");		anexo2.put("18","J");		anexo3.put("I","18");
		anexo1.put("I", "19");		anexo2.put("19","K");		anexo3.put("J","19");
		anexo1.put("J", "21");		anexo2.put("20","L");		anexo3.put("K","20");
		anexo1.put("K", "22");		anexo2.put("21","M");		anexo3.put("L","21");
		anexo1.put("L", "23");		anexo2.put("22","N");		anexo3.put("M","22");
		anexo1.put("M", "24");		anexo2.put("23","P");		anexo3.put("N","23");
		anexo1.put("N", "25");		anexo2.put("24","Q");		anexo3.put("&","24");
		anexo1.put("O", "26");		anexo2.put("25","R");		anexo3.put("O","25");
		anexo1.put("P", "27");		anexo2.put("26","S");		anexo3.put("P","26");
		anexo1.put("Q", "28");		anexo2.put("27","T");		anexo3.put("Q","27");
		anexo1.put("R", "29");		anexo2.put("28","U");		anexo3.put("R","28");
		anexo1.put("S", "32");		anexo2.put("29","V");		anexo3.put("S","29");
		anexo1.put("T", "33");		anexo2.put("30","W");		anexo3.put("T","30");
		anexo1.put("U", "34");		anexo2.put("31","X");		anexo3.put("U","31");
		anexo1.put("V", "35");		anexo2.put("32","Y");		anexo3.put("V","32");
		anexo1.put("W", "36");		anexo2.put("33","Z");		anexo3.put("W","33");
		anexo1.put("X", "37");									anexo3.put("X","34");
		anexo1.put("Y", "38");									anexo3.put("Y","35");
		anexo1.put("Z", "39");									anexo3.put("Z","36");
		anexo1.put("Ñ", "40");									anexo3.put("","37");
																anexo3.put("Ñ","38");

	}
}