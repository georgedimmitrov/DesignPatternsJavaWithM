package com.codewithjoro.adapter;

import com.codewithjoro.adapter.thirdPartyFilters.Caramel;

public class CaramelAdapter implements Filter {
   private Caramel caramel;

   public CaramelAdapter(Caramel caramel) {
      this.caramel = caramel;
   }

   @Override
   public void apply(Image image) {
      caramel.init();
      caramel.render(image);
   }
}
