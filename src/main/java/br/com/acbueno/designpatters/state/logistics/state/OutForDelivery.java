package br.com.acbueno.designpatters.state.logistics.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.state.logistics.DeliveryContext;

public class OutForDelivery implements PackageState {

  private static final Logger LOGGER = LoggerFactory.getLogger(OutForDelivery.class);
  private static OutForDelivery instance = new OutForDelivery();

  private OutForDelivery() {
  }

  public static OutForDelivery getInstance() {
    return instance;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    LOGGER.info("Package is out of delivery !!");
    ctx.setCurrentState(Delivery.getInstance());
  }

}
