package br.com.acbueno.designpatters.templatemethod.sales.model.service.template;

import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;

public class BigCartDiscounts extends BestOfferTemplate {

  public BigCartDiscounts(Cart cart) {
   super(cart);
  }

  @Override
  public boolean isAppliable() {
    return regularItemsPrice > 1000;
  }

  @Override
  public void calibrateVariables() {
    priceFactor = 0.9;
  }

}
