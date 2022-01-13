package br.com.acbueno.designpatters.bridge.backend.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.bridge.backend.model.User;

public class UserPostgresDao implements UserDao {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserPostgresDao.class);

  @Override
  public void save(User user) {
    LOGGER.info("Salvando dados do usuário no Postgres Database");
  }

}
