import OperationOnData.*;
import Gui.*;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;



public class ApiCoin {

    public static void main(String[] args) throws IOException {
    	
    	 // Tutaj GUI programu, to poni¿ej /////  do przesuniêcia do osobnej klasy !!
        EventQueue.invokeLater(new Runnable() {
        	@Override
        	public void run() {
        		new GuiJframe();
        	}
        });
    	/////////////////////////////////////////////////////////////////
        // Make a URL to the web page
        URL url = new URL("https://www.cryptopia.co.nz/api/GetMarketOrders/$PAC_BTC/10");

        // Get the input stream through URL Connection
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();

        // Once you have the Input Stream, it's just plain old Java IO stuff.

        // For this case, since you are interested in getting plain-text web page
        // I'll use a reader and output the text content to System.out.

        // For binary content, it's better to directly read the bytes from stream and write
        // to the target file.

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        String wartosc05;
        String wartosc = null;;

        	// read each line and write to System.out
        while ((line = br.readLine()) != null) {
        	
        	// po wyszukaniu w "line" znaków 
        	StringTokenizer stringTokenizer = new StringTokenizer(line, ",:") ;
        	while(stringTokenizer.hasMoreTokens())
        	{
	            // pobieramy kolejne wartoœci String
        		String klucz = stringTokenizer.nextToken();
        		if (klucz.equalsIgnoreCase("\"Sell\"")) { // wy³apanie "Sell", aby zachowaæ ci¹gloœæ danych, tzn pary, dr
        			// drug¹ zmienn¹ tworzymy pust¹, dla pary z Sell 
	            	wartosc = "";
	            }
        		else {
	            wartosc = stringTokenizer.nextToken();
        		}
        		
	            // usuwamy niepotrzebne znaki, ka¿dy osobno dla poszczególnych zmiennych
	            String klucz01 = klucz.replace("{" , "");
	            klucz = klucz.replace("{" , "");
	            klucz = klucz.replace("\"", "");
	            klucz = klucz.replace("}", "");
	            klucz = klucz.replace("[", "");
	            klucz = klucz.replace("]", "");
	            wartosc = wartosc.replace("{" , "");
	            wartosc = wartosc.replace("\"", "");
	            wartosc = wartosc.replace("}", "");
	            wartosc = wartosc.replace("[", "");
	            wartosc = wartosc.replace("]", "");
	            
	            System.out.println(klucz + "  " + wartosc);
	            
	            // listArray - do przechowywania nieznanej wielkoœci tablicê
	            // albo inne kontenery
	            //////////////////////////////////////
	           
        	}
        }
    }
}