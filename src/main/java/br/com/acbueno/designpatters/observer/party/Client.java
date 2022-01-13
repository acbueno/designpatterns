package br.com.acbueno.designpatters.observer.party;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.observer.party.observers.Friend;
import br.com.acbueno.designpatters.observer.party.observers.Wife;
import br.com.acbueno.designpatters.observer.party.subject.Doorman;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {

    Doorman doorman = new Doorman();
    doorman.add(new Wife());
    doorman.add(new Friend());
    LOGGER.info("Husband is comming");
    doorman.setStatus(true);

  }

}
