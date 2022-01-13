package br.com.acbueno.designpatters.decorator.model.decoretors;

import br.com.acbueno.designpatters.decorator.model.Drink;

public class DoubleDrink extends DrinkDecorator {

  public DoubleDrink(Drink drink) {
    super(drink);
  }

  @Override
  public void server() {
    drink.server();
    drink.server();

  }

  @Override
  public Double getPrice() {
    return drink.getPrice() * 1.75d;
  }

}
