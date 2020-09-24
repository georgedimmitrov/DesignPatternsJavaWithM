package com.codewithjoro.facade;

public class NotificationService {
   public void send(String message, String target) {
      NotificationServer server = new NotificationServer();
      Connection connection = server.connect("1234");
      AuthToken authToken = server.authenticate("appId", "key");
      server.send(authToken, new Message(message), target);
      connection.disconnect();
   }
}
