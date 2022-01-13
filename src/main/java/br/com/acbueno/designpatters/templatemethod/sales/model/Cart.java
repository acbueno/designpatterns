package br.com.acbueno.designpatters.templatemethod.sales.model;

import java.util.List;
import lombok.Getter;

@Getter
public class Cart {

  private Buyer buyer;
  private List<Product> items;

  public Cart(Buyer buyer, List<Product> items) {
    this.buyer = buyer;
    this.items = items;
  }

}
