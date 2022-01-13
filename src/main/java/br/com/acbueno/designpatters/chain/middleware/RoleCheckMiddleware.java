package br.com.acbueno.designpatters.chain.middleware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoleCheckMiddleware extends Middleware {

  private static final Logger LOGGER = LoggerFactory.getLogger(RoleCheckMiddleware.class);

  @Override
  public boolean check(String email, String password) {
    if(email.equals("admin@example.com")) {
      LOGGER.info("Hello, admin!" );
      return true;
    }
    LOGGER.info("Hello, user");
    return checkNext(email, password);
  }

}
