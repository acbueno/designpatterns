package br.com.acbueno.designpatters.builder.car.director.builders;

import br.com.acbueno.designpatters.builder.car.director.model.CarType;
import br.com.acbueno.designpatters.builder.car.director.model.Engine;
import br.com.acbueno.designpatters.builder.car.director.model.GpsNavigator;
import br.com.acbueno.designpatters.builder.car.director.model.Transmission;
import br.com.acbueno.designpatters.builder.car.director.model.TripComputer;

public interface Builder {

  void setCarType(CarType carType);

  void setSeats(int seats);

  void setEngine(Engine engine);

  void setTransmission(Transmission transmission);

  void setTripComputer(TripComputer tripComputer);

  void setGpsNavigator(GpsNavigator gpsNavigator);

}
