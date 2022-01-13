package br.com.acbueno.designpatters.prototype.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Address implements Cloneable {

  private String street;
  private Integer number;


  public Address(String street, Integer number) {
   super();
   this.street = street;
   this.number = number;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}
