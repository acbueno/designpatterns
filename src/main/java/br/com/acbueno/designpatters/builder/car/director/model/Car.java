package br.com.acbueno.designpatters.builder.car.director.model;

import lombok.Getter;

@Getter
public class Car {

  private final CarType carType;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;
  private final TripComputer tripComputer;
  private final GpsNavigator gpsNavigator;
  private double fuel = 0;

  public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GpsNavigator gpsNavigator) {
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
    this.gpsNavigator = gpsNavigator;
    this.tripComputer = tripComputer;
    if (this.tripComputer != null) {
      this.tripComputer.setCar(this);
    }
  }


}
