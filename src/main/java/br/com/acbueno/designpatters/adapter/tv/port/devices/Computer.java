package br.com.acbueno.designpatters.adapter.tv.port.devices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.adapter.tv.port.interfaces.HDMI;

public class Computer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Computer.class);

  private HDMI port;

  public void connectPort(HDMI screen) {
    LOGGER.info("Connecting on HDMI port...");
    this.port = screen;
  }

  public void sendImageAndSound(String image, String sound) {
    if(port == null) {
      LOGGER.info("Connect a HDMI cable first");
    } else {
      port.setImage(image);
      port.setSound(sound);
    }
  }

}
