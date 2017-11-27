import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        
        try {
        	
            Socket s = new Socket("localhost", 1234);
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            
            pw.println("Hello from Client!");
            
            String str = br.readLine();
            
            System.out.println(str);
            
            br.close();
            isr.close();
            is.close();
            
            pw.close();
            os.close();
            
            s.close();
            
        } catch (IOException ex) {
        	
            System.out.println(ex);
            
        }
        
    }
    
}
