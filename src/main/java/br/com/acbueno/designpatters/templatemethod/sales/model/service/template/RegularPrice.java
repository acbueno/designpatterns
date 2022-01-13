package br.com.acbueno.designpatters.templatemethod.sales.model.service.template;

import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;

public class RegularPrice extends BestOfferTemplate {

  public RegularPrice(Cart cart) {
    super(cart);
  }

  @Override
  public boolean isAppliable() {
    return true;
  }

  @Override
  public void calibrateVariables() {
    //  Nothing to adjust!
  }

}
