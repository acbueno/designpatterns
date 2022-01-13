package br.com.acbueno.designpatters.prototype.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User implements Cloneable {

  private String name;
  private Integer age;
  private Address address;

  public User(String name, Integer age, Address address) {
    super();
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public User clone() throws CloneNotSupportedException {
    User cloneUser = (User) super.clone();
    cloneUser.address = (Address) cloneUser.address.clone();

    return cloneUser;
  }

}
