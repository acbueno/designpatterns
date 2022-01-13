package br.com.acbueno.designpatters.state.headphone.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.state.headphone.HeadPhoneState;

public class PlayingState implements HeadPhoneState {

  private static final Logger LOGGER = LoggerFactory.getLogger(PlayingState.class);
  private static final HeadPhoneState instance = new PlayingState();

  private PlayingState() {
  }

  public static HeadPhoneState getInstnace() {
    return instance;
  }

  @Override
  public void click(HeadPhone headPhone) {
    headPhone.setPlaying(false);
    LOGGER.info("> Stop Player");
    headPhone.setState(OnState.getInstance());
  }

  @Override
  public void longClick(HeadPhone headPhone) {
    headPhone.setOn(false);
    LOGGER.info("> Turning Off");
    headPhone.setState(OffState.getInstance());
  }

}
