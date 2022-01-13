package br.com.acbueno.designpatters.strategy.payment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Item {

  private String upcCode;
  private int price;

}
