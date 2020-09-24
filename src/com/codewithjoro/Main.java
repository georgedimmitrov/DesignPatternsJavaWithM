package com.codewithjoro;

import com.codewithjoro.proxy.EbookProxy;
import com.codewithjoro.proxy.Library;
import com.codewithjoro.proxy.LoggingEbookProxy;

public class Main {

   public static void main(String[] args) {
      Library library = new Library();
      String[] fileNames = {"a", "b", "c"};
      for (String fileName : fileNames)
         library.add(new LoggingEbookProxy(fileName));

      library.openEbook("a");
      library.openEbook("b");
   }

}
