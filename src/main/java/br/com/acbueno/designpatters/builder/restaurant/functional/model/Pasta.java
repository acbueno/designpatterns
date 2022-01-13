package br.com.acbueno.designpatters.builder.restaurant.functional.model;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.ToString;
import br.com.acbueno.designpatters.builder.restaurant.fluent.model.Size;

@Getter
@ToString
public class Pasta {

  final private List<String> toppings;
  final private List<String> sauces;
  final private Size size;
  final private boolean cheese;
  final private boolean peper;

  private Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
    this.toppings = toppings;
    this.sauces = sauces;
    this.size = size;
    this.cheese = cheese;
    this.peper = pepper;
  }

  public static class Builder {
    protected Size size;

    protected List<String> toppings;
    protected List<String> sacues;
    protected boolean cheese;
    protected boolean pepper;

    public Builder(Size size) {
      this.size = size;
    }

    public Builder withSauces(String... sauces) {
      this.sacues = Arrays.asList(sauces);
      return this;
    }

    public Builder withToppings(String... toppings) {
      this.toppings = Arrays.asList(toppings);
      return this;
    }

    public Builder withCheese() {
      this.cheese = true;
      return this;
    }

    public Builder withPepper() {
      this.pepper = true;
      return this;
    }

    public Pasta build() {
      return new Pasta(toppings, sacues, size, cheese, pepper);
    }

  }

}
