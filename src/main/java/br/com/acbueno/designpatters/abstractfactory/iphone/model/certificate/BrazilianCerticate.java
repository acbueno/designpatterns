package br.com.acbueno.designpatters.abstractfactory.iphone.model.certificate;

public class BrazilianCerticate implements Certifcate {

  @Override
  public String applyCertifcation() {
    return "\t Calibrando regras Brasileiras\n\t- Padrão Anatel";
  }

}
