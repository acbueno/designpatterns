package br.com.acbueno.designpatters.abstractfactory.app;

import br.com.acbueno.designpatters.abstractfactory.app.factory.EjbAbstractFactory;
import br.com.acbueno.designpatters.abstractfactory.app.factory.ServicesAbstractFactory;
import br.com.acbueno.designpatters.abstractfactory.app.services.CarService;
import br.com.acbueno.designpatters.abstractfactory.app.services.UserService;

public class Client {

  public static void main(String[] args) {
    ServicesAbstractFactory factory = new EjbAbstractFactory();

    UserService userService = factory.getUserService();
    userService.save("Rambo");
    userService.delete(5);

    CarService carService = factory.getCarService();
    carService.save("Versa");
    carService.save("Sentra");
  }

}
