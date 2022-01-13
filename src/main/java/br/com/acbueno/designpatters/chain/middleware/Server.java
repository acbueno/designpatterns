package br.com.acbueno.designpatters.chain.middleware;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.Setter;

@Setter
public class Server {

  private Map<String, String> users = new HashMap<>();
  private Middleware middleware;
  private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

  public boolean logIn(String email, String password) {
    if (middleware.check(email, password)) {
      LOGGER.info("Authorization have been successful!");
      return true;
    }
    return false;
  }

  public void register(String email, String password) {
    users.put(email, password);
  }

  public boolean hasEmail(String email) {
    return users.containsKey(email);
  }

  public boolean isValidPassword(String email, String password) {
    return users.get(email).equals(password);
  }

}
