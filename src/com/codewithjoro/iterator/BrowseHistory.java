package com.codewithjoro.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
   private List<String> urls = new ArrayList<>();

   public void push(String url) {
      urls.add(url);
   }

   public void pop() {
      int lastIndex = urls.size() - 1;
      String lastUrl = urls.get(lastIndex);
      urls.remove(lastUrl);
   }

   public Iterator<String> createIterator() {
      return new ListIterator<>(this);
   }

   public class ListIterator<String> implements Iterator<String> {
      private BrowseHistory history;
      private int index;

      public ListIterator(BrowseHistory history) {
         this.history = history;
      }

      @Override
      public boolean hasNext() {
         return index < history.urls.size();
      }

      @Override
      public String current() {
         return (String) history.urls.get(index);
      }

      @Override
      public void next() {
         index++;
      }
   }
}
