package br.com.acbueno.designpatters.chain.billdispenser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

  private static final Logger  LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    Dispenser dispenser = new Dispenser();
    LOGGER.info("Withdraing $230");
    dispenser.withDraw(230);
    LOGGER.info("Withdraing $1589");

    Dispenser customDispenser = new Dispenser(new Bill(256), new Bill(128),
        new Bill(64), new Bill(32),
        new Bill(16), new Bill(4),
        new Bill(2), new Bill(1));

    LOGGER.info("Withdrawing $230");
    customDispenser.withDraw(230);
    LOGGER.info("Withdraing $1589");
    customDispenser.withDraw(1589);
  }

}
