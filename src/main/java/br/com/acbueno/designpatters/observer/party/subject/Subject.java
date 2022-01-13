package br.com.acbueno.designpatters.observer.party.subject;

import java.util.ArrayList;
import java.util.List;

import br.com.acbueno.designpatters.observer.party.observers.Observer;

public abstract class Subject {

  private List<Observer> observers = new ArrayList<>();

  public void add(Observer observer) {
    observers.add(observer);
  }

  public void notifyObservers(boolean status) {
    for (Observer observer : observers) {
       observer.update(status);
    }
  }

}
