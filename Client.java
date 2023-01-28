import java.io.*;
import java.net.*;
public class Client {
public static void main(String [] args) throws Exception
{
    Socket sock = new Socket ("127.0.0.1",4000);
BufferedReader keyread = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String fname = keyread.readLine();
OutputStream ostream = sock.getOutputStream();
PrintWriter pwrite = new PrintWriter(ostream,true);
pwrite.println(fname);
InputStream istream = sock.getInputStream();
BufferedReader contentread = new BufferedReader(new InputStreamReader(istream));
String str;
if((str = contentread.readLine())!=null)
{
    System.out.println(str);
}
pwrite.close();
contentread.close();
keyread.close();
}
}