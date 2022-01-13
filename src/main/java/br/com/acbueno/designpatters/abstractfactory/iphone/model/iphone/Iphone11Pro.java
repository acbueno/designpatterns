package br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract.CountryRulesAbstractFactory;

public class Iphone11Pro extends Iphone {

  private static final Logger LOGGER = LoggerFactory.getLogger(Iphone11Pro.class);

  public Iphone11Pro(CountryRulesAbstractFactory rules) {
    super(rules);
  }

  @Override
  public void getHardware() {
    LOGGER.info("Hardware List");
    LOGGER.info("\t 6.5in Screen");
    LOGGER.info("\t - A13 Chipset");
    LOGGER.info("\t 4Gb");
    LOGGER.info("\t 512Gb Memory");
  }

}
