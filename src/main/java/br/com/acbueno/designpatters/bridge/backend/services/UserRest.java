package br.com.acbueno.designpatters.bridge.backend.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.bridge.backend.dao.UserDao;
import br.com.acbueno.designpatters.bridge.backend.model.User;

public class UserRest extends UserService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserRest.class);

  public UserRest(UserDao dao) {
    super(dao);
  }

  @Override
  public void save(User user) {
    LOGGER.info("Inciando operacao gravacao de dados com protocolo Rest");
    dao.save(user);
  }

}
