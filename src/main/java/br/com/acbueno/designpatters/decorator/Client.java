package br.com.acbueno.designpatters.decorator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.decorator.model.Drink;
import br.com.acbueno.designpatters.decorator.model.Expresso;
import br.com.acbueno.designpatters.decorator.model.Tea;
import br.com.acbueno.designpatters.decorator.model.decoretors.DoubleDrink;
import br.com.acbueno.designpatters.decorator.model.decoretors.Milk;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void order(String name, Drink drink) {
    LOGGER.info("Order serviço " + name);
    drink.server();
    LOGGER.info(drink.getPrice().toString());

    LOGGER.info("---------");

  }

  public static void main(String[] args) {
    order("Expresso", new Expresso());
    order("Tea", new Tea());
    order("Longo", new DoubleDrink(new Expresso()));
    order("Cafe au Lait", new Milk(new Expresso()));
    order("Chá Inglês", new Milk(new Tea()));
  }

}
