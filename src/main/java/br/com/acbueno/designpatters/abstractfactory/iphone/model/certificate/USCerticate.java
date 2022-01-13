package br.com.acbueno.designpatters.abstractfactory.iphone.model.certificate;

public class USCerticate implements Certifcate {

  @Override
  public String applyCertifcation() {
    return "\t Calibrating US rules";
  }

}
