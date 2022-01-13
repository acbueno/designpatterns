package br.com.acbueno.designpatters.observer.numbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {

    Subject subject = new Subject();

    new HexaObserver(subject);
    new OctalObserver(subject);
    new BinaryObserver(subject);

    LOGGER.info("First state change: 15");
    subject.setState(15);
    LOGGER.info("Second stante change: 10");
    subject.setState(10);
  }

}
