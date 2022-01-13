package br.com.acbueno.designpatters.command.lights;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XiamiLigth implements GenericLight {

  private static final Logger LOGGER = LoggerFactory.getLogger(XiamiLigth.class);

  @Override
  public void turnOn() {
   LOGGER.info("The XiaomiLight is On");
  }

  @Override
  public void turnOff() {
    LOGGER.info("The XiaomiLight is Off");
  }

}
