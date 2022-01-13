package br.com.acbueno.designpatters.decorator.model.decoretors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.decorator.model.Drink;

public class Milk extends DrinkDecorator {

  private static final Logger LOGGER = LoggerFactory.getLogger(Milk.class);

  public Milk(Drink drink) {
   super(drink);
  }

  @Override
  public void server() {
   drink.server();
   LOGGER.info("- Adição de 30ml de Leite");

  }

  @Override
  public Double getPrice() {
    return drink.getPrice() + 0.5d;
  }

}
