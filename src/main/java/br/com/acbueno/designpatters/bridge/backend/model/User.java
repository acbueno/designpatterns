package br.com.acbueno.designpatters.bridge.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class User {

  private String name;
  private String email;
  private String password;

}
