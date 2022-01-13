package br.com.acbueno.designpatters.state.logistics.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.state.logistics.DeliveryContext;

public class Delivery implements PackageState {

  private static final Logger LOGGER = LoggerFactory.getLogger(Delivery.class);
  private static Delivery instance = new Delivery();

  private Delivery() {
  }

  public static Delivery getInstance() {
    return instance;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    LOGGER.info("Package is delivered!!");
  }

}
