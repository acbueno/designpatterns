package br.com.acbueno.designpatters.builder.car.director.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

@Getter
public class Engine {

  private static final Logger LOGGER = LoggerFactory.getLogger(Engine.class);
  private final double volume;
  private double milage;
  private boolean started;

  public Engine(double volume, double milage) {
    this.volume = volume;
    this.milage = milage;
  }

  public void on() {
    started = true;
  }

  public void off() {
    started = false;
  }

 public void go(double milage) {
   if(started) {
     this.milage +=milage;
   } else {
     LOGGER.error("Ligue o motor primeiro");
   }
 }

}
