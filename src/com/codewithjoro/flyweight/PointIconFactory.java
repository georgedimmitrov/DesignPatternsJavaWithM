package com.codewithjoro.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
   private Map<PointType, PointIcon> icons = new HashMap<>();

   public PointIcon getPointIcon(PointType type) {
      if (!icons.containsKey(type)) {
         PointIcon icon = new PointIcon(type, getIconImage(type));
         icons.put(type, icon);
      }

      return icons.get(type);
   }

   private byte[] getIconImage(PointType type) {
      switch (type) {
         case CAFE:
            return new byte[0];
         case HOSPITAL:
            return new byte[0];
         case RESTAURANT:
            return null;
         default:
            return new byte[0];
      }
   }
}
