package br.com.acbueno.designpatters.bridge.backend.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.bridge.backend.dao.UserDao;
import br.com.acbueno.designpatters.bridge.backend.model.User;

public class UserEJB extends UserService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserEJB.class);

  public UserEJB(UserDao dao) {
    super(dao);
  }

  public void save(User user) {
    LOGGER.info("Incinando operacao da gravacao EJB Protocol!");
    dao.save(user);
  }

}
