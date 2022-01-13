package br.com.acbueno.designpatters.builder.car.director.director;

import br.com.acbueno.designpatters.builder.car.director.builders.Builder;
import br.com.acbueno.designpatters.builder.car.director.model.CarType;
import br.com.acbueno.designpatters.builder.car.director.model.Engine;
import br.com.acbueno.designpatters.builder.car.director.model.GpsNavigator;
import br.com.acbueno.designpatters.builder.car.director.model.Transmission;
import br.com.acbueno.designpatters.builder.car.director.model.TripComputer;

public class Director {

  public void buildSportCar(Builder builder) {
    builder.setCarType(CarType.SPORT_CAR);
    builder.setSeats(2);
    builder.setEngine(new Engine(3.0, 0));
    builder.setTripComputer(new TripComputer());
    builder.setGpsNavigator(new GpsNavigator());
    builder.setTransmission(Transmission.MANUAL);
  }

  public void buildCityCar(Builder builder) {
    builder.setCarType(CarType.CITY_CAR);
    builder.setEngine(new Engine(1.2, 0));
    builder.setSeats(4);
    builder.setGpsNavigator(new GpsNavigator());
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setTripComputer(new TripComputer());
  }

  public void buildSuv(Builder builder) {
    builder.setCarType(CarType.SUV);
    builder.setEngine(new Engine(2.5, 0));
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setSeats(5);
    builder.setGpsNavigator(new GpsNavigator());
    builder.setTripComputer(new TripComputer());
  }

}
