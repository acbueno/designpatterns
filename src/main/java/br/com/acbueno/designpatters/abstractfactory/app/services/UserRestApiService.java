package br.com.acbueno.designpatters.abstractfactory.app.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserRestApiService implements UserService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserRestApiService.class);

  @Override
  public void save(String name) {
    LOGGER.info("Gravando " + name + "Rest's interface");
  }

  @Override
  public boolean delete(Integer id) {
    LOGGER.info("Deletando User #" + id + " Rest's interface");
    return true;
  }

}
