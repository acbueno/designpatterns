package br.com.acbueno.designpatters.state.logistics.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.state.logistics.DeliveryContext;

public class InTranstion implements PackageState {

  private static final Logger LOGGER = LoggerFactory.getLogger(InTranstion.class);
  private static InTranstion instance = new InTranstion();

  private InTranstion() {

  }

  public static InTranstion getInstance() {
    return instance;
  }

  @Override
  public void updateState(DeliveryContext ctx) {
    LOGGER.info("Package is in transition !!");
    ctx.setCurrentState(OutForDelivery.getInstance());

  }



}
