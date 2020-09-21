package com.codewithjoro.command.editor;

public interface UndoableCommand extends Command {
   void unexecute();
}
