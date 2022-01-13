package br.com.acbueno.designpatters.mediator.meditator;

import br.com.acbueno.designpatters.mediator.model.User;

public class ChatMediator extends Mediator {

  @Override
  protected String getMessage(String message, User to, User from) {
    return message;
  }

}
