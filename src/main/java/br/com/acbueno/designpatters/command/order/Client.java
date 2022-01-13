package br.com.acbueno.designpatters.command.order;

import br.com.acbueno.designpatters.command.order.commands.Broker;
import br.com.acbueno.designpatters.command.order.commands.BuyStock;
import br.com.acbueno.designpatters.command.order.commands.SellStock;
import br.com.acbueno.designpatters.command.order.request.Stock;

public class Client {

  public static void main(String[] args) {
    Stock abcStock = new Stock();

    BuyStock buyStock = new BuyStock(abcStock);
    SellStock sellStock = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyStock);
    broker.takeOrder(sellStock);

    broker.placeOrders();

  }

}
