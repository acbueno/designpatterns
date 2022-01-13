package br.com.acbueno.designpatters.builder.restaurant.fluent.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pasta {

  protected List<String> toppings;
  protected List<String> sauces;
  protected Size size;
  protected boolean cheese;
  protected boolean pepper;

}
