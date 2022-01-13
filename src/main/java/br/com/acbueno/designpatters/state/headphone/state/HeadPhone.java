package br.com.acbueno.designpatters.state.headphone.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.state.headphone.HeadPhoneState;

public class HeadPhone {

  private static final Logger LOGGER = LoggerFactory.getLogger(HeadPhone.class);
  private HeadPhoneState state;
  private boolean isOn;
  private boolean isPlaying;

  public HeadPhone() {
    this.isOn = false;
    this.isPlaying = false;
    state = OffState.getInstance();
  }

  public void onLongClick() {
    LOGGER.info("Long Click Pressed....");
    state.longClick(this);
  }

  public void onClick() {
    LOGGER.info("Click Pressed...");
    state.click(this);
  }

  public HeadPhoneState getState() {
    return state;
  }

  public void setState(HeadPhoneState state) {
    LOGGER.info(String.format("Changging from %s to %s",
        this.state.getClass().getSimpleName(),
        state.getClass().getSimpleName()));
    this.state = state;
  }

  public boolean isOn() {
    return isOn();
  }

  public void setOn(boolean isOn) {
    this.isOn = isOn;
  }

  public boolean isPlaying() {
    return isPlaying;
  }

  public void setPlaying(boolean isPlaying) {
    this.isPlaying = isPlaying;
  }

}
