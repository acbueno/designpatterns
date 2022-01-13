package br.com.acbueno.designpatters.command.lights;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhillipsHueLight implements GenericLight {

  private static final Logger LOGGER = LoggerFactory.getLogger(PhillipsHueLight.class);

  @Override
  public void turnOn() {
    LOGGER.info("The PhillipsHueLight is On");
  }

  @Override
  public void turnOff() {
    LOGGER.info("The PhillipsHueLight is Off");
  }

}
