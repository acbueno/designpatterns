package br.com.acbueno.designpatters.objectpool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    var pool = new OliphauntPool();
    var oliphaunt1 = pool.checkOut();
    LOGGER.info(pool.toString());
    var oliphaunt2 = pool.checkOut();
    LOGGER.info(pool.toString());
    var oliphaunt3 = pool.checkOut();
    LOGGER.info(pool.toString());
    pool.checkIn(oliphaunt1);
    LOGGER.info(pool.toString());
    pool.checkIn(oliphaunt2);
    LOGGER.info(pool.toString());
    var oliphaunt4 = pool.checkOut();
    LOGGER.info(pool.toString());
    var oliphaunt5 = pool.checkOut();
    LOGGER.info(pool.toString());

  }

}
