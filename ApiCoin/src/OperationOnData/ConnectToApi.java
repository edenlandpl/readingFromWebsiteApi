/** ApiCoin
 * author - Dell
 * date - 24 wrz 2018
 * version - 
 */

package OperationOnData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class ConnectToApi {
	public void Connect() throws IOException {
	URL url = new URL("https://www.website.com/api");

    // Get the input stream through URL Connection
    URLConnection con = url.openConnection();
    InputStream is =con.getInputStream();
    
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	}
}
