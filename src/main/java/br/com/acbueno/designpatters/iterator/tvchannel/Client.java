package br.com.acbueno.designpatters.iterator.tvchannel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    TV tv = new TV();
    tv.searchAvaiableChannels();
    for(Integer channel: tv) {
      LOGGER.info(String.format("Zapping at channel #%d", channel));
    }
  }

}
