package br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract.CountryRulesAbstractFactory;

public class IphoneXsMax extends Iphone {

  private static final Logger LOGGER = LoggerFactory.getLogger(IphoneXsMax.class);

  public IphoneXsMax(CountryRulesAbstractFactory rules) {
    super(rules);
  }

  @Override
  public void getHardware() {
    LOGGER.info("Hardware list");
    LOGGER.info("\t 6.5in Screen");
    LOGGER.info("\t A12 Chipset");
    LOGGER.info("\t 4Gb RAM");
    LOGGER.info("\t 512Gb Memory");
  }

}
