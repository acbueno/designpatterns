package br.com.acbueno.designpatters.mediator.meditator;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.mediator.model.User;

public abstract class Mediator {

  private static final Logger LOGGER = LoggerFactory.getLogger(Mediator.class);
  protected Map<String, User> users = new HashMap<>();

  public void addUser(User user) {
    LOGGER.info(String.format("'%s' is in the room", user.getName()));
    users.put(user.getName(), user);
  }

  public void removeUser(User user) {
    LOGGER.info(String.format("'%s is out", user.getName()));
  }

  public void sendMessage(String message, User to, User from) {

    if(to == null) {
      for(User user: users.values()) {
        if(user.getName() == from.getName()) {
          continue;
        }
         user.receiveMessage(getMessage(message, user, from), from);
      }
    } else {
      to.receiveMessage(getMessage(message, to, from), from);
    }
  }

  protected abstract String getMessage(String message, User to, User from);

}
