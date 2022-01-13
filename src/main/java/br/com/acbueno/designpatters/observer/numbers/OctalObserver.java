package br.com.acbueno.designpatters.observer.numbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OctalObserver extends Observer {

  private static final Logger LOGGER = LoggerFactory.getLogger(OctalObserver.class);

  public OctalObserver(Subject subject) {
   this.subject = subject;
   this.subject.attach(this);
  }

  @Override
  public void update() {
    LOGGER.info(" Octal String: " + Integer.toOctalString(subject.getState()));
  }

}
