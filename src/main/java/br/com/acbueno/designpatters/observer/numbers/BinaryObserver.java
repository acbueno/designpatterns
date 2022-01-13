package br.com.acbueno.designpatters.observer.numbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryObserver extends Observer {

  private static final Logger LOGGER = LoggerFactory.getLogger(BinaryObserver.class);

  public BinaryObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    LOGGER.info("Binary String: " + Integer.toBinaryString(subject.getState()));
  }

}
