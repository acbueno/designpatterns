package br.com.acbueno.designpatters.observer.party.observers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Friend implements Observer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Friend.class);

  public void sendGift() {
    LOGGER.info("Look, I bough your favorite beer!");
  }

  @Override
  public void update(boolean status) {
   if(status) {
     sendGift();
   } else {
     LOGGER.info("Sleep...");
   }

  }

}
