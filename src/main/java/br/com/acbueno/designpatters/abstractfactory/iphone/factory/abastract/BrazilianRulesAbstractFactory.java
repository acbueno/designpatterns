package br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract;

import br.com.acbueno.designpatters.abstractfactory.iphone.model.certificate.BrazilianCerticate;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.certificate.Certifcate;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.packing.BrazilianPacking;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

  @Override
  public Certifcate getCertifactes() {
    return new BrazilianCerticate();
  }

  @Override
  public Packing getPacking() {
    return new BrazilianPacking();
  }

}
