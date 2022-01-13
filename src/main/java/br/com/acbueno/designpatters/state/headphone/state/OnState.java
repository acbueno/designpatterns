package br.com.acbueno.designpatters.state.headphone.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.state.headphone.HeadPhoneState;

public class OnState implements HeadPhoneState {

  private static final Logger LOGGER = LoggerFactory.getLogger(OnState.class);
  private static final HeadPhoneState instance = new OnState();

  private OnState() {
  }

  @Override
  public void click(HeadPhone headPhone) {
     headPhone.setPlaying(true);
     LOGGER.info("> Resume Player");
     headPhone.setState(PlayingState.getInstnace());
  }

  @Override
  public void longClick(HeadPhone headPhone) {
     headPhone.setOn(false);
     LOGGER.info("> Turning Off");
     headPhone.setState(OffState.getInstance());
  }

  public static HeadPhoneState getInstance() {
    return instance;
  }

}
