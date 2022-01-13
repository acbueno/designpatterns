package br.com.acbueno.designpatters.bridge.converter.employees;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employees {

  protected String name;
  protected Integer age;
  protected Double salary;

}
