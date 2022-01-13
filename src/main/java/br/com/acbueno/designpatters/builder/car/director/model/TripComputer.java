package br.com.acbueno.designpatters.builder.car.director.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Setter;

@Setter
public class TripComputer {

  private static final Logger LOGGER = LoggerFactory.getLogger(TripComputer.class);
  private Car car;

  public void showFuelLeve() {
    LOGGER.info(String.format("Fuel level: %d", car.getFuel()));
  }

  public void showStatus() {
    if(this.car.getEngine().isStarted()) {
      LOGGER.info("Carro ligado");
    } else {
      LOGGER.info("Carro desligado");
    }
  }

}
