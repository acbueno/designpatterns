package br.com.acbueno.designpatters.abstractfactory.iphone.factory;

import br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract.CountryRulesAbstractFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone.Iphone;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone.IphoneX;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone.IphoneXsMax;

public class IphoneXFactory extends IphoneFactory {

  public IphoneXFactory(CountryRulesAbstractFactory rules) {
    super(rules);
  }

  @Override
  protected Iphone createIphone(String level) {
    if(level.equals("standard")) {
      return new IphoneX(rules);
    } else if(level.equals("highEnd")) {
      return new IphoneXsMax(rules);
    } else  return null;
  }

}
