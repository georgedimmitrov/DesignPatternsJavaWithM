package com.codewithjoro.chainOfResponsibility;

public abstract class Handler {
   private Handler next;

   public Handler(Handler next) {
      this.next = next;
   }

   public void handle(HttpRequest request) {
      boolean completelyHandled = doHandle(request);
      if (completelyHandled) {
         return;
      }

      if (next != null) {
         next.handle(request);
      }
   }

   public abstract boolean doHandle(HttpRequest request);
}
