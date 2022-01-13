package br.com.acbueno.designpatters.decorator.model;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Expresso implements Drink {

  private static final Logger LOGGER = LoggerFactory.getLogger(Expresso.class);

  @Override
  public void server() {
    LOGGER.info("-- Adição 50ml de expresso");
  }

  @Override
  public Double getPrice() {
    return 1.5d;
  }

}
