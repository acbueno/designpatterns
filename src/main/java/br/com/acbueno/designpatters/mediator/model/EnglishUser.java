package br.com.acbueno.designpatters.mediator.model;

import br.com.acbueno.designpatters.mediator.meditator.Mediator;

public class EnglishUser extends User {

  public EnglishUser(String name, Mediator mediator) {
    super(name, Language.ENGLISH, mediator);
  }



}
