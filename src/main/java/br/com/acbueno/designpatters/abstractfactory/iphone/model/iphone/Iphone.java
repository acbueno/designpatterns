package br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract.CountryRulesAbstractFactory;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Iphone {

  private static final Logger LOGGER = LoggerFactory.getLogger(Iphone.class);
  CountryRulesAbstractFactory rules;

  public abstract void getHardware();

  public void assemble() {
    LOGGER.info("Montando todos o hardware");
  }

  public void certifcates() {
    LOGGER.info("Testando todos os certicados");
    LOGGER.info(rules.getCertifactes().applyCertifcation());
  }

  public void pack() {
    LOGGER.info("Empacontando dispositivo");
    LOGGER.info(rules.getPacking().pack());
  }

}
