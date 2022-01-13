package br.com.acbueno.designpatters.state.logistics.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.state.logistics.DeliveryContext;

public class Shipped implements PackageState {

  private static final Logger LOGGER = LoggerFactory.getLogger(Shipped.class);
  private static Shipped instnace = new Shipped();

  private Shipped() {
  }

  public static Shipped getInstance() {
    return instnace;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    LOGGER.info("Package is shipped !!");
    ctx.setCurrentState(InTranstion.getInstance());
  }

}
