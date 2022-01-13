package br.com.acbueno.designpatters.mediator.model;

import br.com.acbueno.designpatters.mediator.meditator.Mediator;

public class PortuguenseUser extends User {

  public PortuguenseUser(String name, Mediator mediator) {
    super(name, Language.PORTUGUES, mediator);

  }

}
