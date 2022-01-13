package br.com.acbueno.designpatters.abstractfactory.iphone.model.packing;

public class USPacking implements Packing {

  @Override
  public String pack() {
    return "\t - Packing in English";
  }

}
