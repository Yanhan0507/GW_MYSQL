import java.io.*;
import java.net.*;

class TCPProxy {
 public static void main(String argv[]) throws Exception {
  String clientSentence;
  String capitalizedSentence;
  ServerSocket welcomeSocket = new ServerSocket(3306);

  while (true) {
   Socket connectionSocket = welcomeSocket.accept();
   System.out.println("Received Some Singals");
   BufferedReader inFromClient =
    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
   DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
   
   //clientSentence = inFromClient.readLine();
   //System.out.println("Received: " + clientSentence);
   //outToClient.writeBytes(clientSentence);
   
  // inFromClient.close();
  // connectionSocket.close();
  // welcomeSocket.close();
  }
 }
}