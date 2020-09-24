package com.codewithjoro.facade;

public class NotificationServer {
   // connect() -> Connection
   // authenticate(appID, key) - AuthToken
   // send(authToken, message, target)
   // connection.disconnect();

   public Connection connect(String ipAddress) {
      return new Connection();
   }

   public AuthToken authenticate(String appId, String key) {
      return new AuthToken();
   }

   public void send(AuthToken token, Message message, String targetDevice) {
      System.out.println("Sending the message: " + message.getContent() + "; to device with ip: " + targetDevice);
   }
}
