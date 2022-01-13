package br.com.acbueno.designpatters.templatemethod.sales.model.service.template;

import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;

public class FreeDelivery extends BestOfferTemplate {

  public FreeDelivery(Cart cart) {
     super(cart);
  }

  @Override
  public boolean isAppliable() {
    return regularItemsPrice > 500;
  }

  @Override
  public void calibrateVariables() {
    deliveryFactor = 0d;
  }

}
