package br.com.acbueno.designpatters.templatemethod.sales.model.service.template;

import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;

public class BlackFriday extends BestOfferTemplate {

  public BlackFriday(Cart cart) {
    super(cart);
  }

  @Override
  public boolean isAppliable() {
    return true;
  }

  @Override
  public void calibrateVariables() {
    priceFactor = 0.75d;
  }

}
