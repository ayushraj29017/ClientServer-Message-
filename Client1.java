// import java.net.*;
// import java.io.*;
// public class Client1
// {
//     public static void main(String[] args) throws Exception{
//         DatagramSocket dsock = new DatagramSocket(2000);
//         while(true)
//         {
//             byte arr1[] = new byte[100];
//             DatagramPacket dpack = new DatagramPacket(arr1,arr1.length);
//             dsock.receive(dpack);
//             System.out.println("message received from server");
//             System.out.println(new String(arr1));
//         }
//     }
// }