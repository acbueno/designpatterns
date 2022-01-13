package br.com.acbueno.designpatters.decorator.model.decoretors;

import br.com.acbueno.designpatters.decorator.model.Drink;

public abstract class DrinkDecorator implements Drink {

  protected Drink drink;

  public DrinkDecorator(Drink drink) {
    this.drink = drink;
  }

}
