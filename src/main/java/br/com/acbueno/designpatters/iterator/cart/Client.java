package br.com.acbueno.designpatters.iterator.cart;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {

    Cart cart = new Cart(
        new Product("TV", 1000d),
        new Product("Shoe", 59.99),
        new Product("Cup" , 0.4));

    for (Product product : cart) {
      LOGGER.info(String.format("%s = %2f", product.getDesc(),
          product.getValue()));
    }

    Stream<Product> stream = StreamSupport.stream(cart.spliterator(), false);
    Double sum = stream.reduce(0d, (acc, prod) -> acc + prod.getValue(),
        Double::sum);
    LOGGER.info(sum.toString());
  }

}
