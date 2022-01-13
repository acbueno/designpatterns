package br.com.acbueno.designpatters.state.logistics.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.state.logistics.DeliveryContext;

public class Acknowledged implements PackageState {


  private static final Logger LOGGER = LoggerFactory.getLogger(Acknowledged.class);
  private static Acknowledged instance = new Acknowledged();

  private Acknowledged() {

  }

  public static Acknowledged geInstance() {
    return instance;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    LOGGER.info("Package is acknowledged !!");
    ctx.setCurrentState(Shipped.getInstance());
  }

}
