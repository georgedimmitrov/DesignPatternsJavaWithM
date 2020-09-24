package com.codewithjoro.adapter;

import com.codewithjoro.adapter.thirdPartyFilters.Caramel;

public class CaramelAdapterTwo extends Caramel implements Filter {
   @Override
   public void apply(Image image) {
      init();
      render(image);
   }
}
