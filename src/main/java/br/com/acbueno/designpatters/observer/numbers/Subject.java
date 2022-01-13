package br.com.acbueno.designpatters.observer.numbers;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Subject {

  private List<Observer> observers = new ArrayList<>();

  @Getter
  private int state;

  public void setState(int state) {
    this.state = state;
    notifyAllObjservers();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void notifyAllObjservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

}
