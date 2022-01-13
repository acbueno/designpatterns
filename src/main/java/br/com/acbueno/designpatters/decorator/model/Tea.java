package br.com.acbueno.designpatters.decorator.model;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Tea implements Drink {

  private static final Logger LOGGER = LoggerFactory.getLogger(Tea.class);

  @Override
  public void server() {
    LOGGER.info("- Adição 100 m de chá");

  }

  @Override
  public Double getPrice() {
    return 1d;
  }

}
