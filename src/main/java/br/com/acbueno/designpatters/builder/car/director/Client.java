package br.com.acbueno.designpatters.builder.car.director;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.builder.car.director.builders.CarBuilder;
import br.com.acbueno.designpatters.builder.car.director.builders.CarManualBuilder;
import br.com.acbueno.designpatters.builder.car.director.director.Director;
import br.com.acbueno.designpatters.builder.car.director.model.Car;
import br.com.acbueno.designpatters.builder.car.director.model.Manual;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {

    Director director = new Director();
    CarBuilder build = new CarBuilder();
    director.buildSportCar(build);
    Car car = build.getResult();
    LOGGER.info("Car built:\n" + car.getCarType());

    CarManualBuilder carManualBuilder = new CarManualBuilder();
    director.buildSportCar(carManualBuilder);

    Manual carManual = carManualBuilder.getResutl();
    LOGGER.info("\nCar manual built:\n" + carManual.print());

  }

}
