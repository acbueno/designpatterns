package br.com.acbueno.designpatters.templatemethod.sales.model.service.template;

import br.com.acbueno.designpatters.strategy.payment.model.Item;
import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;

public abstract class BestOfferTemplate {

  protected Cart cart;
  protected Double regularItemsPrice;
  protected Double deliverTax;
  protected Double priceFactor;
  protected Double deliveryFactor;

  public BestOfferTemplate(Cart cart) {
    this.cart = cart;
    regularItemsPrice = calculateRegularItemsPrice();
    deliverTax = calculateDeliveryTax();
    priceFactor = 1d;
    deliveryFactor = 1d;
  }

  protected Double calculateDeliveryTax() {
    Integer distance = cart.getBuyer().getDistance();
    Double totalWeight = cart.getItems().stream()
        .reduce(0d, (acc, item) -> acc + item.getWeigth(), Double::sum);
    return (distance * totalWeight) / 100;
  }

  public Double calculateRegularItemsPrice() {
    return cart.getItems().stream().reduce(0d, (acc, Item) -> acc + Item.getValue(), Double::sum);
  }

  public Double calculateOffer(Cart cart) {
    calibrateVariables();

    return (regularItemsPrice * priceFactor) + (deliverTax * deliveryFactor);
  }

  public abstract boolean isAppliable();

  public abstract void calibrateVariables();

}
