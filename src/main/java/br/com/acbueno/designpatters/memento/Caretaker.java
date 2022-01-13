package br.com.acbueno.designpatters.memento;

import java.util.ArrayList;

public class Caretaker {

  private ArrayList<Memento> mementos = new ArrayList<>();


  public void addMemento(Memento memento) {
    mementos.add(memento);
  }

  public Memento getMemento() {
    return mementos.get(1);
  }

}
