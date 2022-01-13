package br.com.acbueno.designpatters.builder.car.director.builders;

import br.com.acbueno.designpatters.builder.car.director.model.CarType;
import br.com.acbueno.designpatters.builder.car.director.model.Engine;
import br.com.acbueno.designpatters.builder.car.director.model.GpsNavigator;
import br.com.acbueno.designpatters.builder.car.director.model.Manual;
import br.com.acbueno.designpatters.builder.car.director.model.Transmission;
import br.com.acbueno.designpatters.builder.car.director.model.TripComputer;

public class CarManualBuilder implements Builder {

  private CarType carType;
  private int seats;
  private Engine engine;
  private Transmission transmission;
  private TripComputer tripComputer;
  private GpsNavigator gpsNavigator;

  @Override
  public void setCarType(CarType carType) {
    this.carType = carType;

  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;

  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;

  }

  @Override
  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;

  }

  @Override
  public void setGpsNavigator(GpsNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public Manual getResutl() {
    return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
  }

}
