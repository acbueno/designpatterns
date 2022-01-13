package br.com.acbueno.designpatters.templatemethod.sales.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Buyer {

  private String name;
  private Integer distance;
  private boolean specialClient;

}
