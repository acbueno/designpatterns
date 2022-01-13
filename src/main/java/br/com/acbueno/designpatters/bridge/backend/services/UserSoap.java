package br.com.acbueno.designpatters.bridge.backend.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.bridge.backend.dao.UserDao;
import br.com.acbueno.designpatters.bridge.backend.model.User;

public class UserSoap extends UserService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserSoap.class);

  public UserSoap(UserDao dao) {
    super(dao);
  }

  @Override
  public void save(User user) {
   LOGGER.info("Inciando operacao de gravaca no protocolo Soap");
   dao.save(user);
  }

}
