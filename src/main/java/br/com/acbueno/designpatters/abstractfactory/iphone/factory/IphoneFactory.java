package br.com.acbueno.designpatters.abstractfactory.iphone.factory;

import br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract.CountryRulesAbstractFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone.Iphone;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public abstract class IphoneFactory {
  CountryRulesAbstractFactory rules;

  public Iphone orderIphone(String level) {
    Iphone device = null;
    device = createIphone(level);
    device.getHardware();
    device.assemble();
    device.pack();

    return device;
  }

  protected abstract Iphone createIphone(String level);

}
