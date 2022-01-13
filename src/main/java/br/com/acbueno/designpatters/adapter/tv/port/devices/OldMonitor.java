package br.com.acbueno.designpatters.adapter.tv.port.devices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.adapter.tv.port.interfaces.VGA;

public class OldMonitor implements VGA {

  private static final Logger LOGGER = LoggerFactory.getLogger(OldMonitor.class);

  @Override
  public void setImage(String image) {
    LOGGER.info(">>> This is your video: " + image);
  }

}
