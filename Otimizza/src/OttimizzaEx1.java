import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class OttimizzaEx1 {

	public static String main(String dataString){
		String[] datasP = {"dd/MM/yyyy","dd MM yyyy","ddMMyyyy","yyyy MM dd"};
		DateFormat d = new SimpleDateFormat();
		SimpleDateFormat sdfO = new SimpleDateFormat("yyyy MM");
		Date data = null;for(String teste : datasP) {
			try {
				d = new SimpleDateFormat(teste);
				 data = d.parse(dataString);
			} catch (Exception e) {}}DateFormat exibir = new SimpleDateFormat("yyyy MM");
        String dataF = exibir.format(data);
        return dataF;
        }
	public static void main(String[] args) {
	        String dataString = JOptionPane.showInputDialog("Digite a data: ");
	        String dataF = main(dataString);
	        System.out.println("Data formatada: " + dataF);
	        }
	}
