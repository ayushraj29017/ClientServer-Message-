import java.io.*;
import java.net.*;
public class Client2{
    public static void main(String[] args) throws Exception
    {
        Socket sock = new Socket("127.0.01",4000);
        System.out.println("enter the file you want");
        BufferedReader keyread = new BufferedReader(new InputStreamReader(System.in));
        String fname = keyread.readLine();
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream,true);
        pwrite.println(fname);
        InputStream istream = sock.getInputStream();
        BufferedReader contentread = new BufferedReader(new InputStreamReader(istream));
        String str;
        while((str=contentread.readLine())!=null)
        {
            System.out.println(str);
        }
        pwrite.close();
        keyread.close();
        contentread.close();
    }
 }