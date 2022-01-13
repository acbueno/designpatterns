package br.com.acbueno.designpatters.chain.middleware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThrottlingMiddleware extends Middleware {

  private static final Logger LOGGER = LoggerFactory.getLogger(ThrottlingMiddleware.class);
  private int requestPerMinute;
  private int request;
  private long currentTime;

  public ThrottlingMiddleware(int requestPerMinute) {
    this.requestPerMinute = requestPerMinute;
    this.currentTime = System.currentTimeMillis();
  }

  @Override
  public boolean check(String email, String password) {
    if (System.currentTimeMillis() > currentTime + 60_000) {
      request = 0;
      currentTime = System.currentTimeMillis();
    }

    request++;

    if (request > requestPerMinute) {
      LOGGER.info("Request limit exceeded!");
      Thread.currentThread().stop();
    }
    return checkNext(email, password);
  }

}
