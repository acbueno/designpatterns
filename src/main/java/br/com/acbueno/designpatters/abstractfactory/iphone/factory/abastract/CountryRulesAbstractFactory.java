package br.com.acbueno.designpatters.abstractfactory.iphone.factory.abastract;

import br.com.acbueno.designpatters.abstractfactory.iphone.model.certificate.Certifcate;
import br.com.acbueno.designpatters.abstractfactory.iphone.model.packing.Packing;

public interface CountryRulesAbstractFactory {

  Certifcate getCertifactes();

  Packing getPacking();

}
