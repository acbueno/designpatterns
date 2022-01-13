package br.com.acbueno.designpatters.chain.middleware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserExistsMiddleware extends Middleware{

  private static final Logger LOGGER = LoggerFactory.getLogger(Middleware.class);
  private Server server;

  public UserExistsMiddleware(Server server) {
    this.server = server;
  }

  @Override
  public boolean check(String email, String password) {
    if(!server.hasEmail(email)) {
      LOGGER.info("This email is not registered!");
      return false;
    }
    if(!server.isValidPassword(email, password)) {
      LOGGER.info("Wrong password!");

      return false;
    }
    return checkNext(email, password);
  }

}
