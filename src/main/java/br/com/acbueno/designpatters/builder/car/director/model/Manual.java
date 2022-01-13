package br.com.acbueno.designpatters.builder.car.director.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Manual {

  private final CarType carType;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;
  private final TripComputer tripComputer;
  private final GpsNavigator gpsNavigator;

  public String print() {
    String info = "";
    info += "Tipo de carro: " + carType + "\n";
    info += "Quantidade de assento: " + seats + "\n";
    info += "Litros do Motor" + engine.getVolume() + "; mielage - " + engine.getMilage();
    info += "Transmissão: " + transmission;

    if (this.tripComputer != null) {
      info += "Computador de bordo: Ativado" + "\n";
    } else {
      info += "Computador de bordo: N/A" + "\n";
    }

    if (this.gpsNavigator != null) {
      info += "GPS Navigator:  Ativado" + "\n";
    } else {
      info += "GPS Navigator: Desativado " + "\n";
    }
    return info;

  }

}
