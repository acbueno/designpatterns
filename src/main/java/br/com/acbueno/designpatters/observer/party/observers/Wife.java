package br.com.acbueno.designpatters.observer.party.observers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wife implements Observer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Wife.class);

  public void partTime() {
    LOGGER.info("Let's Party!: D");
  }

  @Override
  public void update(boolean status) {
    if (status) {
      partTime();
    } else {
      LOGGER.info("Hold!");
    }
  }

}
