import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        
        try {
        	
            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();
            
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            
            String str = br.readLine();
            
            System.out.println(str);
            
            pw.println("Hello from Server!");
            
            br.close();
            isr.close();
            is.close();
            
            pw.close();
            os.close();
            
            s.close();
            ss.close();
            
        } catch (IOException ex) {
        	
            System.out.println(ex);
            
        }
        
    }
    
}
