package com.codewithjoro.command;

import com.codewithjoro.command.framework.Command;

public class ResizeCommand implements Command {
   @Override
   public void execute() {
      System.out.println("resize");
   }
}
