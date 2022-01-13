package br.com.acbueno.designpatters.strategy.payment;

import br.com.acbueno.designpatters.strategy.payment.model.Item;
import br.com.acbueno.designpatters.strategy.payment.serives.ShoppingCart;
import br.com.acbueno.designpatters.strategy.payment.strategy.CreditCardStrategy;
import br.com.acbueno.designpatters.strategy.payment.strategy.PaypalStrategy;

public class Client {

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    Item item1 = new Item("Fogao", 200);
    Item item2 = new Item("TV", 1000);

    cart.addItem(item1);
    cart.addItem(item2);

    cart.pay(new PaypalStrategy("email@email.com", "1234"));
    cart.pay(new CreditCardStrategy("Rambo","1234567890123456", "786", "12/15"));
  }

}
