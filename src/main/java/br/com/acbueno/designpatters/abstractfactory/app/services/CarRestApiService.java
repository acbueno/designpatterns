package br.com.acbueno.designpatters.abstractfactory.app.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarRestApiService implements CarService {

  private static final Logger LOGGER = LoggerFactory.getLogger(CarRestApiService.class);

  @Override
  public void save(String model) {
   LOGGER.info("Gravando " + model + " car rest's interface");
  }

  @Override
  public void update(String newModel) {
    LOGGER.info("Updating " + newModel + " Car Rest's interface");
  }

}
