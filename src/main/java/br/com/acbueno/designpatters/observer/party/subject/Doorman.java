package br.com.acbueno.designpatters.observer.party.subject;

import lombok.Getter;

@Getter
public class Doorman extends Subject {

  private boolean status = false;

  public void setStatus(boolean newStatus) {
    this.status = newStatus;
    notifyObservers(newStatus);
  }

}
