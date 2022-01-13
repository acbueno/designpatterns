package br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract;

import br.com.acbueno.designpatters.abstractfactory.iphone.model.certificate.Certifcate;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.certificate.USCerticate;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.packing.Packing;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.packing.USPacking;

public class USRulesAbastractFactory implements CountryRulesAbstractFactory {

  @Override
  public Certifcate getCertifactes() {
    return new USCerticate();
  }

  @Override
  public Packing getPacking() {
    return new USPacking();
  }

}
