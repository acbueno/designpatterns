package br.com.acbueno.designpatters.state.headphone.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.state.headphone.HeadPhoneState;

public class OffState implements HeadPhoneState {

  private static final Logger LOGGER = LoggerFactory.getLogger(OffState.class);
  private static final HeadPhoneState instance = new OffState();

  private OffState() {
  }

  public static HeadPhoneState getInstance() {
    return instance;
  }

  @Override
  public void click(HeadPhone headPhone) {
  }

  @Override
  public void longClick(HeadPhone headPhone) {
    headPhone.setOn(true);
    LOGGER.info("> Turning On");
    headPhone.setState(OnState.getInstance());
  }

}
