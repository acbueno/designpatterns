package br.com.acbueno.designpatters.mediator.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.mediator.meditator.Mediator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class User {

  private static final Logger LOGGER = LoggerFactory.getLogger(User.class);
  final protected String name;
  final protected Language language;
  final protected Mediator mediator;

  public void sendMessage(String message) {
    this.sendMessage(message, null);
  }

  public void sendMessage(String message, User to) {
    String receiverName = to != null ? to.getName() : "ALL";
    LOGGER.info(String.format("'%s is sending the message '%s to '%s", name, message, receiverName));
    mediator.sendMessage(message, to, this);
  }

  public void receiveMessage(String message, User from) {
    LOGGER.info(String.format("'%s has recieved the message '%s from '%s'", name, message, from.getName()));
  }

}
