package br.com.acbueno.designpatters.abstractfactory.app.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarEjbService implements CarService {

  private static final Logger LOGGER = LoggerFactory.getLogger(CarEjbService.class);

  @Override
  public void save(String model) {
    LOGGER.info("Gravando " + model + " car EJB's interface");
  }

  @Override
  public void update(String newModel) {
    LOGGER.info("Updating " + newModel + " car through EJB's interface");
  }





}
