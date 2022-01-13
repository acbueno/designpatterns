package br.com.acbueno.designpatters.templatemethod.sales.model.service.template;

import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;

public class SpecialClient extends BestOfferTemplate {

  public SpecialClient(Cart cart) {
    super(cart);
  }

  @Override
  public boolean isAppliable() {
    return cart.getBuyer().isSpecialClient();
  }

  @Override
  public void calibrateVariables() {
   priceFactor = 0.85d;
   deliveryFactor = 0.5d;
  }

}
