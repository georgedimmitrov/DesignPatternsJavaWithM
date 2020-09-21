package com.codewithjoro.command;

import com.codewithjoro.command.framework.Command;

public class BlackAndWhiteCommand implements Command {
   @Override
   public void execute() {
      System.out.println("apply black and white filter");
   }
}
