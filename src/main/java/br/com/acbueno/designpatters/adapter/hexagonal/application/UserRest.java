package br.com.acbueno.designpatters.adapter.hexagonal.application;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.adapter.hexagonal.core.model.User;
import br.com.acbueno.designpatters.adapter.hexagonal.core.ports.UserRepository;
import br.com.acbueno.designpatters.adapter.hexagonal.core.usecases.UserService;
import br.com.acbueno.designpatters.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

public class UserRest {

  private UserService userFacade;
  private static final Logger LOGGER = LoggerFactory.getLogger(UserRest.class);

  public UserRest() {
    UserRepository userRepo = new UserMemoryDatabaseAdapter();
    userFacade = new UserService(userRepo);
  }

  public Integer post(Map<String, String> values) {
    try {
      User user = new User(values.get("name"), values.get("email"), values.get("password"));
      userFacade.saveUser(user);
    } catch (Exception e) {
      LOGGER.error(e.getMessage());
      return 400;
    }
    return 201;
  }

  public Integer get() {
    List<User> users = userFacade.getUsers();
    users.stream().forEach(System.out::println);

    return 200;
  }

}
