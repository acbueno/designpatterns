package br.com.acbueno.designpatters.abstractfactory.iphone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.abstractfactory.iphone.factory.Iphone11Factory;
import br.com.acbueno.designpatters.abstractfactory.iphone.factory.IphoneFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.factory.IphoneXFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract.BrazilianRulesAbstractFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract.CountryRulesAbstractFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone.Iphone;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
    IphoneFactory getXFactory = new IphoneXFactory(rules);
    IphoneFactory get11Factory = new Iphone11Factory(rules);

    LOGGER.info("### Fabricando um Iphone X");
    Iphone iphone = getXFactory.orderIphone("standard");
    LOGGER.info(iphone.toString());

    LOGGER.info("\n\n### Fabricando um Iphone 11 HighEnd");
    Iphone iphone2 = get11Factory.orderIphone("highEnd");
    LOGGER.info(iphone2.toString());
  }

}
