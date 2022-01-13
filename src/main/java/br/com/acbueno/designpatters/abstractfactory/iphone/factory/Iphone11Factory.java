package br.com.acbueno.designpatters.abstractfactory.iphone.factory;

import br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract.CountryRulesAbstractFactory;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone.Iphone;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone.Iphone11;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.iphone.Iphone11Pro;

public class Iphone11Factory extends IphoneFactory {

  public Iphone11Factory(CountryRulesAbstractFactory rules) {
    super(rules);
  }

  @Override
  protected Iphone createIphone(String level) {
    if (level.equals("standard")) {
      return new Iphone11(rules);
    } else if (level.equals("highEnd")) {
      return new Iphone11Pro(rules);
    } else
      return null;
  }

}