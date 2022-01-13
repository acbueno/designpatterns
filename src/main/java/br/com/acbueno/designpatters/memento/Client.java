package br.com.acbueno.designpatters.memento;

public class Client {

  public static void main(String[] args) {

    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();

    originator.setState("State 1");
    originator.setState("State 2");

    caretaker.addMemento(originator.save());
    originator.setState("State 3");
    caretaker.addMemento(originator.save());
    originator.setState("State 4");
    originator.restore(caretaker.getMemento());

  }

}
