package br.com.acbueno.designpatters.adapter.tv.port.devices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.adapter.tv.port.interfaces.HDMI;

public class TV implements HDMI {

  private static final Logger LOGGER = LoggerFactory.getLogger(TV.class);

  @Override
  public void setImage(String image) {
    LOGGER.info(">>> This is your video: " + image);
  }

  @Override
  public void setSound(String sound) {
    LOGGER.info(">>> This is your sound: " + sound);
  }

}
