package br.com.acbueno.designpatters.abstractfactory.app.factory;

import br.com.acbueno.designpatters.abstractfactory.app.services.CarEjbService;
import br.com.acbueno.designpatters.abstractfactory.app.services.CarService;
import br.com.acbueno.designpatters.abstractfactory.app.services.UserEjbService;
import br.com.acbueno.designpatters.abstractfactory.app.services.UserService;

public class EjbAbstractFactory implements ServicesAbstractFactory {

  @Override
  public UserService getUserService() {
    return new UserEjbService();
  }

  @Override
  public CarService getCarService() {
    return new CarEjbService();
  }

}
