package br.com.acbueno.designpatters.builder.car.director.model;

import lombok.Getter;

@Getter
public class GpsNavigator {

  private String route;

  public GpsNavigator() {
    this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
  }

  public GpsNavigator(String manualRoute) {
    this.route = manualRoute;
  }

}
