package br.com.acbueno.designpatters.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Setter;

@Setter
public class Originator {

  private static final Logger LOGGER = LoggerFactory.getLogger(Originator.class);
  private String state;

  public Memento save() {
    LOGGER.info("Originator: Setting state to " + state);
    return new Memento(state);
  }

public void restore(Memento memento) {
  this.state = memento.getState();
  LOGGER.info("Originator: State after restoring from Memento: " + state);
}

}
