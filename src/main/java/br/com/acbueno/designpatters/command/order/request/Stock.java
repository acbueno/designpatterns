package br.com.acbueno.designpatters.command.order.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.Getter;

@Getter
public class Stock {

  private static final Logger LOGGER = LoggerFactory.getLogger(Stock.class);
  private String name = "ABC";
  private int quantity = 10;

  public void buy() {
    LOGGER.info("Stock [ Name: " + getName()
    + " Quantity: " + getQuantity() + "] bought ");
  }

  public void sell() {
    LOGGER.info("Stock [Name: " + getName() +
    " Quantity: " + getQuantity() + "] sold");
  }


}
