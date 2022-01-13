package br.com.acbueno.designpatters.abstractfactory.app.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserEjbService implements UserService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserEjbService.class);

  @Override
  public void save(String name) {
    LOGGER.info("Gravando " + name + " EJB's interface");
  }

  @Override
  public boolean delete(Integer id) {
    LOGGER.info("Deletando #" + id + " EJB's interface");
    return true;
  }



}
