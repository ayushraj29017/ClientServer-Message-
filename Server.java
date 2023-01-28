import java.io.*;
import java.net.*;
public class Server{
    public static void main(String [] args) throws Exception{
ServerSocket sersock = new ServerSocket(4000);
System.out.println("ready for connection");
Socket sock = sersock.accept();
System.out.println("connection established");
InputStream istream = sock.getInputStream();
BufferedReader buff = new BufferedReader(new InputStreamReader(istream));
String fname = buff.readLine();
OutputStream ostream = sock.getOutputStream();
PrintWriter pwrite = new PrintWriter(ostream,true);
BufferedReader contentread = new BufferedReader(new FileReader(fname));
String str;
while((str=contentread.readLine())!=null)
{
    pwrite.println(str);
}
pwrite.close();
contentread.close();
ostream.close();
sersock.close();
istream.close();


    }
}