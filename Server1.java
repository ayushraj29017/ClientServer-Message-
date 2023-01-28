// import java.net.*;
// import java.io.*;
// public class Server1{
//     public static void main(String[] args) throws Exception
//     {
//         BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//         DatagramSocket dsock = new DatagramSocket();
//         InetAddress address = InetAddress.getLocalHost();
//         System.out.println("connection established");
//         while(true)
//         {
//             System.out.println("enter the message");
//             String str;
//             str = buff.readLine();
//             byte[] arr = str.getBytes();
//             DatagramPacket dpack = new DatagramPacket(arr,arr.length,address,2000);
//             dsock.send(dpack);
//         }
//     }
// }