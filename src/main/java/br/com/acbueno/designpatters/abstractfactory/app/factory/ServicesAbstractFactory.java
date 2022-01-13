package br.com.acbueno.designpatters.abstractfactory.app.factory;

import br.com.acbueno.designpatters.abstractfactory.app.services.CarService;
import br.com.acbueno.designpatters.abstractfactory.app.services.UserService;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.CardServices;

public interface ServicesAbstractFactory {

  UserService getUserService();
  CarService getCarService();

}
