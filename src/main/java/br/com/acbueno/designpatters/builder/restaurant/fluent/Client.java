package br.com.acbueno.designpatters.builder.restaurant.fluent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.builder.restaurant.fluent.model.Pasta;
import br.com.acbueno.designpatters.builder.restaurant.fluent.model.Size;
import br.com.acbueno.designpatters.builder.restaurant.fluent.model.builder.PastaBuilder;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    Pasta p1 = new PastaBuilder(Size.LARGE).now();
    LOGGER.info(p1.toString());

    Pasta p2 = new PastaBuilder(Size.SMALL)
        .withToppings("Bancon", "Cebola")
        .withSauces("Tomate")
        .withCheese()
        .now();
    LOGGER.info(p2.toString());

    Pasta p3 = new PastaBuilder(Size.STANDARD)
        .withToppings("Alho", "Oleo")
        .withSauces("Bolanhesa", "Queijo")
        .withCheese()
        .withPepper()
        .now();
    LOGGER.info(p3.toString());


  }

}
