package br.com.acbueno.designpatters.builder.restaurant.functional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.builder.restaurant.fluent.model.Size;
import br.com.acbueno.designpatters.builder.restaurant.functional.model.Pasta;

public class Cliente {

  private static final Logger LOGGER = LoggerFactory.getLogger(Cliente.class);

  public static void main(String[] args) {
    Pasta p1 = new Pasta.Builder(Size.LARGE).build();
    LOGGER.info(p1.toString());

    Pasta p2 = new Pasta.Builder(Size.SMALL)
        .withToppings("Bacon", "Cebolo", "Alho")
        .withSauces("Molho Branco")
        .withCheese()
        .build();
    LOGGER.info(p2.toString());

    Pasta p3 = new Pasta.Builder(Size.STANDARD)
        .withToppings("carne", "cebola", "frango" , "ervilha")
        .withSauces("Molho vermelho")
        .withCheese()
        .withPepper()
        .build();
    LOGGER.info(p3.toString());

  }

}
