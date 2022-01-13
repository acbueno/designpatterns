package br.com.acbueno.designpatters.proxy.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class User {

  private String name;
  private Long accountNumber;
  private String password;
  private Double balance;

}
