package br.com.acbueno.designpatters.observer.numbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HexaObserver extends Observer {

  private static final Logger LOGGER = LoggerFactory.getLogger(HexaObserver.class);

  public HexaObserver(Subject subject) {
   this.subject = subject;
   this.subject.attach(this);
  }

  @Override
  public void update() {
    LOGGER.info("Hexa String: " + Integer.toHexString(subject.getState()));
  }

}
